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

