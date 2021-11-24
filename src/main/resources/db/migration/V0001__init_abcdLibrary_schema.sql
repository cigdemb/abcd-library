CREATE TABLE book
(
    id bigserial NOT NULL,
    author_name varchar(25) NOT NULL,
    author_surname varchar(25) NOT NULL,
    book_name varchar(100) NOT NULL,
    edition varchar(25) NOT NULL,
    "language" varchar(25) NOT NULL,
    page_number int4 NOT NULL,
    uuid uuid NOT NULL,
    CONSTRAINT book_pkey PRIMARY KEY (id)

);

CREATE TABLE member
(
    id bigserial NOT NULL,
    address1 varchar(50) NOT NULL,
    address2 varchar(50) NOT NULL,
    card_registration_number varchar(25) NOT NULL,
    email varchar(120) NOT NULL,
    "name" varchar(25) NOT NULL,
    phone varchar(25) NOT NULL,
    surname varchar(25) NOT NULL,
    username varchar(25) NOT NULL,
    uuid uuid NOT NULL,
    CONSTRAINT member_pkey PRIMARY KEY (id)

);

CREATE TABLE dvd
(
    id bigserial NOT NULL,
    director_name varchar(25) NOT NULL,
    director_surname varchar(25) NOT NULL,
    duration varchar(25) NOT NULL,
    dvd_name varchar(100) NOT NULL,
    genres varchar(25) NOT NULL,
    "language" varchar(25) NOT NULL,
    uuid uuid NOT NULL,
    "year" varchar(25) NOT NULL,
    CONSTRAINT dvd_pkey PRIMARY KEY (id)
);