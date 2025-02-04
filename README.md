## **Spring Boot CRUD API with MongoDB**

A simple RESTful API built with **Spring Boot** and **MongoDB**, demonstrating basic CRUD operations.

### **Tech Stack**
- **Spring Boot** (REST API)
- **MongoDB** (Database)
- **Spring Data MongoDB** (Repository)
- **Java 17+**

### **Setup & Run**
1. Clone the repository:
   ```sh
   git clone <repo-url>
   cd <project-folder>
   ```
2. Configure **application.properties** with MongoDB connection:
   ```properties
   spring.data.mongodb.uri=mongodb://localhost:27017/your_db
   ```
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

### **License**
This project is open-source and free to use.