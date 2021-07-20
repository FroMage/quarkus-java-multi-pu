CREATE SEQUENCE hibernate_sequence;
SELECT setval('hibernate_sequence', 3);
CREATE TABLE cust
(
  id   INT,
  name VARCHAR(40)
);
INSERT INTO cust(id, name) VALUES (1, 'Cherry');
INSERT INTO cust(id, name) VALUES (2, 'Apple');
INSERT INTO cust(id, name) VALUES (3, 'Banana');

