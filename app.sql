select * from  t_client order by id desc;
select * from  t_device;
select * from  t_client_device;
select * from  t_audit_log order by id desc;

explain select * from  t_audit_log where id > 3;

alter table t_client drop column create_time
show engines;
show variables like '%storage_engine%';
grant all privileges on app.* to 'app'@'localhost';
flush privileges;

insert into t_client (name) values ('Jack');
insert into t_client (name) values ('Feign');

insert into t_device (dtype, dname) values (1, 'tplink');
insert into t_device (dtype, dname) values (1, 'alink');
insert into t_device (dtype, dname) values (2, 'ipad');

insert into t_client_device (cid, did) values (1, 1);
insert into t_client_device (cid, did) values (1, 2);
insert into t_client_device (cid, did) values (2, 1);
insert into t_client_device (cid, did) values (2, 3);

commit;

drop table t_audit_log;
create table t_audit_log (
	id int not null auto_increment,
	log_info varchar(100),
	create_date timestamp default CURRENT_TIMESTAMP,
	primary key (id)
); 

create table t_user (
	id int not null auto_increment,
	userid varchar(10) not null,
	username varchar(30) not null,
	primary key (uid),
	unique key (userid)
);

create table t_role (
	id int not null auto_increment,
	roledesc varchar(45) not null,
	
);
select * from t_auth_log;

