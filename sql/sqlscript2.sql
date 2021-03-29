REM   Script: Session B
REM   ACTIVITY 5

select * from cutomer;

select * from salesman;

CREATE TABLE salesman (  
    salesman_id int,  
    salesman_name varchar2(32),  
    salesman_city varchar2(32),  
    commission int  
);

INSERT INTO salesman  
VALUES  
(5002,'Nail Knite','Paris',13),  
(5005,'Pit Alex','London',11),  
(5006,'McLyon','Paris',14),  
(5007,'Paul Adam','Rome',13),  
(5003,'Lauson Hen','San Jose',12);

INSERT INTO salesman  
VALUES(5002,'Nail Knite','Paris',13),  
INSERT INTO salesman  
VALUES (5005,'Pit Alex','London',11),  
INSERT INTO salesman  
VALUES(5006,'McLyon','Paris',14),  
INSERT INTO salesman  
VALUES(5007,'Paul Adam','Rome',13),  
INSERT INTO salesman  
VALUES(5003,'Lauson Hen','San Jose',12);

INSERT INTO salesman  
VALUES(5002,'Nail Knite','Paris',13);

INSERT INTO salesman  
VALUES (5005,'Pit Alex','London',11);

INSERT INTO salesman  
VALUES(5006,'McLyon','Paris',14);

INSERT INTO salesman  
VALUES(5007,'Paul Adam','Rome',13);

INSERT INTO salesman  
VALUES(5003,'Lauson Hen','San Jose',12);

SELECT * FROM SALESMAN;

SELECT * FROM salesman WHERE salesman_city='Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

ALTER TABLE salesman ADD grade int;

UPDATE salesman SET grade=100;

SELECT * FROM SALESMAN;

SELECT * FROM SALESMAN;

UPDATE salesman SET grade=200 WHERE salesman_city='Rome';

UPDATE salesman SET grade=300 WHERE salesman_name='James Hoog';

SELECT * FROM SALESMAN;

UPDATE salesman SET grade=300 WHERE salesman_name='Nail Knite';

UPDATE salesman SET salesman_name='Pierre' WHERE salesman_name='McLyon';

SELECT * FROM salesman;

select distinct salesman_id from orders;

