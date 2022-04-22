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

INSERT INTO  MEENAPRIYAMEMBER values(1,'RichSharma','10-dec-05','lifetime',2500.89,5,50,'pune')

INSERT INTO  MEENAPRIYAMEMBER (member_id , member_name) values(2,'menna')

SELECT * FROM MEENAPRIYAMEMBER

INSERT INTO MEENAPRIYAMEMBER values(3,'karimasen',SYSDATE,'annual',1000.00,3,Null,'pune')


INSERT INTO MEENAPRIYAMEMBER values(4,'gopal',SYSDATE+1,'annual',9000.80,5,90,'chennai')
INSERT INTO MEENAPRIYAMEMBER values(5,'bopal',SYSDATE-1,'halfyearly',7000.80,5,80,'madurai')
INSERT INTO MEENAPRIYAMEMBER values(6,'jino',SYSDATE-35,'quaterly',6000.80,9,68,'salem')
INSERT INTO MEENAPRIYAMEMBER values(7,'dino','19-jan-2022','quaterly',8900.80,6,98,'pudhur')
INSERT INTO MEENAPRIYAMEMBER values(8,'kino',SYSDATE+9,'quaterly',6300.80,7,78,'salem')


ALTER  TABLE MEENAPRIYAMEMBER MODIFY(member_name varchar2(10))

INSERT INTO MEENAPRIYAMEMBER values(9,'sino',SYSDATE,'quaterly',9000.80,110,78,'sipcot')

CREATE TABLE MEENAPRIYAMEMBER9067(member_id number(5) PRIMARY KEY ,member_name varchar2(30),member_address varchar(50),
acc_open_date date,membership_type varchar2(20) check (membership_type='lifetime' OR membership_type='annual' OR membership_typE='halfyearly' OR membership_type='quaterly'),
fess_paid number(4),max_books_allowed number(2) check(max_books_allowed <600),penalty_amount number(7,2) check(penalty_amount <5000))

SELECT * FROM  MEENAPRIYAMEMBER9067

DROP TABLE MEENAPRIYABOOKS

CREATE TABLE MEENAPRIYABOOKS1(book_number number(5) PRIMARY KEY,book_name varchar2(20) NOT NULL,
author varchar(20),price number(7,2),
category varchar2(20))
describe MEENAPRIYABOOKS1

INSERT INTO  MEENAPRIYABOOKS1  values(101,'let us c','dennis ritchie',450,'system')
INSERT INTO  MEENAPRIYABOOKS1  values(102,'oracle','loni',550,'database')
INSERT INTO  MEENAPRIYABOOKS1  values(103,'mastering sql','loni',250,'database')
INSERT INTO  MEENAPRIYABOOKS1  values(104,'ol sql','scottuman',750,'database')
describe MEENAPRIYABOOKS1

INSERT INTO  MEENAPRIYABOOKS1  values(101,'let us c','dennis ritchie',450,'dbms') & values(105,'oracle new','lonies',550,'fiction')
 
 CREATE TABLE MEENABOOKS101 (book_number number(5) PRIMARY KEY,book_name varchar2(20) NOT NULL,
author varchar(20),price number(7,2),
category varchar2(20))
SELECT * FROM MEENABOOKS101
INSERT INTO MEENABOOKS101 (SELECT * FROM MEENAPRIYABOOKS1)
SELECT * FROM MEENABOOKS101

INSERT INTO MEENABOOKS101 VALUES(105,'national geographics','dino',1000,'science')


UPDATE MEENABOOKS101 SET price=300 WHERE book_number=103

ALTER TABLE MEENALIBISSUE RENAME TO MEENASISSUE

DROP TABLE MEENASISSUE

CREATE TABLE MEENASISSUE51(lib_issue_id number(10) CONSTRAINTS libs PRIMARY KEY,
book_number  number(5)CONSTRAINTS MEENA123s REFERENCES MEENAPRIYABOOKS1(book_number),
member_id  number(5) CONSTRAINTS TEENA123s REFERENCES  MEENAPRIYAMEMBER(member_id),issue_date date,return_date date, check(issue_date < return_date))
 

INSERT INTO   MEENASISSUE51 VALUES(7020,102,1,'2-DEC-2020','5-Dec-2020');
INSERT INTO  MEENASISSUE51 VALUES(7890,103,2,'5-NOV-2019',SYSDATE-1)


CREATE TABLE MEENASISSUE(lib_issue_id number(10)CONSTRAINT lib_pk PRIMARY KEY)
ALTER TABLE  MEENASISSUE51 DISABLE CONSTRAINT  TEENA123s  ;

INSERT INTO MEENASISSUE51 VALUES(7889,102,34,'4-NOV-2020','6-DEC-2020')

ALTER TABLE  MEENASISSUE51 ENABLE CONSTRAINT  TEENA123s  ;

DELETE FROM MEENASISSUE51 WHERE  member_id = 34;
DESCRIBE MEENASISSUE51

DELETE FROM MEENAPRIYAMEMBER WHERE member_id =1
SELECT * FROM MEENAPRIYAMEMBER

UPDATE MEENASISSUE51 SET return_date=issue_date+15 WHERE lib_issue_id=7020 OR lib_issue_id=7890
SELECT * FROM MEENASISSUE51

UPDATE MEENAPRIYAMEMBER SET penalty_amount=5000.00 WHERE  member_name='karimasen'
SELECT * FROM MEENAPRIYAMEMBER

DELETE FROM MEENASISSUE51 WHERE  member_id=2 AND issue_date < '06-NOV-19'

DELETE FROM MEENAPRIYABOOKS1 WHERE category !='database' OR category !='DBMS'
SELECT * FROM MEENAPRIYABOOKS1

SELECT * FROM MEENAPRIYAMEMBER
SELECT * FROM MEENASISSUE51
