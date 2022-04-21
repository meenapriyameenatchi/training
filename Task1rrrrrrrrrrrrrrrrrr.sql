CREATE TABLE MeenuBook(book_number number(5) PRIMARY KEY,book_name varchar2(20),author varchar(20),price number(7,2));
describe MeenuBook

CREATE TABLE MeenuStudent(Roll_Number number(5) PRIMARY KEY,Student_Name varchar2(30),Branch varchar2(25),
Date_Of_Birth DATE,Mark_Scored number(6,2))
describe MeenuStudent

CREATE TABLE MeenuAuthor1( Phone_Number number(10) PRIMARY KEY,First_Name varchar2(20),Last__Name varchar2(20),pincode number(6))

CREATE TABLE MeenuBooks1(Book_Number number(5) PRIMARY KEY,Book_Name varchar2(20),
price  number(7,2),author_Ref number(10) REFERENCES MeenuAuthor1(Phone_Number))
DESCRIBE MeenuBooks1;

DESCRIBE MeenaProducts
SELECT * FROM MeenaProducts

describe MEENAPRIYAMEMBER

CREATE TABLE MEENAPRIYABOOKS(book_number number(6),book_name varchar2(30),author_name varchar(30), cost number(7,2),category char(10))
describe MEENAPRIYABOOKS

CREATE TABLE MEENAPRIYAISSUE(lib_issue_id number(10),book_number number(6),member_id number(5),issue_date date,return_date date)
describe  MEENAPRIYAISSUE

DROP TABLE  MEENAPRIYAMEMBER
describe MEENAPRIYAMEMBER

CREATE TABLE MEENAPRIYAMEMBER(member_id number(5) PRIMARY KEY ,member_name varchar2(30),
acc_open_date date,membership_type varchar2(20) check (membership_type='lifetime' OR membership_type='annual' OR membership_typE='halfyearly' OR membership_type='quaterly'),
fess_paid number(4),max_books_allowed number(2),penalty_amount number(7,2))

ALTER TABLE MEENAPRIYAMEMBER MODIFY(member_name varchar2(20))

ALTER TABLE MEENAPRIYAISSUE ADD(refrence char(30))

ALTER TABLE MEENAPRIYAISSUE DROP(refrence)

ALTER TABLE MEENAPRIYAISSUE RENAME TO MEENALIBISSUE
describe MEENALIBISSUE
ALTER TABLE MEENAPRIYAMEMBER ADD(member_address varchar2(50))

INSERT INTO  MEENAPRIYAMEMBER (member_id  number(5)  PRIMARY KEY,acc_open_date date,membership_type varchar2(20),fess_paid number(4) ,
max_books_allowed  number(2),penalty_amount number(7,2),member_address varchar2(50))
values(1,'RichSharma',10-dec-05,'lifetime',25000,5,50,'pune')

