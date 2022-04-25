CREATE TABLE order_t
(
    id    SERIAL PRIMARY KEY,
    number  VARCHAR(100) NOT NULL,
    UNIQUE (number)
);
INSERT INTO order_t (number)values ('123-456-789');
INSERT INTO order_t (number) VALUES ('458-851-369');

