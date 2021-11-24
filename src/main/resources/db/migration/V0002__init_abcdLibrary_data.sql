INSERT INTO book
(id, author_name, author_surname, book_name, edition, "language", page_number, uuid)
VALUES
(1, 'John', 'White', 'White Flow', '2nd ed', 'eng', 60, '8ca2370f-e81c-40fa-ab4b-89e92b5db276'),
(2, 'Abraham', 'White', 'White Flow', '1nd ed', 'eng', 80, '8ca2370f-e81c-40fa-ab4b-89e92b5db277');

INSERT INTO dvd
(id, director_name, director_surname, duration, dvd_name, genres, "language", uuid, "year")
values
(1, 'Boni', 'Brown', '1:55', 'Black', 'Horror', 'Eng', '8ca2370f-e81c-40fa-ab4b-89e92b5db278', '1999'),
(2, 'Jace', 'Tony', '2:30', 'Truman Show', 'Comedi', 'Eng', '8ca2370f-e81c-40fa-ab4b-89e92b5db279', '1999');


INSERT INTO member
(id, address1, address2, card_registration_number, email, "name", phone, surname, username, uuid)
values
(1, '341 Roe Ave', 'Toronto', '1234', 'selena@gmail.com', 'selena', '6487895623','york', 'selena', '8ca2370f-e81c-40fa-ab4b-89e92b5db280'),
(2, '3 Elm Street', 'Toronto', '1894', 'patric@gmail.com', 'patric', '6487894689','york', 'patric', '8ca2370f-e81c-40fa-ab4b-89e92b5db281');

