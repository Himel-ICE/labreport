create database Students;
use Students;

create table semester_reg(
ID int primary key not NULL,
Name varchar(100),
Session varchar(10),
Ph_Num varchar(15),
City varchar(20), 
Gender varchar(10)
);
select * from semester_reg;
