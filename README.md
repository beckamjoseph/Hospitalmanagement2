**University Management System**

This Java application simulates a university management system login and dashboard, showcasing basic GUI elements and OOP principles.

**Object-Oriented Programming (OOP) Principles:**
Encapsulation: Data (username, password) is encapsulated within the Login class, and methods (actionPerformed) control access and manipulation.
Inheritance: The Project and university classes inherit from JFrame, providing a common foundation for window management.
Polymorphism: The actionPerformed method in both Login and Project exhibits polymorphism, handling button clicks differently in each class.

**Java Swing:**

Extensive use of Java Swing components like JFrame, JLabel, JTextField, JPasswordField, JButton, JMenuBar, and JMenuItem to create the graphical user interface.
ImageIcon and Image classes are employed for loading and scaling images.


**Application Algorithm:**

Launch: The university class initializes, displays a splash screen animation using a separate thread (t), and then transitions to the login screen (Login object).
Login:
The user enters their credentials in the Login window.
Upon clicking "Login," the actionPerformed method:
Hides the login window.
Creates a new Project instance, effectively navigating to the main application window.
Main Dashboard (Project):
A menu bar is displayed with options for managing information, consulting doctors, viewing details, prescriptions, and exiting.
Selecting "Exit" from the menu bar triggers the actionPerformed method in Project, hiding the window and terminating the application.
Code Improvements for Stronger OOP:

Data Access: Consider creating an Account class to encapsulate user credentials (username, password) and implement methods for validation and potential database interaction.
Modularization: Divide the application into smaller, reusable classes like HospitalInformation, Consultant, and Details to represent distinct functionalities within the system.
Inheritance Hierarchy: Explore creating a class hierarchy where Login, Project, and potentially other components inherit from a base class with common functionalities like window management.
Event Handling Improvements: Consider using a design pattern like the Observer pattern for more decoupled event handling between components.
