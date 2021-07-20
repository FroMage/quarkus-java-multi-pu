CREATE SEQUENCE hibernate_sequence;
SELECT setval('hibernate_sequence', 3);
CREATE TABLE admin
(
  id   INT,
  name VARCHAR(40)
);
INSERT INTO admin(id, name) VALUES (1, 'Cherry');
INSERT INTO admin(id, name) VALUES (2, 'Apple');
INSERT INTO admin(id, name) VALUES (3, 'Banana');

