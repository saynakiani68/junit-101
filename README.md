# Library Management System - JUnit Exercise

This project implements a simple library management system in Java as part of the Software Engineering course.

The purpose of the exercise is to practice unit testing with JUnit and understand how code coverage can be used to evaluate a test suite.

## Features

The system allows the user to:

- Add a book to the library
- Remove a book from the library
- Search for books by author
- Search for books by publication year

Each book contains a title, an author, and a publication year.

## Project Structure

The project contains the following main classes:

- `Book` - represents a book and stores its title, author, and publication year.
- `Library` - manages the collection of books and provides methods for adding, removing, and searching for books.
- `Main` - provides a command-line interface for interacting with the library.
- `LibraryTest` - contains the JUnit tests for the library functionality.

## Testing

JUnit 5 is used for unit testing.

The tests cover the main behavior of the `Library` class, including adding and removing books, searching by author and year, and handling searches for books that do not exist.

The `Book` and `Library` classes achieve 100% line coverage in the final test suite.

## Question

### Is it easy to test the `Main` class? Why?

The `Main` class is not as easy to unit test as the `Library` class because it directly handles user input and console output through `Scanner` and `System.out`.

Unit tests are easier to write when the business logic is separated from input/output operations. In this project, most of the actual library behavior is implemented in the `Library` class, so it can be tested independently without requiring user interaction.

Testing `Main` would require simulating console input and capturing console output, which would make the tests more complex and more dependent on implementation details.

A better design for a larger application would be to separate the command-line interface from the application logic. This would improve testability and make the code easier to maintain.

For this exercise, the `Main` class is therefore not unit tested, as indicated in the exercise instructions.
