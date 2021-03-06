package utillity;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import work.model.dao.DialogDao;
import work.model.dto.Dialog;

@ServerEndpoint("/broadcasting")
public class Broadsocket {
	private DialogDao dialogDao = new DialogDao();
	private static Set<Session> clients = Collections
			.synchronizedSet(new HashSet<Session>());

	@OnMessage
	public void onMessage(String message, Session session) throws IOException {
		System.out.println(message);
		storeMessage(message);
		synchronized (clients) {
			// Iterate over the connected sessions
			// and broadcast the received message
			for (Session client : clients) {
				if (!client.equals(session)) {
					client.getBasicRemote().sendText(message);
				}
			}
		}
	}

	@OnOpen
	public void onOpen(Session session) {
		// Add session to the connected sessions set
		System.out.println(session);
		clients.add(session);
	}

	@OnClose
	public void onClose(Session session) {
		// Remove session from the connected sessions set
		clients.remove(session);
	}
	
	public void storeMessage(String message){
		String []element = message.split("`");
		String teamName = element[0];
		String channelName = element[1];
		String nickname = element[2];
		@SuppressWarnings("unused")
		String time = element[3];
		String content = element[4];
		/*for(String e: element){
			System.out.println(e);
		}*/
		dialogDao.insert(new Dialog(channelName, teamName, content, nickname,null));
	}
}