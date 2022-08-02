select *
from student

delete student

insert into student values('gg','123')
-----------------------------------------




--rust prework & test area---------
select *
from  rustlogin

select password from rustlogin
---------------------------------------------------

--drop   table RepairVehicle

delete
from jobnumbergenerater


select *
from  RepairCustomer
select *
from  RepairVehicle

update  RepairCustomer
set NID='5',Name='6'
where Jno='1'

----------------------------------







--rust database fix area-----------

--login
create table rustlogin(
password varchar(50),
username varchar(50)
)


insert into rustlogin values('123','Rust')

--Customer & Vehicle tables--
create table RepairCustomer(
NID varchar(15),
Name varchar(25),
Address varchar(30),
Mail  varchar(25),
Jno varchar(20) primary key,
)


create table RepairVehicle(
Vno varchar(20) ,
Vmodel varchar(30),
Jdes varchar(50),
Jno varchar(20),
constraint c1 foreign key(Jno) references RepairCustomer(Jno) on delete cascade
)

select *
from RepairCustomer

select *
from RepairVehicle

-----------
create table jobnumbergenerater(
 currentjobnumber int
 )

 select currentjobnumber  from  jobnumbergenerater
 insert into jobnumbergenerater values(1)

 -----------------------------------
-- employee
create table Employee( 
id varchar(15) primary key,
name varchar(80),
age varchar(5),
number varchar(15),
salary float
) 
select *
from Employee

delete
from Employee


------------------
--Restoration Coustomer

create table RESTORATION(
name  varchar(25),
nic varchar(25),
email varchar(40),
address varchar(40),
jobno varchar(25),
vehicalno varchar(25),
vehicalmodel varchar(30),
vehicalcolour varchar(25)
)

select *
from RESTORATION

delete 
from RESTORATION

------------------------------
--Supplier Item

create table Supplier(
id varchar(15) primary key,
name varchar(40),
price float,
qun int,
disname varchar(50),
mail varchar(100)
)


select *
from Supplier

delete
from Supplier

--------------------------
--bill

create table bill(
jno varchar(50) primary key ,
totbill float
)

select *
from bill

delete
from bill






-------------------------------------------------
--test area @2---------
insert into RepairCustomer values('1','1','1','1')
insert into RepairVehicle values('1','1','1','1')





delete 
from RepairCustomer

delete from RepairCustomer 

where Jno='1'

delete 
from jobnumbergenerater

insert into jobnumbergenerater values(1)

select * from jobnumbergenerater
select Name,Mail from RepairCustomer where  Jno=1



 
