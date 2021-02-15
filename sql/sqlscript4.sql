REM   Script: Sandeep05
REM   Desciprtion

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

INSERT INTO salesman  
VALUES(5001,James Hoog,New York,15);

INSERT INTO salesman  
VALUES(5001,James Hoog,New York,15);

INSERT INTO salesman  
VALUES(5001,'James Hoog','New York',15);

select * from salesman;

INSERT INTO salesman 
VALUES (5002,'Nail Knite','Paris',13), 
(5005,'Pit Alex','London',11), 
(5006,'McLyon','Paris',14), 
(5007,'Paul Adam','Rome',13) 
,(5003,'Lauson Hen','San Jose',12);

INSERT INTO salesman 
VALUES (5002,'Nail Knite','Paris',13), 
(5005,'Pit Alex','London',11), 
(5006,'McLyon','Paris',14), 
(5007,'Paul Adam','Rome',13), 
(5003,'Lauson Hen','San Jose',12);

INSERT INTO salesman 
VALUES (5002,'Nail Knite','Paris',13), 
(5005,'Pit Alex','London',11), 
(5006,'McLyon','Paris',14), 
(5007,'Paul Adam','Rome',13), 
(5003,'Lauson Hen','San Jose',12);

INSERT INTO salesman 
VALUES (5002,'Nail Knite','Paris',13), 
(5005,'Pit Alex','London',11), 
(5006,'McLyon','Paris',14), 
(5007,'Paul Adam','Rome',13), 
(5003,'Lauson Hen','San Jose',12);

INSERT INTO salesman 
VALUES (5002,'Nail Knite','Paris',13), 
(5005,'Pit Alex','London',11), 
(5006,'McLyon','Paris',14), 
(5007,'Paul Adam','Rome',13), 
(5003,'Lauson Hen','San Jose',12);

INSERT INTO salesman 
VALUES ((5002,'Nail Knite','Paris',13), 
(5005,'Pit Alex','London',11), 
(5006,'McLyon','Paris',14), 
(5007,'Paul Adam','Rome',13), 
(5003,'Lauson Hen','San Jose',12));

INSERT INTO salesman 
VALUES {(5002,'Nail Knite','Paris',13), 
(5005,'Pit Alex','London',11), 
(5006,'McLyon','Paris',14), 
(5007,'Paul Adam','Rome',13), 
(5003,'Lauson Hen','San Jose',12)};

INSERT INTO salesman 
VALUES(5002,'Nail Knite','Paris',13), 
(5005,'Pit Alex','London',11), 
(5006,'McLyon','Paris',14), 
(5007,'Paul Adam','Rome',13), 
(5003,'Lauson Hen','San Jose',12);

INSERT INTO salesman 
VALUES(5002,'Nail Knite','Paris',13), 
(5005,'Pit Alex','London',11), 
(5006,'McLyon','Paris',14), 
(5007,'Paul Adam','Rome',13), 
(5003,'Lauson Hen','San Jose',12);

INSERT INTO salesman 
VALUES 
(5002,'Nail Knite','Paris',13), 
(5005,'Pit Alex','London',11), 
(5006,'McLyon','Paris',14), 
(5007,'Paul Adam','Rome',13), 
(5003,'Lauson Hen','San Jose',12);

INSERT INTO salesman 
VALUES 
(5002,'Nail Knite','Paris',13), 
(5005,'Pit Alex','London',11), 
(5006,'McLyon','Paris',14), 
(5007,'Paul Adam','Rome',13), 
(5003,'Lauson Hen','San Jose',12);

INSERT INTO salesman 
VALUES 
(5002,'Nail Knite','Paris',13);

INSERT INTO salesman 
VALUES 
--(5002,'Nail Knite','Paris',13);

(5005,'Pit Alex','London',11);

INSERT INTO salesman 
VALUES(5005,'Pit Alex','London',11);

INSERT INTO salesman 
VALUES(5006,'McLyon','Paris',14);

INSERT INTO salesman 
VALUES(5007,'Paul Adam','Rome',13);

INSERT INTO salesman 
VALUES(5003,'Lauson Hen','San Jose',12);

SELECT *  
FROM SALESMAN 
ORDER BY (salesman_id and salesman_city);

SELECT *  
FROM SALESMAN 
ORDER BY (salesman_id,salesman_city);

SELECT *  
FROM SALESMAN 
ORDER BY (salesman_id,salesman_city);

SELECT *  
FROM SALESMAN 
ORDER BY (salesman_id AND salesman_city);

SELECT salesman_id, salesman_city) 
FROM SALESMAN;

SELECT salesman_id, salesman_city) 
FROM SALESMAN;

SELECT (salesman_id, salesman_city) 
FROM SALESMAN;

SELECT salesman_id, salesman_city 
FROM SALESMAN;

SELECT * 
FROM SALESMAN;

where salesman_city=paris;


SELECT * 
FROM SALESMAN;

where salesman_city==paris;


SELECT * 
FROM SALESMAN;

where salesman_city.equals(Paris);


SELECT * 
FROM SALESMAN;

where salesman_city=Paris;


SELECT * 
FROM SALESMAN;

where salesman_city='Paris';


SELECT * FROM salesman WHERE salesman_city='Paris';

SELECT * 
FROM SALESMAN 
where salesman_city='Paris';

SELECT salesman_id commission 
FROM SALESMAN 
where salesman_name='Paul Adam';

SELECT salesman_id,commission 
FROM SALESMAN 
where salesman_name='Paul Adam';

ALTER TABLE salesman ADD grade int;

UPDATE salesman SET grade=100;

SELECT * FROM salesman;

