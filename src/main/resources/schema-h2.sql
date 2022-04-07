DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS order_t;

CREATE TABLE IF NOT EXISTS customer
(
    id    BIGINT AUTO_INCREMENT PRIMARY KEY,
    name  VARCHAR(100) NOT NULL,
    email VARCHAR(255) NOT NULL,
    UNIQUE (name)
);

CREATE TABLE IF NOT EXISTS order_t
(
    id     BIGINT AUTO_INCREMENT PRIMARY KEY,
    number VARCHAR(100) NOT NULL,
    UNIQUE (number)
);

insert into customer(name, email)
values ('RV', 'RV@gmail.com');
insert into customer(name, email)
values ('KD', 'KD@gmail.com');

insert into order_t (number)
VALUES ('123-456-789');
insert into order_t (number)
VALUES ('458-851-369');
