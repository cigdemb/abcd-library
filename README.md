# abcd-library
The Library Management System is a Spring Boot application developed using a functional programming style. It provides a RESTful API for managing books, members, and borrowing transactions in a library. The project uses PostgreSQL as the backend database.

Technologies Used
Java 11
Spring Boot
Spring Webflux
Spring Data JPA
PostgreSQL
Getting Started
To run the Library Management System locally, follow these steps:

Ensure that Java 11 and PostgreSQL are installed on your machine.

Clone the repository:

bash
Copy code
git clone https://github.com/your-username/library-management-system.git
Navigate to the project directory:

bash
Copy code
cd library-management-system
Configure the PostgreSQL database connection in the application.properties file.

Build the application:

bash
Copy code
./mvnw clean package
Run the application:

bash
Copy code
./mvnw spring-boot:run
The application should now be running at http://localhost:8080.

API Documentation
The Library Management System provides the following RESTful APIs:

Books API:

GET /api/books - Retrieve all books.
GET /api/books/{id} - Retrieve a specific book by ID.
POST /api/books - Create a new book.
PUT /api/books/{id} - Update a book.
DELETE /api/books/{id} - Delete a book.
Members API:

GET /api/members - Retrieve all members.
GET /api/members/{id} - Retrieve a specific member by ID.
POST /api/members - Create a new member.
PUT /api/members/{id} - Update a member.
DELETE /api/members/{id} - Delete a member.
Borrowings API:

GET /api/borrowings - Retrieve all borrowings.
GET /api/borrowings/{id} - Retrieve a specific borrowing by ID.
POST /api/borrowings - Create a new borrowing.
PUT /api/borrowings/{id} - Update a borrowing.
DELETE /api/borrowings/{id} - Delete a borrowing.
