<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<script type="text/javascript"
	src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">
	google.charts.load('current', {
		'packages' : [ 'corechart' ]
	});
	google.charts.setOnLoadCallback(drawChart);//도넛차트 
	google.charts.setOnLoadCallback(drawSeriesChart);//버블차트

	function selectHandler(e) {
		alert('The user selected' + PieChart.getSelection().length + ' items.');
	}

	function drawChart() { //도넛차트 Start
		var data = google.visualization.arrayToDataTable([ [ 'Task', '투표수' ],
				[ '보쌈', 15 ], [ '닭발', 7 ], [ '피자', 3 ] ]);

		var options = {
			title : '프로젝트 후 회식을 어디서?',
			pieHole : 0.4,
			fontSize : 15
		};

		var chart = new google.visualization.PieChart(document
				.getElementById('donutchart'));
		chart.draw(data, options);

		//이벤트 핸들러
		google.visualization.events.addListener(chart, 'select', selectHandler);
		function selectHandler(e) {

			document.getElementById("body").innerHTML += '<div id="abc"><div id="popupContact"><form action="#의견처리" id="voteform" method="post" name="voteform"><img id="close" width="25px" height="25px" src="images/x.png" onclick="div_hide()"><h2 id="headH2">의견을 작성해주세요!</h2><hr><input id="name_readonly" name="name" type="text" value="변다영" readonly><select id="bias" name="bias" style="width:82%;padding:10px;margin-top:30px;border:1px solid #ccc;	padding-left:40px;font-size:16px;font-family:raleway"><option value="">선택해주세요</option><option value="보쌈">보쌈</option><option value="닭발">닭발</option><option value="피자">피자</option>	</select><textarea id="opinion" name="opinion" placeholder="Please tell me your voice!"></textarea><a href="javascript:%20check_empty()" id="submit">Send</a></form></div></div>';
			console.log(document.getElementById("body").innerHTML);
			document.getElementById('abc').style.display = "block";
		}
	}//도넛차트 End

	function drawSeriesChart() { //버블차트 Start

		var data = google.visualization.arrayToDataTable([
				[ 'Nickname', 'x축', 'y축', '버블색깔', '버블크기' ],
				[ '김태정', 92.11, 1.67, '컴퓨터공학', 33073 ],
				[ '변다영', 85.05, 1.36, '경영정보학', 40190 ],
				[ '이성민', 60.60, 1.84, '데이터학', 55230 ],
				[ '이형건', 55.42, 2.78, '컴퓨터공학', 24716 ] ]);

		var options = {
			title : '보쌈부서의 ' + '팀원 별 기여도/참여도',
			fontSize : 18,
			/* titleTextStyle : { fontsize : 30}, */
			hAxis : {
				title : 'x축'
			},
			vAxis : {
				title : 'y축'
			},
			bubble : {
				textStyle : {
					fontSize : 15
				}
			}
		};

		var chart = new google.visualization.BubbleChart(document
				.getElementById('series_chart_div'));
		chart.draw(data, options);
	}//버블차트 END
</script>
