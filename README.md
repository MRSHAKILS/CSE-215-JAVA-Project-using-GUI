**Introduction:**
Agora-Mart is an advanced retail management system designed to streamline the process of product management for administrators while providing a smooth experience for users. The system offers functionalities such as user login, product viewing, adding, editing, and saving product details persistently. This project employs a Java Swing-based GUI for user interactions, ensuring a user-friendly interface and efficient performance. The primary objective is to replace temporary storage mechanisms, such as ArrayLists, with persistent storage using text files, enabling data retention between sessions.



**Methodology :**
System Design
The Agora-Mart system is composed of several core components:

Admin Login: Provides a secure login interface for administrators.
Admin View: Allows administrators to manage products by viewing, adding, and editing product details.
Product Management: Handles product data storage, retrieval, and display.
User Management: Manages user authentication and details.
Data Storage
To ensure data persistence, the system uses text files (users.txt and products.txt) to store user credentials and product information. These files are read into memory when the application starts and written back to disk when changes are made.


**Class Structure:** 
The system consists of several classes, each with a specific role:

AgoraMart: Main class handling user login and data loading/saving.
AdminLogin: GUI for admin login.
AdminView: GUI for product management.
Product: Abstract class representing a product.
User: Abstract class representing a user.
Admin: Concrete class extending User for administrators.
Customer: Concrete class extending User for customers.
