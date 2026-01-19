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


## ⚙️ Setup & Installation
1️⃣ Prerequisites

Java JDK 17 or above

MySQL Server (running on port 3306)

MySQL Connector/J (JDBC Driver)

2️⃣ Configure Database
CREATE DATABASE user_management_db;
USE user_management_db;


Create the table using the schema above.

3️⃣ Add JDBC Driver

Place the MySQL JDBC driver inside a lib folder:

lib/mysql-connector-j-8.x.x.jar

4️⃣ Update Database Credentials

In DBConnection.java:

private static final String URL = "jdbc:mysql://localhost:3306/user_management_db";
private static final String USER = "root";
private static final String PASSWORD = "your_password";


▶️ Compile & Run

From the project root directory:

Compile
javac -cp "lib/*" -d out model/*.java util/*.java dao/*.java service/*.java main/*.java

Run
java -cp "out;lib/*" main.Main
