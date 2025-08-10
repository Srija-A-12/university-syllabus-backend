
# 🎯 University Syllabus Management – Backend Service

## 📖 Project Purpose

This project is a backend service developed to power a **university syllabus management system**.
It was designed to be consumed by a separate frontend application, providing REST API endpoints to manage **Departments, Semesters, Subjects, and Syllabi**.

A **Spring Boot RESTful API** with a clean layered architecture (Controller → Service → Repository → Entity) that supports **CRUD operations** and integrates easily with any frontend (React, Angular, Vue, etc.).


# ✨ Key Responsibilities & Contributions

* Designed and implemented **RESTful APIs** for all core entities.
* Structured the project using **Spring Boot layered architecture** for scalability.
* Used **H2 in-memory database** for rapid testing and development.
* **Postman-tested** all endpoints before frontend integration.
* Prepared the project for **GitHub hosting** and team collaboration.


# 🔹 Features
**CRUD APIs** for:

  * Departments
  * Semesters
  * Subjects
  * Syllabi (with file upload support)
* Layered architecture for maintainability.
* In-memory **H2 Database** for quick setup and testing.
* Fully tested APIs, **ready for frontend consumption**.
* Easily switchable to MySQL/PostgreSQL for production environments.


## 🛠 Tech Stack

| Technology          | Purpose                       |
| ------------------- | ----------------------------- |
| **Java 17**         | Programming language          |
| **Spring Boot 3.x** | Backend framework             |
| **Spring Data JPA** | Database interaction layer    |
| **H2 Database**     | Lightweight in-memory DB      |
| **Maven**           | Build & dependency management |
| **Postman**         | API testing                   |

---

## 📌 API Overview

# Syllabi

| Method | Endpoint                  | Description                  |
| ------ | ------------------------- | ---------------------------- |
| POST   | `/api/syllabi/upload`     | Upload a syllabus with image |
| GET    | `/api/syllabi`            | Retrieve all syllabi         |
| GET    | `/api/syllabi/{id}`       | Get a syllabus by ID         |
| PUT    | `/api/syllabi/{id}`       | Update a syllabus            |
| DELETE | `/api/syllabi/{id}`       | Delete a syllabus            |
| GET    | `/api/syllabi/{id}/photo` | Fetch syllabus image         |

# Subjects

| Method | Endpoint             | Description          |
| ------ | -------------------- | -------------------- |
| POST   | `/api/subjects`      | Create a new subject |
| GET    | `/api/subjects`      | Get all subjects     |
| GET    | `/api/subjects/{id}` | Get a subject by ID  |
| PUT    | `/api/subjects/{id}` | Update a subject     |
| DELETE | `/api/subjects/{id}` | Delete a subject     |

# Departments

| Method | Endpoint       | Description         |
| ------ | -------------- | ------------------- |
| GET    | `/departments` | Get all departments |
| POST   | `/departments` | Create a department |

# Semesters

| Method | Endpoint              | Description        |
| ------ | --------------------- | ------------------ |
| GET    | `/api/semesters`      | Get all semesters  |
| GET    | `/api/semesters/{id}` | Get semester by ID |
| POST   | `/api/semesters`      | Create a semester  |
| PUT    | `/api/semesters/{id}` | Update a semester  |
| DELETE | `/api/semesters/{id}` | Delete a semester  |


## 💻 Running the Project Locally

### **Prerequisites**

* Java 17+
* Maven

### **Steps**

```
# Clone the repository
git clone https://github.com/Srija-A-12/university-syllabus-backend.git

# Navigate into the project folder
cd university-syllabus-backend

# Run the application
mvn spring-boot:run
```

### **Access the API**

base URL: `http://localhost:8080`
H2 Console: `http://localhost:8080/h2-console`

  * JDBC URL: `jdbc:h2:mem:testdb`
  * User: `sa`
  * Password: *(empty)*


## 📂 Project Structure

```
com.srija.syllabusproject
 ├── controller    # REST API endpoints
 ├── entity        # JPA entities
 ├── repository    # Spring Data JPA repositories
 ├── service       # Service interfaces
 └── serviceImpl   # Service implementations
```

🧪 Testing
Postman Collection was created to test all endpoints (CRUD for Departments, Semesters, Subjects, Syllabi).

Each API was verified for:
    Correct request/response format
    Validation handling for incorrect inputs
    File upload functionality
    Database persistence in H2

Future plan: Add JUnit + Mockito unit tests for service and controller layers.

🚀 Future Improvements

Integrate Swagger/OpenAPI documentation.

* Add Spring Security with JWT for authentication & authorization.

* Implement Global Exception Handling for better API responses.

* Replace H2 Database with MySQL/PostgreSQL for production.

* Write JUnit + Mockito tests for automated backend testing.

* Add CI/CD pipeline for deployment automation.



## 📜 License

This project is open-source and available under the **MIT License**.

