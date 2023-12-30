#####**Employee Management System User Manual**

## **Introduction**

The Employee Management System is a software application designed to manage employee details efficiently. This system provides functionalities to add, search, and view employee information.

## **System Requirements**

Java Runtime Environment (JRE)

Operating System: Windows, macOS, or Linux

## **Installation**

Download: Obtain the application package from [GitHub](https://github.com/HimanM/OOP_Employee_Detail).

Run Application: Execute the JAR file or run the application using the command line.

Usage: Follow the instructions below to utilize the functionalities.

## **Login**

Username: Enter your username to access the system.

Password: Provide your password to log in securely.

Access: After successful authentication, you'll gain access to the functionalities depending on the role.

## **Functionality Overview**

### **Login Authentication**

- Enter your registered username and password to log in securely.
- Incorrect credentials will prompt an error message. Re-enter valid details for access.

1. Enter the username and password.
2. Click log in.

Both HR and Admins can you this method to log into their corresponding interfaces. System will automatically determine the role based on the username.

### **HR Functions (HR interface)**

1. Click on Add Departments/ Designations button to access the interface to add designations and departments.
2. Click Add Employee button to access the interface to add employees.
3. Click Search Employee Details to access the interface to search for employee records.
4. Click log out to log out and go back to login interface.

### **1. Add Departments and Designations.**

1. Use the text fields to insert designations and departments.
2. Click Add button to insert values into the database (text files).
3. Error messages will appear if the value already exists.
4. If the values are written successfully, success indicator message will appear.

### **2. Add Employees**

1. Use the text fields to insert employee name and EPF numbers.
2. Use the combo boxes to select the employee designation and department.
3. Click Add button to insert values into the database (text files).
4. Error messages will appear if the fields are empty.
5. If the record is successfully inserted into the database, a message will appear indicating the success.

### **3. Search Employees**

1. Use the text fields and combo boxes to insert employee name, EPF numbers, designation, and department. (System has the ability to choose only one criteria to search)
2. Click search button.
3. Error messages will appear if the system can't find any results, or no data inserted to search.
4. If the record is successfully found, A table will appear depicting the full details about the employee.

### **Administrator Functions (Admin Interface)**

1. Select "Create HR Account" to access the HR account creating interface.
2. Select "Back" to go back to login interface.

### **1. Create HR Accounts**

1. Use the text fields to insert HR username and passwords.
2. Use the radio buttons to select the role (HR manager or HR assistant).
3. Click Add button to insert values into the database (text files).
4. Error messages will appear if the fields are empty, password mismatch, or the username already exists.
5. If the record is successfully inserted into the database, a message will appear indicating the success.

![Shape1](RackMultipart20231230-1-vn3l0v_html_e0d7f4e5489d307e.gif)
##### **Source Code**

The source code is divided into several classes, each responsible for a specific aspect of the Employee Management System.

These classes utilize Java's Object-Oriented Programming principles to structure the system and its functionalities. Here are the key classes with their functionalities.

- Employee Class: Represents an individual employee.
- FileHandler Class: Manages file read and write operations.
- Search\_Employee\_Interface Class: Handles the search interface.
- Display\_Employee\_Details Class: Manages the display of employee details.

### **Object-Oriented Concepts**

1. Encapsulation: Each class encapsulates related functionalities and data.
2. Inheritance: Swing components inherit properties from their respective parent classes.
3. Polymorphism: Methods like displayEmployeeDetails perform different actions based on input data.
4. Abstraction: Hides complex implementation details, providing a simplified user interface.
5. Modularity: Code is organized into separate classes, promoting reusability and maintenance.
6. Composition: Combines different Swing components to create the user interface.
7. The system utilizes Swing components to create an interactive graphical user interface (GUI) for managing employees. It applies core Object-Oriented Programming concepts to structure the code, promote code reuse, and enhance maintainability.

## **Package: oop\_employee\_detail**

**Overview**

The oop\_employee\_detail package contains classes related to an Employee Management System. It facilitates the management of employee details, search functionalities, and graphical representation of employee data. Also it manages login information related to HR managers.

### **FileHandler.java**

This script, `FileHandler`, primarily deals with file input and output operations. Here's a breakdown of its functionalities:

1. readAndStoreInArray Method

- Purpose: Reads data from a file and stores each line in an ArrayList.
- Arguments: `String fileName` - the name of the file to be read.
- Functionality: Opens the specified file, reads its contents line by line, and stores each line in an `ArrayList`. Finally, it returns an array containing all the lines read from the file.

1. readAndReturnFile` Method

- Purpose: Creates a new file if it doesn't exist and returns the file object.
- Arguments: `String fileName` - the name of the file to be created.
- Functionality: Checks if the file exists. If it doesn't, it creates a new file with the specified name. It then returns the file object whether it was created or already existed.

1. checkValues` Method

- Purpose: Checks if a specified value exists in a file.
- Arguments: `String fileName` - the name of the file to be checked, `String value` - the value to be searched in the file.
- Functionality: Opens the specified file, reads each line, and checks if the provided value exists in any line. If found, it returns `true`; otherwise, it returns `false`.

1. checkValuesHR` Method

- Purpose: Specifically checks values within an HR logins file.
- Arguments: `String value` - the value to be searched in the HR logins file.
- Functionality: Reads an HR logins file (`HR_logins.txt` in the specified directory), splits each line by `---`, extracts the username, and compares it with the provided value. If a match is found, it returns `true`; otherwise, it returns `false`.

Overall, this `FileHandler` class encapsulates various file handling functionalities like reading file content into an array, creating a new file, and checking for values within files or specifically within an HR logins file.

### **Login.java**

This script represents a Swing-based GUI for a login interface. Let's break down its key components:

1. GUI Design

- It's a Swing-based GUI built using Java's `javax.swing` components.
- The layout consists of two main panels (`jPanel1` and `jPanel2`), where `jPanel1` contains some graphical elements and `jPanel2` contains the login form.
- The login form (`jPanel2`) consists of input fields for username and password (`txtUserName` and `txtPassword`), labels for these fields, and a login button (`btnLogin`).

1. Functionality

- Constructor: Initializes the GUI components and sets the frame to non-resizable.
- btnLoginActionPerformed` Method: Handles the login process when the login button is clicked.
- It checks if the username and password fields are empty. If so, it displays an error message.
- For the hardcoded admin credentials ("Admin" and "Himan@123"), it opens an `Admin_Interface` window upon successful login.
- For other user logins, it reads the credentials from the "HR\_logins.txt" file (in a specific format: username---password---role). If the entered credentials match, it opens an `HR_Interface` window; otherwise, it shows an error message.

1. File Handling

- It uses `FileReader` and `BufferedReader` to read the contents of the "HR\_logins.txt" file and validate user credentials.

1. Main Method

- Sets the look and feel for the Swing components and initializes the GUI by invoking `new Login().setVisible(true)`.

This script creates a login interface using Swing components and performs login authentication based on hardcoded admin credentials and data stored in an "HR\_logins.txt" file for other users.

### **Admin\_Interface.java**

This script creates a Swing-based GUI for the admin interface. Here's a breakdown of its main components:

1. GUI Design

- The GUI contains a panel (`jPanel1`) with the title "Welcome Admin", and it displays two buttons: "Create HR Account" and "Back".
- The "Create HR Account" button opens a new window for creating HR accounts (`Create_HR_Interface`).
- The "Back" button redirects back to the login interface (`Login`).

1. Constructor

- Initializes the GUI components and sets the frame to non-resizable.

1. Event Handling

- btnCreateHrAccountActionPerformed` Method: Handles the action when the "Create HR Account" button is clicked. It opens the interface to create HR accounts.
- btnBackActionPerformed` Method: Handles the action when the "Back" button is clicked. It returns to the login interface.

1. Main Method

- Sets the look and feel for the Swing components and initializes the GUI by invoking `new Admin_Interface().setVisible(true)`.

This script essentially creates an admin interface that allows the admin user to navigate to the HR account creation interface or return to the login interface.

### **Create\_HR\_Interface.java**

This Java class represents a Swing-based interface for creating HR accounts. Here's an overview of its functionalities:

1. GUI Design

- The interface contains fields to input the username, password, and confirm password.
- Two radio buttons allow selecting the role: "HR Manager" or "HR Assistant."
- Two buttons: "Create Account" and "Go Back."

1. Constructor

- Initializes the GUI components.

1. Event Handling

- btnCreateAccountActionPerformed` Method: Handles the action when the "Create Account" button is clicked.
- Checks if the fields are empty, if a role is selected, if the username already exists, if passwords match, and if the password length is sufficient.
- If all conditions are met, the user data (username, password, and role) is written to the "HR\_logins.txt" file.
- btnGobackActionPerformed` Method: Handles the action when the "Go Back" button is clicked. It returns to the Admin interface.

1. Main Method

- Sets the look and feel for the Swing components and initializes the GUI by invoking `new Create_HR_Interface().setVisible(true)`.

This class encapsulates the creation of HR accounts by validating inputs and writing the details to a file.

### **HR\_Interface.java**

This Java class represents the interface for Human Resources (HR) users and has functionalities to manage departments, employees, and employee details. Here's a breakdown of its components and functionalities:

1. GUI Design

- Displays buttons to add departments/designations, add employees, and search employee details.
- Includes a "Log Out" button.

1. Constructor

- Initializes the GUI components and sets the frame as non-resizable.

1. Event Handling

- `addDepartmentsActionPerformed` Method: Handles the action when the "Add Departments/Designations" button is clicked. It opens the interface for adding departments.
- `addEmployeesActionPerformed` Method: Handles the action when the "Add Employees" button is clicked. It opens the interface for adding employees.
- `searchEmployeeActionPerformed` Method: Handles the action when the "Search Employee Details" button is clicked. It opens the interface for searching employee details.
- `btnLogoutActionPerformed` Method: Handles the action when the "Log Out" button is clicked. It returns to the Login interface.

1. Main Method

- Sets the look and feel for the Swing components and initializes the GUI by invoking `new HR_Interface().setVisible(true)`.

This class serves as the user interface for HR-related tasks, allowing HR users to manage departments, employees, and employee details within the system.

### **Add\_Dept\_Interface.java**

This Java code represents a Swing-based user interface for adding departments and designations in an employee management system. Here's a breakdown of the functionality:

1. Interface Components

- It includes labels (`JLabel`) for "Add Dept/Designation," "Department," and "Designation."
- Text fields (`JTextField`) for users to input department and designation names.
- Buttons (`JButton`) labeled "Add" for adding departments and designations and a "Go Back" button to return to the HR interface.

1. Listeners

- The "Add" buttons (`addDepartment` and `addDesignation`) have action listeners that trigger the addition of departments and designations respectively to specific text files (`departments.txt` and `designations.txt`) stored in a specific directory (`src\oop_employee_detail\Sources\`).
- Before adding, the code checks for empty fields and whether the department or designation already exists in the respective text file using a `FileHandler` class.

1. Error Handling

- If the fields are empty or if the department/designation already exists, it displays an error message using `JOptionPane`.
- For successful additions, it writes the new department/designation to the appropriate text file.

1. Navigation

- The "Go Back" button (`btnGoBack`) returns to the HR Interface (`HR_Interface`) when clicked.

This code provides a basic interface to add departments and designations, storing them in text files.

### **Add\_Employees\_Interface.java**

This Java code is a Swing-based user interface for adding employee details to a system. Here's a breakdown of its functionality:

1. Interface Components

- Labels (`JLabel`) for "Add Employees," "Employee Name," "EPF Number," "Designation," and "Department."
- Text fields (`JTextField`) for users to input employee name and EPF number.
- Combo boxes (`JComboBox`) to select designation and department from available options retrieved from files.
- Buttons (`JButton`) labeled "Add Record" to add employee details and "Go Back" to return to the HR interface.

1. Initialization

- Reads department and designation details from text files (`departments.txt` and `designations.txt`) using `FileHandler` class and populates the combo boxes (`cmbDeparment` and `cmbDesignation`) with the retrieved data.

1. Adding Employee Record

- When the "Add Record" button is clicked (`btnAddRecord`), it collects employee details from the text fields and selected values from the combo boxes.
- Checks for empty fields and displays an error message if any field is empty.
- Constructs a record string with employee details and appends it to an `employee_details.txt` file using a `FileWriter` and `BufferedWriter`.
- Displays a success message upon successful addition.

1. Navigation

- The "Go Back" button (`btnGoback`) returns to the HR Interface (`HR_Interface`) when clicked.

Overall, this code provides a interface to add employee details, using combo boxes for designations and departments retrieved from text files.

### **Search\_Employee\_Interface.java**

This Java code is another part of an employee management system. This specific class (`Search_Employee_Interface`) provides a user interface for searching employee details based on certain criteria. Here's a breakdown:

1. Interface Components

- Labels (`JLabel`) for "Search Employees," "Employee Name," "EPF Number," "Designation," and "Department."
- Text fields (`JTextField`) for users to input employee name and EPF number.
- Combo boxes (`JComboBox`) to select designation and department from available options retrieved from files.
- Buttons (`JButton`) labeled "Search" to execute the search and "Go Back" to return to the HR interface.

1. Initialization

- Reads department and designation details from text files and populates the combo boxes (`cmbDeparment` and `cmbDesignation`) with the retrieved data. It appends a "null" option at index 0 in each combo box.

1. Search Functionality

- When the "Search" button (`btnAddRecord`) is clicked, it collects input values from the text fields and selected values from the combo boxes.
- Reads through an `employee_details.txt` file to find records that match the search criteria.
- Constructs a string containing the matched records and passes this data to the `Display_Employee_Details` class for display in a separate window.
- If no matches are found, it displays an error message.

1. Navigation

- The "Go Back" button (`btnGoback`) returns to the HR Interface (`HR_Interface`) when clicked.

This code implements a search functionality for employee records. Similar to other parts of this system, it reads data from files and uses Swing components for the user interface. There's error handling for empty search criteria, and it displays appropriate messages based on search results.

### **Display\_Employee\_Details.java**

This Java code defines a class called `Display_Employee_Details`, which is a JFrame for displaying employee details in a table format.

1. Interface Components

- Label (`JLabel`) for "Employee Details."
- Table (`JTable`) to display employee information in a tabular form with columns for "Employee Name," "EPF no.," "Designation," and "Department."
- Button (`JButton`) labeled "Go Back" to return to the search interface.

1. Initialization

- Initializes the frame and sets it to not resizable.

1. Displaying Employee Details

- The `displayEmployeeDetails` method receives a string (`employeeData`) containing employee details in a specific format.
- Splits the data based on newline characters to get individual employee records.
- For each employee record, splits the data further using the separator " ---- " to extract and display each employee's details in the table.

1. Navigation

- The "Go Back" button (`btnBack`) returns to the Search Employee Interface (`Search_Employee_Interface`) when clicked.

This class is responsible for visualizing employee details received in a specific format in a tabular form. It utilizes Swing JTable to present data in a structured layout. The design enables users to navigate back to the search interface easily.
