# Product Management REST API

## Project Description

This application is a simple REST API built with Spring Boot.

The project was created to practice working with REST endpoints, HTTP methods, database operations, and Swagger documentation.

The API allows managing product records using create, read, update, and delete operations.

---

## Application Functions

The system supports:

- Adding new products
- Viewing saved products
- Updating product data
- Removing products
- Testing endpoints using Swagger UI

---

## Technologies Used

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Swagger OpenAPI
- Maven

---

## Example Use Cases

### Add Product

A product can be created by sending a POST request.

```http
POST /api/v1/products
```

Example JSON:

```json
{
  "name": "Keyboard"
}
```

---

### Retrieve Product

Get product information using product id.

```http
GET /api/v1/products/1
```

---

### Modify Product

Update existing product information.

```http
PUT /api/v1/products/1
```

---

### Remove Product

Delete product from database.

```http
DELETE /api/v1/products/1
```

---

## Swagger Testing

Swagger UI was used for testing API endpoints.

```text
http://localhost:8080/swagger-ui/index.html
```

### Swagger Screenshot

![Swagger UI](screenshots/swagger-ui.png)

---

## Database Console

The project uses H2 in-memory database.

```text
http://localhost:8080/console
```

### Database Screenshot

![H2 Database](screenshots/database.png)

---

## Project Layers

- Controller → handles requests
- Service → business logic
- Repository → database communication
- Domain → entity classes
- Support → exception handling and mapping

---

## Running the Project

1. Open project in IntelliJ IDEA
2. Reload Maven dependencies
3. Run Spring Boot application
4. Test endpoints using Swagger or Postman