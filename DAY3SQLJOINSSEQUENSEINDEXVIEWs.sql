CREATE TABLE meenaS_products(product_id number(5) primary key,product_name varchar2(20) ,price number(10,2))

INSERT INTO  meenaS_products VALUES(10,'TV',450)
INSERT INTO  meenaS_products VALUES(12,'fridge',1450)
INSERT INTO  meenaS_products VALUES(111,'tv',2450)
INSERT INTO  meenaS_products VALUES(113,'laptop',3450)

SELECT * FROM  meenaS_products

CREATE TABLE MEENUS_INVOICE(invoice_number number(5) primary key,customer_name varchar2(20),quantity number(3),
product_ref REFERENCES meenaS_products(product_id))

INSERT INTO  MEENUS_INVOICE VALUES(202,'ramesh',2,111)
INSERT INTO  MEENUS_INVOICE VALUES(203,'suresh',2,113)
DELETE FROM  MEENUS_INVOICE WHERE invoice_number=204
INSERT INTO  MEENUS_INVOICE VALUES(205,'JAY',2,11)

SELECT * FROM MEENUS_INVOICE

SELECT mp.product_id ,mp.product_name ,mp.price,
mi.invoice_number,mi.customer_name,mi.quantity,mi.product_ref,mi.quantity*mp.price 
FROM meenaS_products mp,MEENUS_INVOICE mi where mp.product_id =mi.product_ref


SELECT mp.product_id ,mp.product_name ,mp.price,
mi.invoice_number,mi.customer_name,mi.quantity,mi.product_ref,mi.quantity*mp.price  AMOUNT 
FROM meenaS_products mp,MEENUS_INVOICE mi where mp.product_id =mi.product_ref

/*SELECT mp.product_id ,mp.product_name ,mp.price,
mi.invoice_number,mi.customer_name,mi.quantity,mi.product_ref,mi.quantity*mp.price  AMOUNT 
FROM meenaS_products mp,MEENUS_INVOICE mi*/

SELECT * FROM meenaS_products mp LEFT OUTER JOIN MEENUS_INVOICE mi
 ON mp.product_id=mi.product_ref
 
 SELECT * FROM meenaS_products mp RIGHT OUTER JOIN MEENUS_INVOICE mi
 ON mp.product_id=mi.product_ref


 SELECT * FROM  MEENUS_INVOICE mi  RIGHT OUTER JOIN meenaS_products mp
 ON mi.product_ref = mp.product_id
 
 CREATE VIEW meenus_product_view AS SELECT product_id,product_name FROM meenaS_products
 
 SELECT * FROM meenus_product_view
 
 INSERT INTO meenus_product_view VALUES(107,'mOBILE')

select view_name,text from user_views where view_name='MEENUS_PRODUCT_VIEW'
select view_name from user_views where view_name='MEENUS_PRODUCT_VIEW'
select * from user_views where view_name='MEENUS_PRODUCT_VIEW'


CREATE INDEX  product_meenus_index on meenaS_products(product_name)

 
 CREATE TABLE meenus_catalog(grade varchar(1) primary key ,max_price number(10,2),min_price num
 
 INSERT  INTO meenus_catalog VALUES('A',5000,15000)
 INSERT INTO meenus_catalog  VALUES('B',500,1500)
 
 INSERT INTO meenus_catalog  VALUES('C',580,1800)
 update meenus_catalog SET min_price=2400 ,max_price=1900 WHERE  grade='C'
 
 SELECT * FROM meenus_catalog 
 
 SELECT * FROM  meenaS_products
 
 SELECT p.product_name, p.price, c.grade FROM meenaS_products p,  meenus_catalog c WHERE p.price BETWEEN c.max_price AND c.min_price
 
 
 CREATE TABLE MEENUS_BILL(bill_number number(5) primary key,bill_date date,amount number(10,2),cust_ref number(3))
 
 CREATE SEQUENCE meenus_seq START WITH 101
 INCREMENT BY 1
 MAXVALUE 1000
 
 
 INSERT INTO  MEENUS_BILL VALUES(meenus_seq.nexTVal,SYSDATE,14500,102)
 INSERT INTO  MEENUS_BILL VALUES(meenus_seq.nexTVal,'22-DEC-2022',18500,103)
 INSERT INTO  MEENUS_BILL VALUES(meenus_seq.nexTVal,'07-NOV-2021',19500,105)
 INSERT INTO  MEENUS_BILL VALUES(meenus_seq.nexTVal,SYSDATE+9,24500,202)
 INSERT INTO  MEENUS_BILL VALUES(meenus_seq.nexTVal,to_Date('10-jan-2020')+9,84500,209)
  INSERT INTO  MEENUS_BILL VALUES(meenus_seq.nexTVal,add_Months(to_Date('10-jan-2020') ,5),74500,218)
    INSERT INTO  MEENUS_BILL VALUES(meenus_seq.nexTVal,add_Months(('10-jun-2020') ,5),84500,278)
    UPDATE  MEENUS_BILL SET amount=8500 WHERE cust_ref=218
    INSERT INTO  MEENUS_BILL VALUES(meenus_seq.nexTVal,'10-jun-2020',190,110)
    INSERT INTO  MEENUS_BILL VALUES(meenus_seq.nexTVal,'10-jun-2020',1500,115)
    
  
 SELECT * FROM  MEENUS_BILL
 
 
 SELECT b.bill_number,b.bill_date,b.amount FROM  MEENUS_BILL a, MEENUS_BILL b WHERE a.cust_ref=115 AND a.bill_date = b.bill_date

SELECT b.bill_number,b.bill_date,b.amount FROM  MEENUS_BILL a, MEENUS_BILL b WHERE a.cust_ref=209 AND a.amount = b.amount



