DROP TABLE IF EXISTS customer;

CREATE TABLE customer
(
    id    BIGINT AUTO_INCREMENT PRIMARY KEY,
    name  VARCHAR(100) NOT NULL,
    email VARCHAR(255) NOT NULL,
    UNIQUE (name)
);

-- DROP SCHEMA IF EXISTS bookstore;
--
-- CREATE SCHEMA bookstore;
--
-- DROP TABLE IF EXISTS bookstore.author;
--
-- CREATE TABLE bookstore.author
-- (
--     id        BIGINT AUTO_INCREMENT PRIMARY KEY,
--     firstName VARCHAR(100) NOT NULL,
--     lastName  VARCHAR(100) NOT NULL,
--     version   VARCHAR(100) NULL,
-- );
