/**
 * 채널
 */
create table CHANNEL (	
	channel_name varchar2(60) not null, 	-- 채널명
	team_name varchar2(60) not null			-- 팀명
);

alter table CHANNEL 
add constraint FK_CHANNEL_TEAM_NAME foreign key (team_name)
references TEAM(team_name) ON DELETE CASCADE;

alter table CHANNEL
add constraint PK_CHANNEL_PK primary key (team_name, channel_name);
