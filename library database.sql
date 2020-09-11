create database dblibrary
use dblibrary
create table tbadmin(admid varchar(50) primary key,admpwd varchar(50),admname varchar(50),admadd varchar(50),admmob varchar(20),admgen varchar(10),admsecques
varchar(50),admsecans varchar(50));
desc tbadmin

create table tbbookcat(bookcatid int primary key,bookcatname varchar(50))

create table tbbook(bookid int primary key,bookcatid int ,booktit varchar(50),bookaut varchar(50),bookpub varchar(50),
bookprc int,bookstackno varchar(50),bookcopies int,bookissued int,foreign key (bookcatid) references tbbookcat(bookcatid))
desc tbbook
create table tbstudent(stuid varchar(50) primary key,stupwd varchar(50),stuname varchar(50),stuadd varchar(50),
stustream varchar(50),stusem int,sturollno int,stumobno varchar(50),stugen varchar(50),stubooksissued varchar(50),stusecques varchar(50),stusecans varchar(50))
desc tbstudent
create table tbissue(issueid int primary key,issuestuid varchar(50),issuebookid int,issuedate date,returndate date,foreign key (issuestuid) references tbstudent(stuid),
foreign key(issuebookid) references tbbook(bookid))
desc tbissue

create table tbfine(fineid int primary key,finestuid varchar(50),finedays int,fineamt int,fineissueid int,finestatus varchar(50),
foreign key(finestuid) references tbstudent(stuid),foreign key(fineissueid) references tbissue(issueid))
desc tbfine