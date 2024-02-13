CREATE DATABASE TAREA01;
USE TAREA01;


CREATE TABLE CATEGORIA(
    ID_CATEGORIA        INT             NOT NULL        AUTO_INCREMENT PRIMARY KEY,
    CATEGORIA           VARCHAR(150)    NOT NULL        UNIQUE,
    ESTADO              BOOLEAN         NOT NULL
);

INSERT INTO CATEGORIA (CATEGORIA, ESTADO) VALUES
('ELECTRONICA', TRUE),
('ROPA', TRUE),
('DEPORTES', TRUE),
('ALIMENTOS', TRUE),
('MISELANIAS', TRUE);



CREATE TABLE PRODUCTO(
    ID_PRODUCTO         INT             NOT NULL        AUTO_INCREMENT PRIMARY KEY,
    CATEGORIA_ID_FK     INT,
    NOMBRE              VARCHAR(150)    NOT NULL        UNIQUE,
    MARCA               VARCHAR(250)    NOT NULL,
    COSTO               DECIMAL(10,4)   NOT NULL,
    PRECIO              DECIMAL(10,4)   NOT NULL,
    STOCK               INT             NOT NULL,
    ESTADO              BOOLEAN         NOT NULL,
    FOREIGN KEY(CATEGORIA_ID_FK) REFERENCES CATEGORIA(ID_CATEGORIA) ON DELETE CASCADE
);

INSERT INTO PRODUCTO (CATEGORIA_ID_FK, NOMBRE, MARCA, COSTO, PRECIO, STOCK, ESTADO) VALUES
(1, 'Teléfono inteligente Samsung Galaxy S20', 'Samsung', 500.00, 699.99, 100, TRUE),
(3, 'Camiseta deportiva Nike Dri-FIT', 'Nike', 20.00, 39.99, 200, TRUE),
(2, 'Televisor LED Sony Bravia 4K', 'Sony', 600.00, 899.99, 50, TRUE),
(4, 'Arroz integral Tio Ben 1kg', 'Tio Ben', 5.00, 7.99, 300, TRUE),
(5, 'Bolígrafo Bic Cristal', 'Bic', 1.00, 1.99, 500, TRUE);

DELETE FROM CATEGORIA WHERE ID_CATEGORIA = 1;


CREATE TABLE ROL(
    ID_ROL             INT             NOT NULL        AUTO_INCREMENT PRIMARY KEY,
    ROL                VARCHAR(150)    NOT NULL        UNIQUE,
    ESTADO             BOOLEAN         NOT NULL
);

CREATE TABLE USUARIO(
    ID_USUARIO             INT             NOT NULL        AUTO_INCREMENT PRIMARY KEY,
    EDAD                   VARCHAR(10)     NOT NULL,
    DIRECCION              VARCHAR(250)    NOT NULL,
    TELEFONO               VARCHAR(10)     NOT NULL,
    CORREO                 VARCHAR(250)    NOT NULL        UNIQUE,    
    ESTADO                 BOOLEAN         NOT NULL,
    ROL_ID_FK                 INT,
    FOREIGN KEY(ROL_ID_FK) REFERENCES ROL(ID_ROL) ON DELETE CASCADE
    );