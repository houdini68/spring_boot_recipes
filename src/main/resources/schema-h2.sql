DROP TABLE IF EXISTS customer;
CREATE TABLE IF NOT EXISTS customer
(
    id    BIGINT AUTO_INCREMENT PRIMARY KEY,
    name  VARCHAR(100) NOT NULL,
    email VARCHAR(255) NOT NULL,
    UNIQUE (name)
);
DROP TABLE IF EXISTS order_t;
CREATE TABLE IF NOT EXISTS order_t
(
    id     BIGINT AUTO_INCREMENT PRIMARY KEY,
    number VARCHAR(100) NOT NULL,
    UNIQUE (number)
);
DROP SCHEMA IF EXISTS bookstore;
CREATE SCHEMA bookstore;
DROP TABLE IF EXISTS bookstore.author;
CREATE TABLE bookstore.author
(
    id         BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(100) NOT NULL,
    lname      VARCHAR(100) NOT NULL,
    version    VARCHAR(100) NULL,
--     status     int -- enum
    status     varchar(50)
);
