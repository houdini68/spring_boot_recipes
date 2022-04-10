DROP TABLE IF EXISTS customer;

CREATE TABLE customer
(
    id    SERIAL PRIMARY KEY,
    name  VARCHAR(100) NOT NULL,
    email VARCHAR(255) NOT NULL,
    UNIQUE (name)
);

DROP TABLE IF EXISTS order_t;

CREATE TABLE order_t
(
    id    SERIAL PRIMARY KEY,
    number  VARCHAR(100) NOT NULL,
    UNIQUE (number)
);

DROP TABLE IF EXISTS bookstore.author;

DROP SCHEMA IF EXISTS bookstore;
CREATE SCHEMA bookstore;

CREATE TABLE bookstore.author
(
    id         SERIAL PRIMARY KEY,
    first_name VARCHAR(100) NOT NULL,
    lname      VARCHAR(100) NOT NULL,
    version    VARCHAR(100) NULL,
    status     VARCHAR(20) -- enum
--     status     varchar(50)
);
