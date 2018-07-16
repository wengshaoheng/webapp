
use app;

/*drop table statements*/
drop table if exists t_adm_user;

/*create table statements*/
create table if not exists t_adm_user (
	uid int not null auto_increment,
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
	primary key (uid),
	unique key uk_lid (login_id)
);

select * from t_adm_user;