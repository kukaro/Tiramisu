/*다이얼로그
 * ID(dialog_id)
 * 채널ID(channel_id)
 * 내용(content)
 * 작성자(writer)
 * 작성일(write_date)
 * 파일ID(file_id)
 */

insert into DIALOG 
values(seq_DIALOG.NEXTVAL, 1,'이거 데이터인가?', '태정', sysdate, null);

insert into DIALOG 
values(seq_DIALOG.NEXTVAL, 2, '파이썬 예습하도록 하죠.', '태정', sysdate, null );

insert into DIALOG 
values(seq_DIALOG.NEXTVAL, 3,  '여긴 알릴것만 적으세요','다영', sysdate, null);

insert into DIALOG
values(seq_DIALOG.NEXTVAL, 4, '자료입니다.', '형건', sysdate, 7);




error check

primary key check : work

insert into DIALOG
values(7, '자료입니다.', '형건', sysdate, 6);

insert into DIALOG
values(null, '자료입니다.', '형건', sysdate, 6);



