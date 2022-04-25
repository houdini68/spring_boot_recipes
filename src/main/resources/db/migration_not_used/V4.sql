DROP SCHEMA IF EXISTS bookstore;
CREATE SCHEMA bookstore;

DROP TABLE IF EXISTS bookstore.author;
CREATE TABLE bookstore.author
(
    id         SERIAL PRIMARY KEY,
    first_name VARCHAR(100) NOT NULL,
    lname      VARCHAR(100) NOT NULL,
    version    VARCHAR(100) NULL,
    status     VARCHAR(20) -- enum
--     status     varchar(50)
);
