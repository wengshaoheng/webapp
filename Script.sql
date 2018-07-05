--<ScriptOptions statementTerminator=";"/>
drop table 
CREATE TABLE t_client (
	id INT NOT NULL,
	name VARCHAR(20) NOT NULL,
	PRIMARY KEY (id)
) ENGINE=InnoDB;

ALTER TABLE t_client ADD PRIMARY KEY (id);

