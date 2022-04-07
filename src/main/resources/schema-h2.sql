DROP TABLE IF EXISTS customer;

CREATE TABLE IF NOT EXISTS customer
(
    id    BIGINT AUTO_INCREMENT PRIMARY KEY,
    name  VARCHAR(100) NOT NULL,
    email VARCHAR(255) NOT NULL,
    UNIQUE (name)
);

insert into customer(name, email)
values ('RV', 'RV@gmail.com');
insert into customer(name, email)
values ('KD', 'KD@gmail.com');
