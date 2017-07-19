/**
 * �ǰ�
 */
create table OPINION (
	nickname varchar2(60) not null,			-- �г���
	bias_id number(4) not null,				-- ����ID
	content varchar2(600) not null			-- ����
);



alter table OPINION 
add constraint FK_OPINION_NICKNAME foreign key (nickname)
references MEMBER(nickname);

alter table OPINION 
add constraint FK_OPINION_BIAS_ID foreign key (bias_id)
references BIAS(bias_id);

alter table OPINION 
add constraint PK_OPINION_PK primary key (nickname, bias_id);
