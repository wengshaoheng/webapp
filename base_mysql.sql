
use app;

show tables;

/*drop table statements*/
drop table if exists t_adm_user;
drop table if exists t_adm_role;
drop table if exists t_adm_userrole;

/*create table statements*/
create table if not exists t_adm_user (
	id int not null auto_increment,
	login_id varchar(16) not null,
	password varchar(60) not null,
	username varchar(30) not null,
	gender varchar(1) default 'U', /*M: male, F: female, U: unknown*/
	birthday date,
	last_login_time timestamp,
	last_login_ip varchar(20),
	status varchar(1) default 'P', /*P, S, A, I, D*/
	create_user varchar(16) not null,
	create_date timestamp not null,
	last_upd_user varchar(16) not null,
	last_upd_date timestamp not null,
	primary key (id),
	unique key uk_lid (login_id)
);

create table if not exists t_adm_role (
	role_id varchar(16) not null,
	role_desc varchar(30) not null,
	primary key (role_id)
);

create table if not exists t_adm_userrole (
	id int not null auto_increment,
	login_id varchar(16) not null,
	role_id varchar(16) not null,
	primary key (id),
	unique key(login_id, role_id)
);

