INSERT INTO author(email, name)VALUES ('Anderson', 'anderson@email.com');

INSERT INTO book(description, price, published_date, title)VALUES ('The good Desing Patterns', 29.90, '2018-09-22T11:11:11.000Z', 'Desing Patterns');
INSERT INTO book(description, price, published_date, title)VALUES ('Spring Boot JPA', 50, '2018-03-22T11:11:11.000Z', 'Spring boot jpa');
INSERT INTO book(description, price, published_date, title)VALUES ('QueryDSL boost', 10.90, '2018-07-22T11:11:11.000Z', 'QueryDSL');
INSERT INTO book(description, price, published_date, title)VALUES ('SQL for dummies', 19.90, '2018-08-22T11:11:11.000Z', 'SQL');
INSERT INTO book(description, price, published_date, title)VALUES ('Java and DateTime', 129.90, '2018-12-22T11:11:11.000Z', 'Java');

INSERT INTO books_authors(book_id, author_id)VALUES (1, 1);
INSERT INTO books_authors(book_id, author_id)VALUES (2, 1);
INSERT INTO books_authors(book_id, author_id)VALUES (3, 1);
INSERT INTO books_authors(book_id, author_id)VALUES (4, 1);
INSERT INTO books_authors(book_id, author_id)VALUES (5, 1);