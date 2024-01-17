# Database Connectivity SQLite-Android-App
The project provides a foundation for managing student information within a mobile application. Users can add new student records, view existing records, and delete records as needed. It serves as an example of integrating a SQLite database into an Android app for basic data management.
## Student Database Connectivity App

This Android application is a simple student database management system that allows users to perform basic CRUD operations (Create, Read, Update, Delete) on student records. The app utilizes SQLite as the embedded database to store and manage student information.

## Insertion

## Project Components

1. **Database Helper Class (`MyDB.java`):**
   - Manages database creation and upgrades.
   - Provides methods for inserting, displaying, and deleting student data.

2. **Main Activity Class (`MainActivity.java`):**
   - Handles user interactions and communicates with the database helper class.
   - Includes buttons for inserting, displaying, and deleting data, and EditText fields for student ID and name.

3. **XML Layout File (`activity_main.xml`):**
   - Defines the layout of the main activity.
   - Includes UI components such as `TextView`, `EditText`, and `Button`.

## Features Used

- **SQLite Database:** Embedded database for efficient data storage.
- **Android UI Components:** Utilizes EditText, TextView, and Button for a user-friendly interface.
- **Android Toast:** Provides feedback to users through toast messages.
- **ConstraintLayout:** Responsive and flexible UI layout.
- **Database CRUD Operations:** Allows users to manage student records.

## Usage

1. **Insert Data:**
   - Enter student ID and name.
   - Click the "Insert to DB" button.

2. **Display Data:**
   - Click the "Display DB" button to view existing records.

3. **Delete Data:**
   - Enter the student ID to be deleted.
   - Click the "Delete from DB" button.

## How to Run

- Open the project in Android Studio.
- Run the app on an Android emulator or device.

## Contributing

Contributions are welcome! Feel free to open issues or submit pull requests.

## License

This project is licensed under the [MIT License](LICENSE).


