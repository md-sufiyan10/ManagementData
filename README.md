Product Management API:
📦 Features
**Insert a single product
Insert multiple products
Retrieve a product by ID
Retrieve all products
Update a product
Delete a product by ID
Delete all products**
-------------------
🛠️ Tech Stack
**Java 17+
Spring Boot
Spring Web
Spring Data JPA
MySQL (or any JPA-compatible database)**
-------------------------
Project Structure:
com.sufi.tech
├── controller       // REST API controllers
├── entity           // JPA entities
└── service          // Business logic
Configure your database in application.properties
----------------------------------
API Endpoints:
--------------------------
| Method | Endpoint              | Description                |
| ------ | --------------------- | -------------------------- |
| POST   | `/product/insert`     | Insert a single product    |
| POST   | `/product/multiple`   | Insert multiple products   |
| GET    | `/product/{id}`       | Get product by ID          |
| GET    | `/product/getAllData` | Get all products           |
| PUT    | `/product/update`     | Update an existing product |
| DELETE | `/product/{id}`       | Delete product by ID       |
| DELETE | `/product/allDelete`  | Delete all products        |
-------------
JSON for Product:-Add Multiple data
--------------------------
  [
  {
    "pro_name": "Mouse",
    "pro_desc": "Wireless mouse",
    "pro_price": 25.00
  },
  {
    "pro_name": "Keyboard",
    "pro_desc": "Mechanical keyboard",
    "pro_price": 70.00
  }

-------------

