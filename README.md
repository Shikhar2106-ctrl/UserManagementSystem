# User Management System (Core Java + JDBC)

A console-based backend application built using **Core Java** and **JDBC** that performs CRUD (Create, Read, Update, Delete) operations on user data with **persistent storage using MySQL**.  
The project follows a **layered architecture** with proper separation of concerns.

---

## 📌 Features

- Add a new user to the database
- View all users stored in the database
- Update existing user details
- Delete a user by ID
- Input validation to prevent runtime crashes
- Persistent storage using MySQL (data remains after application restarts)

---

## 🧱 Project Architecture

The project follows a clean, layered design:

Main (UI / Menu)
↓
Service Layer (Business Logic)
↓
DAO Layer (Database Access using JDBC)
↓
MySQL Database


### Package Structure

UserManagementSystem
│
├── main → Application entry point (menu & user input)
├── service → Business logic
├── dao → JDBC database operations
├── model → User entity
├── util → DB connection & input utilities
├── lib → MySQL JDBC driver
└── out → Compiled class files


---

## 🛠 Technologies Used

- **Java (Core Java)**
- **JDBC**
- **MySQL**
- **SQL**
- **Git & GitHub**

---

## 🗄 Database Schema

**Database Name:** `user_management_db`

```sql
CREATE TABLE users (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100)
);

---

## ⚙️ Setup & Installation

Follow the steps below to set up and run the project locally.

---

### 1️⃣ Prerequisites

Ensure the following are installed on your system:

- **Java JDK 17 or above**
  ```bash
  java -version
  MySQL Server (running on default port 3306)

MySQL Server (running on default port 3306)

Git (optional, for cloning repository)

Verify:

SELECT * FROM users;


3️⃣ Add MySQL JDBC Driver

Download MySQL Connector/J from the official MySQL website.

Create a folder named lib in the project root.

Place the JDBC driver JAR file inside it:

lib/mysql-connector-j-8.x.x.jar

4️⃣ Configure Database Connection

Open util/DBConnection.java and update your credentials:

private static final String URL = "jdbc:mysql://localhost:3306/user_management_db";
private static final String USER = "root";
private static final String PASSWORD = "your_mysql_password";

5️⃣ Compile the Project

From the project root directory, run:

javac -cp "lib/*" -d out model/*.java util/*.java dao/*.java service/*.java main/*.java


This will compile all source files and generate .class files inside the out directory.

6️⃣ Run the Application
java -cp "out;lib/*" main.Main
