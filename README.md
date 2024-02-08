
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Walker Black               |
| Date         | 02/08/2024                 |
| Course       | Spring                     |
| Assignment # | 1                          |

# Assignment Overview
The objective of this assignment is to create an application capable of controlling an automated beverage vending
machine. A user can use the machine to order coffee and tea products. Condiments can also be selected to add to the 
beverage. Up to three servings of any selected condiment can be added to the beverage. Coffee products costs $2, tea 
products cost $1.50, and condiments cost $0.50 per serving. When the user is satisfied with their beverage and condiment
selections they can place the order and the beverage will be automatically prepared by the machine and the condiments 
will be added. In this implementation the available products are:

- Coffee:
  - Espresso
  - Americano
  - Latte Macchiato
- Tea:
  - Black Tea
  - Green Tea
  - Yellow Tea
- Condiments:
  - Milk
  - Sugar

# GitHub Repository Link:
https://github.com/wablack01/cs-665-assignment-1

# Implementation Description
- New beverages can be added as subclasses of either Coffee or Tea, and new condiments added as subclasses of Condiment. 
When creating a new Coffee or Tea subclass all that needs to be defined is the beverage name, beverage price, and 
quantities of relevant ingredients (espresso, water, steamed milk for coffee, and tea leaves and water for tea). New 
condiments only need to define a name and price as well as implement the addToBeverage function. If a new category of 
drink is added (other than coffee of tea) it can extend the Beverage class directly. BeverageMachine class interacts
only with the Beverage and Condiment classes so new beverages and condiments can be added without modifying the
BeverageMachine code.

- Classes are placed in organized packages with other similar classes. There is a logical class hierarchy of Beverages
and Condiments where general functionality is defined in parent classes and subclasses define only additional 
functionality and/or data. The role of each class and function is clear from its name and the code is well commented. 

- To avoid duplicate code I implemented functionality at the highest levels possible in the class hierarchy. For
example, the process of making a beverage is similar for all coffees and for all teas. The only difference in most
cases is the ratio of ingredients (i.e., the espresso, steamed milk, and/or water for coffee). Therefore I implemented
the makeBeverage function at the Coffee and Tea level so new subclasses only need to define the amount of relevant
ingredients, not how to make the drink.
  - In this implementation the makeBeverage function is actually the same for Coffee
  and Tea but on real beverage machine hardware they would likely be different enough that implementing at this level
  makes more sense than implementing at the Beverage level and then overriding.


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




