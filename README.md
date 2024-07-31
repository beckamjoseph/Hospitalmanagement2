**Bingham University Hospital Management System**
This Java application simulates a university management system with login and registration functionalities, showcasing basic GUI elements and Object-Oriented Programming (OOP) principles.

**Features**
- User Registration: Allows users to register by providing a username, password, and matriculation number.
- User Login: Authenticates users based on the registered credentials.
- Graphical User Interface: Utilizes Java Swing components for an interactive user interface.
- Image Handling: Loads and displays images in the application.
  
**OOP Principles**
Encapsulation:
- Data Encapsulation: User data (username, password) is encapsulated within the Login and signup classes. Access to these fields is managed through methods.
- Inheritance
The signup and Login classes extend JFrame, inheriting properties and behaviors for window management.
- Polymorphism
The actionPerformed method in both signup and Login classes exhibits polymorphism, handling button click events differently based on the source of the event.
- Java Swing Components
The application extensively uses Java Swing components to create a user-friendly interface:

- JFrame: Main window for both registration and login.
- JLabel: Labels for text fields and images.
- JTextField: Input fields for text data.
- JPasswordField: Input field for password data.
- JButton: Buttons for actions like registration and login.
- ImageIcon and Image: For loading and scaling images.
  
**Application Workflow**
- Launch: The application starts by displaying the registration window (signup class).
- Registration: Users can register by entering a username, password, and matriculation number. The data is saved to a file (txtlogin.txt).
- Login: After registration, users can log in by entering their username and password. The credentials are validated against the saved data.
Successful Login: Upon successful login, the application transitions to the main dashboard (Project class).

**Code Structure**
- signup Class
Handles user registration.
 Collects username, password, and matriculation number.
 Saves user data to a file (txtlogin.txt).
- Login Class
 Handles user authentication.
 Validates username and password against the saved data.
 Displays appropriate messages for successful or failed login attempts.
 Code Improvements for Stronger OOP

**Data Access**
Consider creating an Account class to encapsulate user credentials and implement methods for validation and potential database interaction.
- Modularization
 Divide the application into smaller, reusable classes like HospitalInformation, Consultant, and Details to represent distinct functionalities within the system.
- Inheritance Hierarchy
 Explore creating a class hierarchy where Login, Project, and potentially other components inherit from a base class with common functionalities like window management.
- Event Handling Improvements
 Consider using a design pattern like the Observer pattern for more decoupled event handling between components.
- Running the Application
 To run the application, compile and execute the signup and Login classes. The registration window will be displayed first.

**Dependacies**
- Java swing
- Java Development kit (JDK).
