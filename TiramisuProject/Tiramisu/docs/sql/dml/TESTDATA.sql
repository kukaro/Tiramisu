



insert into IMAGE 
values(seq_IMAGE.NEXTVAL, 'good.jpg'); --��������

insert into MEMBER 
values('user01', 'ps123', '�λ����ġ��', '�ΰ��', '����', 1);

insert into MEMBER 
values('user02', 'ps234', '�λ����ġ��', '���ƴ�', '�ٿ�', null);

insert into MEMBER 
values('user03', 'ps345', '�λ����ġ��', '�λ��', '����', null);

insert into MEMBER 
values('user04', 'ps345', '�λ����ġ��', '�ؾ��', '����', null);



insert into TEAM 
values('BusanBigData', '�λ�����ͽ��͵�', 'FALSE');

insert into TEAM 
values('SeoulBigData', '��������ͽ��͵�', 'FALSE');

insert into TEAM 
values('GwangjuMachineLearning', '���ָӽŷ��׽��͵�', 'FALSE');

insert into TEAM 
values('IncheonDeepLearning', '��õ�����׽��͵�', 'FALSE');



insert into MESSAGE 
values(seq_MESSAGE.NEXTVAL, '������ �߹�?', '����', SYSDATE, '����', 'FALSE');

insert into MESSAGE 
values(seq_MESSAGE.NEXTVAL, '�߹��� ������ �߹�����', '����', SYSDATE, '�ٿ�', 'FALSE');

insert into MESSAGE 
values(seq_MESSAGE.NEXTVAL, '����~', '�ٿ�', SYSDATE, '����', 'FALSE');




insert into NOTIFICATION 
values(seq_NOTIFICATION.NEXTVAL, 'BusanBigData', sysdate, '����', '�λ�����ͽ��͵����� ������ �ۼ��Ǿ����ϴ�.');

insert into NOTIFICATION 
values(seq_NOTIFICATION.NEXTVAL, 'SeoulBigData', sysdate, '�ٿ�', '��������ͽ��͵����� ������ �ۼ��Ǿ����ϴ�.');


insert into NOTIFICATION 
values(seq_NOTIFICATION.NEXTVAL, 'GwangjuMachineLearning', sysdate, '����', '���ָӽŷ��׽��͵����� ������ �ۼ��Ǿ����ϴ�.');

insert into NOTIFICATION 
values(seq_NOTIFICATION.NEXTVAL, 'IncheonDeepLearning', sysdate, '����', '��õ�����׽��͵����� ������ �ۼ��Ǿ����ϴ�.');




insert into NOTICE 
values(seq_NOTICE.NEXTVAL, 'BusanBigData', sysdate, '����', '���� �����ϸ� ����');

insert into NOTICE 
values(seq_NOTICE.NEXTVAL, 'SeoulBigData', sysdate, '�ٿ�', '���� ��¥ �����ϴµ� ������ ����');


insert into NOTICE 
values(seq_NOTICE.NEXTVAL, 'GwangjuMachineLearning', sysdate, '����', '������ �ѹ� ���� ����');

insert into NOTICE 
values(seq_NOTICE.NEXTVAL, 'IncheonDeepLearning', sysdate, '����', '���� �����ҵ���');





insert into TEAM_MEMBER 
values('BusanBigData', '����');

insert into TEAM_MEMBER 
values('SeoulBigData', '�ٿ�');


insert into TEAM_MEMBER 
values('GwangjuMachineLearning', '����');

insert into TEAM_MEMBER
values('IncheonDeepLearning', '����');





insert into CHANNEL 
values(seq_CHANNEL.NEXTVAL, 'DATA', 'BusanBigData');

insert into CHANNEL 
values(seq_CHANNEL.NEXTVAL, 'INFORMATION', 'BusanBigData');

insert into CHANNEL 
values(seq_CHANNEL.NEXTVAL, 'NOTICE', 'SeoulBigData');

insert into CHANNEL 
values(seq_CHANNEL.NEXTVAL, 'DATA', 'GwangjuMachineLearning');





insert into DIALOG 
values(seq_DIALOG.NEXTVAL, 1,'�̰� �������ΰ�?', '����', sysdate, null);

insert into DIALOG 
values(seq_DIALOG.NEXTVAL, 2, '���̽� �����ϵ��� ����.', '����', sysdate, null );

insert into DIALOG 
values(seq_DIALOG.NEXTVAL, 3,  '���� �˸��͸� ��������','�ٿ�', sysdate, null);

insert into FILES 
values(seq_FILES.NEXTVAL, 'pandas.ppt');			

insert into DIALOG
values(seq_DIALOG.NEXTVAL, 4, '�ڷ��Դϴ�.', '����', sysdate, 1);


insert into LIKES 
values(1, '����');

insert into LIKES 
values(4, '����');







insert into VOTE 
values(seq_VOTE.NEXTVAL, '������ ��մ°�?', 'BusanBigData');

insert into VOTE 
values(seq_VOTE.NEXTVAL, '�ڹٺ��� ���̽��ΰ�?', 'SeoulBigData');





insert into BIAS 
values(seq_BIAS.NEXTVAL, 1, '����');

insert into BIAS 
values(seq_BIAS.NEXTVAL, 2, '����');






insert into OPINION 
values('����', 1, '�����ϴ�.');


insert into OPINION 
values('�ٿ�', 2, '��������');




