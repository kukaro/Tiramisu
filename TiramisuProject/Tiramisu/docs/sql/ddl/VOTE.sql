/**
 * ��ǥ
 */
create table VOTE (
	vote_id number(4),				-- ID
	nickname varchar2(60) not null,		-- ��ǥ��
	team_name varchar2(60) not null		-- ����
);

alter table VOTE 
add constraint PK_VOTE_VOTE_ID primary key (vote_id);

alter table VOTE 
add constraint FK_VOTE_TEAM_NAME foreign key (team_name)
references TEAM(team_name);

create sequence seq_VOTE
start with 1 increment by 1 ;

ALTER SEQUENCE seq_VOTE INCREMENT BY 1;