/**
 * 다이얼로그
 */
create table DIALOG (
	dialog_id varchar2(60),						-- ID
	content varchar2(900) not null,				-- 내용
	writer varchar2(60) not null,				-- 작성자
	writer_data DATE not null,					-- 작성일
	file_id varchar2(60) default null			-- 파일ID
);

alter table DIALOG 
add constraint PK_DIALOG_DIALOG_ID primary key (dialog_id);

alter table DIALOG 
add constraint FK_DIALOG_WRITER foreign key (writer)
references MEMBER(nickname); 

alter table DIALOG 
add constraint FK_DIALOG_FILE foreign key (file_id)
references FILES(file_id); 