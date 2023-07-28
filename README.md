# Customer Management API

The Customer Management API is a Spring Boot application that provides endpoints to manage customer information. It allows users to perform CRUD (Create, Read, Update, Delete) operations on customer data.

## Features

- Get a list of all customers.
- Add a new customer.
- Update an existing customer.
- Delete a customer by ID.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA (Java Persistence API)
- Maven (for dependency management)

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher.
- Maven installed (for building and running the project).

### Installation and Setup

1. Clone the repository:

   ```bash
   git clone https://github.com/ThunderSmoker/SpringBoot-CRUD.git
   cd customer-management-api
   ```
2.Build Project:

   ```bash
   mvn clean package
   ```
3.Run the Application
   ```bash
   mvn spring-boot:run
   ```

## Endpoints

| Method | Endpoint                   | Description                      |
| ------ | -------------------------- | -------------------------------- |
| POST   | /api/customers             | Create a new customer record.    |
| GET    | /api/customers             | Retrieve all customer records.   |
| GET    | /api/customers/{id}        | Retrieve a specific customer.    |
| PUT    | /api/customers/{id}        | Update an existing customer.     |
| DELETE | /api/customers/{id}        | Delete a customer record.        |
