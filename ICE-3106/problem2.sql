use university;
-- create new table called employe
create table employe(
	id int primary key,
    name varchar(100) not null
);
insert into employe values(101, "Abdul Karim");
insert into employe values(102, "Hamid Khan");
select * from employe;
-- add new column i the employe table
alter table employe
	add email varchar(100);
-- show new table
select * from employe;
insert into employe values(103, "Sami Rahaman", "sami1023@gail.com");
select * from employe;

-- modify column
alter table employe
	modify email text;

-- change
alter table employe
	change email contact varchar(100);

-- delete column name
alter table employe
	drop column contact;
    
-- delete table
drop table employe;