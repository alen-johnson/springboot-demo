## **Spring Boot CRUD API with MongoDB**

A simple RESTful API built with **Spring Boot** and **MongoDB**, demonstrating basic CRUD operations.

### **Tech Stack**
- **Spring Boot** (REST API)
- **MongoDB** (Database)
- **Spring Data MongoDB** (Repository)
- **Java 17+**

### **Setup & Run**
1. Clone the repository:
2. Configure **application.properties** with MongoDB connection:
3. Run the application:
   ```sh
   mvn spring-boot:run
   ```

### **API Endpoints**
| Method | Endpoint               | Description            |
|--------|------------------------|------------------------|
| `GET`  | `/api/employees`       | Get all employees     |
| `GET`  | `/api/employees/{id}`  | Get employee by ID    |
| `POST` | `/api/employees`       | Add new employee      |
| `PATCH`| `/api/employees/{id}`  | Update employee       |
| `DELETE` | `/api/employees/{id}` | Delete employee       |

### **Example Request (POST)**
```json
POST /api/employees
{
  "name": "John Doe",
  "department": "Engineering"
}
```

