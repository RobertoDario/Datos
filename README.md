# Datos
Conexión base de datos relacional - conectar Scala a MySQL utilizando JDBC

# Scala y JDBC: Conexión a Bases de Datos Relacionales


## ¿Qué es JDBC y cuáles son sus componentes?

**JDBC (Java Database Connectivity)** es una API estándar de Java que permite a las aplicaciones conectarse y ejecutar operaciones en bases de datos relacionales. Proporciona una interfaz común para interactuar con diferentes bases de datos.

### Componentes principales de JDBC:
1. **DriverManager**: Administra un conjunto de controladores que se utilizan para conectar con las bases de datos.
2. **Connection**: Representa una conexión activa a la base de datos.
3. **Statement**: Permite ejecutar sentencias SQL como consultas, inserciones y actualizaciones.
4. **ResultSet**: Contiene los resultados obtenidos de una consulta SQL.
5. **PreparedStatement**: Es una versión avanzada de `Statement` que permite ejecutar sentencias precompiladas y seguras contra inyecciones SQL.

---

## Librerías Scala para Conectarse a Bases de Datos Relacionales

Scala tiene varias librerías diseñadas para facilitar la interacción con bases de datos. Aquí documentamos dos de las más utilizadas:

| **Librería**       | **Descripción**                                                                                      | **Diferencias**                                                                                              |
|---------------------|------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------|
| **Slick**          | Un ORM funcional que permite interactuar con bases de datos relacionales de forma declarativa.       | Ofrece abstracción de SQL con un enfoque funcional y soporte para streaming.                                |
| **Doobie**         | Una librería basada en la programación funcional pura que interactúa directamente con JDBC.          | Se enfoca en bajo nivel y permite manejar conexiones, errores y transacciones explícitamente.               |

---

## Cómo Establecer una Conexión a MySQL desde Scala

### 1. Crear una base de datos en MySQL  
Ejecuta los siguientes comandos en MySQL:

```sql
CREATE DATABASE scala_jdbc_example;
USE scala_jdbc_example;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL
);

INSERT INTO users (name, email) VALUES 
('Roberto', 'brdrodriguez6@gmail.com'),
('Bob', 'bob@hotmail.com');

