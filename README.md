# University ERP System

A Java-based University ERP System that manages academic operations for **Students**, **Instructors**, and **Administrators**.  
The system uses **role-based access control**, a **separate authentication database**, and a **desktop GUI built with Java Swing**.

---

##  Features Overview

###  Authentication & Roles
- Secure login system using a separate **Auth Database**
- Roles supported:
  - **Admin**
  - **Instructor**
  - **Student**
- Session handling using a centralized `SetSession` utility
- Role-based dashboards and feature access

---

##  Student Features
- Browse course catalog
- Register and drop sections (with capacity and deadline checks)
- View registered sections and timetable
- View grades per course and section
- Download **Transcript (CSV)**
- View personal profile (read-only)

---

##  Instructor Features
- View only assigned sections
- Enter assessment scores (Quiz / Midterm / Endsem)
- Compute final grades based on configured weights
- Import grades from CSV
- Export grades to CSV
- View instructor profile

---

##  Admin Features
- Create users (students / instructors / admins)
- Create and edit courses
- Create and edit sections
- Assign instructors to sections
- Toggle **Maintenance Mode**
- Backup and restore ERP database

---

##  Maintenance Mode
- When enabled:
  - Students and instructors can **view data**
  - All write actions (register, drop, grade entry) are blocked
- UI shows maintenance banner immediately
- Prevents partial or inconsistent updates during admin operations

---

##  Database Design

### Authentication Database
- `users_auth`
  - user_id
  - username
  - password_hash
  - role
  - status

### ERP Database
- students
- instructors
- courses
- sections
- enrollments
- grades
- assessment_components
- settings

> **Passwords are never stored in the ERP database.**

---

##  Grading System
- Assessment components (Quiz / Midterm / Endsem)
- Configurable weight per section
- Final grade computed using weighted average
- Final grade stored per enrollment

---

##  Project Structure

### `authen/`
- Handles user authentication and authorization
- Manages login, password hashing, failed attempts, and account locking
- Stores session details like user ID, username, and role

---

### `erp/`
Core backend logic of the ERP system

#### `erp/data/`
- Contains DAO (Data Access Object) classes
- Directly interacts with the ERP database using JDBC
- Handles CRUD operations for students, courses, sections, grades, enrollments, and settings

#### `erp/domain/`
- Domain model classes such as `Student`, `Instructor`, `Course`, `Section`, `Enrollment`, and `Grade`
- Represents real-world entities used throughout the system

#### `erp/dto/`
- Data Transfer Objects
- Used to send structured or combined data to the UI
- Example: course-grade views, transcript entries

#### `erp/service/`
- Business logic layer
- Enforces role-based access control and system rules
- Acts as a bridge between UI and DAO layers

#### `ERPConnector`
- Manages database connections to the ERP database

---

### `ui/`
Java Swing based user interface

#### `ui/Admin/`
- Admin dashboard and admin-specific panels
- Features include user creation, course/section management, maintenance mode, and backups

#### `ui/Instructor/`
- Instructor dashboard and panels
- Features include viewing assigned sections, entering grades, computing final grades, and CSV import/export

#### `ui/Student/`
- Student dashboard and panels
- Features include course registration, grade viewing, transcript download, and profile viewing

---

### Core UI Components

#### `LoginFrame`
- Login screen for all users
- Validates credentials and initiates session

#### `RoleRouter`
- Routes users to the correct dashboard (Admin, Instructor, or Student) after login

#### `ERPMain`
- Application entry point
- Initializes the system and loads the login screen

---

---

##  Testing & Validation
- Duplicate enrollments prevented
- Capacity limits enforced
- Deadline checks on add/drop
- Role-based access enforced in service layer
- Maintenance mode blocks all writes
- CSV import/export tested for correctness

---

##  Technologies Used
- Java (JDK 17+)
- Java Swing (GUI)
- MySQL
- JDBC
- CSV file handling
- MVC-style layered architecture

---

##  Setup Instructions

1. Clone the repository
2. Configure MySQL databases (Auth DB + ERP DB)
3. Update DB credentials in `ERPConnector`
4. Ensure MySQL client tools (`mysql`, `mysqldump`) are installed
5. Run `ERPMain.java`

---





