
/**
 * 경향
 */
create table BIAS (
	opinion_id varchar2(60) not null,			-- 투표ID
	bias_name varchar2(60) 						-- 경향명
);


alter table BIAS 
add constraint PK_BIAS_BIAS_NAME primary key (bias_name);
