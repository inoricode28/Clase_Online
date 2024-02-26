--Creacion de la base de datos
CREATE DATABASE INFOCENTER;

USE INFOCENTER;

CREATE TABLE USERS(
    ID          INT             AUTO_INCREMENT      PRIMARY KEY, 
    USERNAME    VARCHAR(50)     UNIQUE              NOT NULL, 
    EMAIL       VARCHAR(100)    UNIQUE              NOT NULL, 
    AGE         INT             UNSIGNED            NOT NULL, 
    STATUS      ENUM('ACTIVE','INACTIVE') DEFAULT 'INACTIVE', 
    BIO         TEXT,
    CREATED_AT  TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE USERS(
    ID         INT           AUTO_INCREMENT     PRIMARY KEY,
    USERNAME   VARCHAR(50)   UNIQUE             NOT NULL,
    EMAIL      VARCHAR(100)  UNIQUE             NOT NULL,
    AGE        INT           UNSIGNED           NOT NULL,
    STATUS     ENUM('ACTIVE','INACTIVE') DEFAULT 'INACTIVE',
    BIO        TEXT,
    CREATED_AT TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

--INGRESAR REGISTROS
TRUNCATE USERS;

INSERT INTO USERS(USERNAME, EMAIL, AGE) VALUES ('USER1','USER1@TEST.COM',17);
INSERT INTO USERS(USERNAME, EMAIL, AGE) VALUES ('USER2','USER2@TEST.COM',18);
INSERT INTO USERS(USERNAME, EMAIL, AGE) VALUES ('USER3','USER3@TEST.COM',35);


INSERT INTO USERS(USERNAME, EMAIL, AGE, STATUS) VALUES ('USER4','USER4@TEST.COM',23,'ACTIVE');

INSERT INTO USERS(USERNAME, EMAIL, AGE, STATUS) VALUES ('USER5','USER5@TEST.COM',29,'ACTIVE');

INSERT INTO USERS(USERNAME, EMAIL, AGE, STATUS) VALUES ('USER6','USER6@TEST.COM',33,'ACTIVE');


INSERT INTO USERS(USERNAME, EMAIL, AGE, BIO) VALUES ('USER7','USER7@TEST.COM',45,'SIMPLE BIO');

INSERT INTO USERS(USERNAME, EMAIL, AGE, BIO) VALUES ('USER8','USER8@TEST.COM',18,'SIMPLE BIO');

INSERT INTO USERS(USERNAME, EMAIL, AGE, BIO) VALUES ('USER9','USER9@TEST.COM',11,'SIMPLE BIO');

INSERT INTO USERS(USERNAME, EMAIL, AGE, BIO) VALUES ('USER10','USER10@TESLA.COM',11,'SIMPLE BIO');

--EJERCICIOS

--Obtener el usuario con el id 2(DONE)
--Obtener el usuario con el email user8test.com.(DONE)
--obtener todos los usuario con una edad mayor a 25.(DONE)
--Obtener todos los usuarios con una edad menor 50.(DONE)

--Obtener todos los usarios que posean biografia.(DONE)
--Obtener todo los usuarios que NO posean una biografia.(DONE)

--Obtener todos cual fecha de creacion fue el dia de hoy.(DONE)

--Obtener el username  de todo los usarios cuyos id se encuentren en el siguiente listado[1,2,3,4](DONE)

--Obtener las edades de todos los usuarios mayores de edad.(DONE)
--Obtener el username y correo electronico del usuario con mayor edad.(DONE)
--Obtener el username y correo electronico del usuario con menor edad.(DONE)
--Obtener el username, correo electronico y edad de todos los usarios con rangos de edad entre 20 y 55.


--PRACTICAS QUERY CONSULTAS
SELECT * FROM USERS;--VER LOS REGISTROS

SELECT * FROM USERS WHERE ID = 2;

SELECT * FROM USERS WHERE EMAIL = 'USER8@TEST.COM';

SELECT * FROM USERS WHERE AGE >= 25;

SELECT * FROM USERS WHERE AGE <= 50;

SELECT * FROM USERS WHERE BIO IS NOT NULL;

SELECT * FROM USERS WHERE CREATED_AT >'2024-01-08 00:00:01';

SELECT * FROM USERS WHERE ID = 1 OR ID = 2 OR ID = 3 OR ID = 4;

SELECT * FROM USERS WHERE ID IN (1,2,3,4);

SELECT * FROM USERS WHERE AGE >=18;

SELECT USERNAME, EMAIL, AGE, BIO IS NOT NULL FROM USERS WHERE AGE >=18;

SELECT USERNAME, EMAIL, AGE, BIO IS NOT NULL FROM USERS WHERE AGE <=18;

SELECT USERNAME, EMAIL, AGE, BIO IS NOT NULL FROM USERS WHERE AGE >=20 AND AGE <=55;

--BUSQUEDA DE PREFIJO Y SUFIJO
SELECT * FROM USERS WHERE EMAIL LIKE '%.com'; --Obten todos los usauarios cuyo correo termine en .com

SELECT * FROM USERS WHERE EMAIL LIKE '%TESLA%'; --Obten todos los usauarios cuyo texto sea tesla

SELECT * FROM users WHERE email LIKE 'user%'; --Obten todos los correos eletronico que inicien con user.
SELECT * FROM users WHERE email LIKE 'user2%'; --No cumple con la condicion
SELECT * FROM users WHERE email LIKE 'user3%'; --Cumple con la condicion
SELECT * FROM users WHERE email LIKE '%@%'; --Buscame todo lo usario que tengan '@'
SELECT * FROM users WHERE email LIKE '%1@%'; --Solo un usario cumple con la condicion


--ELIMINACION LOGICA Y FISICA
TRUNCATE USERS; --ELIMINA LOS REGISTROS Y REINICIA EL AUTO_INCREMENT

--ACTUALIZAR REGISTRO

UPDATE users SET BIO ='DESARROLLO DE SOFTWARE' WHERE ID = 1;

UPDATE users SET BIO ='DESARROLLO DE SOFTWARE (BACKEND)', USERNAME='MIGUEL' WHERE ID = 1;

DELETE FROM USERS WHERE ID = 1;--ELIMINACION FISICA

SELECT * FROM users WHERE id = 1\G; --Nos dara el formato de cartas

DELETE FROM USERS;--ELIMINACION FISICA

SELECT * FROM users;

--CRUD ( CREATE(CREAR), READ(LEER), UPDATE(ACTUALIZAR), DELETE(ELIMINAR) )

--Los tipo de relaciones
--Uno a Uno
--Uno a Muchos  <== la mas Usada.
--Muchos a Muchos


--TABLA COMENTARIOS

CREATE TABLE COMMENTS(
    ID             INT                  AUTO_INCREMENT PRIMARY KEY,
    TITLE          VARCHAR(50),
    USER_ID        INT, 
    CREATED_AT     TIMESTAMP DEFAULT    CURRENT_TIMESTAMP,
    FOREIGN KEY(USER_ID) REFERENCES USERS(ID) ON DELETE CASCADE
);

DESC comments;--Ver los atributos de la tabla

--Insercion
INSERT INTO comments(TITLE, USER_ID) VALUES ('Ingeniero de sistemas',1);

INSERT INTO comments(TITLE, USER_ID) VALUES ('Ingeniero Civil',2);

UPDATE users SET BIO ='MESTRO CONTRSUCTOR', USERNAME='JUAN' WHERE ID = 2;

 DELETE FROM users WHERE ID = 2;

 TRUNCATE TABLE users;


 --INNER JOIN

  --Fucionar tablas
  -- INNER JOIN
mysql> SELECT
    -> *
    -> FROM users
    -> INNER JOIN comments ON users.id = comments.user_id;

-- Seleccionar un usuario con una sola tabla
 users.username, users.email FROM users INNER JOIN comments ON users.id = comments.user_id;

 SELECT DISTINCT users.username, users.email FROM users INNER JOIN comments ON users.id = comments.user_id WHERE users.status = 'active' ;


 SELECT * FROM users LEFT JOIN comments ON users.id = comments.user_id;

 SELECT * FROM users LEFT JOIN comments ON users.id = comments.user_id WHERE comments.user_id IS NULL;

 SELECT * FROM users INNER JOIN comments ON users.id = comments.user_id WHERE DATE(comments.created_at) = '2024-01-22' ;

 SELECT
        users.username,
        users.email,
        count(*) AS 'cantidad_comentarios'
 FROM users
 INNER JOIN  comments ON users.id = comments.user_id
 WHERE DATE  (comments.created_at) = '2024-01-22'
 GROUP BY users.username
 ORDER BY cantidad_comentarios DESC
 LIMIT 1;

 SELECT 
    username,
    email
 FROM(
    SELECT
    users.username,
    users.email,
    count(*) AS 'cantidad_comentarios'
    FROM users
    INNER JOIN  comments ON users.id = comments.user_id
    WHERE DATE  (comments.created_at) = '2024-01-22'
    GROUP BY users.username
    ORDER BY cantidad_comentarios DESC
    LIMIT 1
 )AS resultado;


SELECT 
    username,
    email
FROM(
    SELECT
    users.username,
    users.email,
    count(*) AS 'cantidad_comentarios'
    FROM users
    INNER JOIN  comments ON users.id = comments.user_id
    WHERE DATE  (comments.created_at) = '2024-01-22'
    GROUP BY users.username
    HAVING cantidad_comentarios >=2
    ORDER BY cantidad_comentarios DESC
)AS resultado;

