CREATE DATABASE Datos;
USE Datos;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL
);

INSERT INTO users (name, email) VALUES 
('Roberto', 'brdrodriguez6@gmail.com'),
('Bob', 'bob@hotmail.com');
