/**
 * ����
 */
create table IMAGE (
	image_id number(4),					-- ID
	file_name archar2(600) not null 	-- ���ϸ�
);

alter table IMAGE 
add constraint PK_IMAGE_IMAGE_ID primary key (image_id);


create sequence seq_IMAGE
start with 1 increment by 1 ;

ALTER SEQUENCE seq_IMAGE INCREMENT BY 1;