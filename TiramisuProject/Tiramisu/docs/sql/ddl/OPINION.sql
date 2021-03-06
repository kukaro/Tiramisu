/**
 * 의견
 */
create table OPINION (
	nickname varchar2(60) not null,			-- 닉네임
	bias_id number(4) not null,				-- 경향ID
	content varchar2(600) not null			-- 내용
);


alter table OPINION 
add constraint FK_OPINION_NICKNAME foreign key (nickname)
references MEMBER(nickname) ON DELETE CASCADE;

alter table OPINION 
add constraint FK_OPINION_BIAS_ID foreign key (bias_id)
references BIAS(bias_id) ON DELETE CASCADE;

alter table OPINION 
add constraint PK_OPINION_PK primary key (nickname, bias_id);
