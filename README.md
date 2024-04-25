
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Walker Black               |
| Date         | 04/25/2024                 |
| Course       | Spring                     |
| Assignment # | 6                          |

# Assignment Overview
The objective of this assignment is to refactor a previous assignment to improve the code quality. I chose to refactor
assignment #1 by removing unnecessary inheritance structures, replacing some Strings with Enum values, replacing
"magic numbers" with constants, and implementing the factory method design pattern.

The original objective of assignment #1 was to create an application capable of controlling an automated beverage 
vending machine. The user can order various coffee or tea products as well as add condiments to their order. A
more complete description of the application is found in the assignment #1 read me.

# GitHub Repository Link:
https://github.com/wablack01/cs-665-assignment-6

# Refactoring Changes
- Factory Method Pattern
  - I implemented the factory method pattern for the creation of beverages. The name of a beverage is given to the
  BeverageMachine which uses the CoffeeTeaBeverageFactory to create the appropriate beverage. The factory then creates
  a new Coffee or Tea with the appropriate ratio of ingredients based on the chosen beverage type. These leads to
  a better separation of concerns as the factory is responsible for determining the correct beverage type.
- Unnecessary Inheritance Structures
  - I removed the various types of Coffee, Tea, and Condiment subclasses from the project. These subclasses did not
  add new functionality and only served to call the super class constructor with the ingredients/properties of each
  beverage. Instead of subclasses all beverages and condiments are instantiated as Coffee, Tea, or Condiment classes
  with properties that signal their type. Instead of defining the ingredient quantities in the subclasses they are given
  to the appropriate constructor by the CoffeeTeaBeverageFactory. This simplifies the inheritance structure and makes
  it easier to add new beverage types.
- Removing Magic Numbers
  - Ingredient quantities were originally defined in the Coffee and Tea subclass constructors. They are now defined
  as constants in the Constants class and are given to the Coffee and Tea constructors in the CoffeeTeaBeverageFactory.
  This leads to better code clarity as the purpose of the numbers is clearly defined, and easier to maintain code
  if these values ever need to change they are all in one place.
- Replacing Strings as Enums
  - I added the CondimentType enum to define condiment types rather than use a String. This is a small change but leads
  to better type safety and enhanced code clarity.

# Implementation Description
- New beverage types can be added as subclasses of Beverage, and new condiments added as a CondimentType enum.
New types of Coffee or Tea do not need to be created as new subclasses, but their ingredient quantities must
be given to the CoffeeTeaBeverageFactory.

- Classes are placed in organized packages with other similar classes. The role of each class and function is clear from
its name and the code is well commented. I also removed unnecessary subclasses which had made the file structure
too complicated.

- To avoid duplicate code I removed unnecessary subclasses whose only purpose was to call the parent class. This
code has been replaced in the CoffeeTeaBeverageFactory.

- I added the factory method pattern to this application. The CoffeeTeaBeverageFactory class handles the creation
of different beverage types selected by the user. The application generates different types of related objects 
(Beverages) based on the customer's selection which the factory method pattern handles very well.

# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/) on your system. 

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains information about the project, such as its dependencies, the build configuration, and the plugins used for building and packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports, and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile
Type on the command line: 

```bash
mvn clean compile
```



## JUnit Tests
JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:
```bash
mvn clean test
```


## Spotbugs 

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


## Checkstyle 

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on any issues or violations of the coding standards defined in its configuration. This includes issues like code style, code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices, making it easier for other developers to read and maintain. It can also help to identify potential issues before the code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser. 

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`




