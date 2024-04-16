# Introduction
This is a Java 21 web application using Spring MVC, with JUnit for unit testing and Playwright for e2e testing. For this application, I first used [Spring Initializr](https://start.spring.io/) with the Maven package manager and the Spring Web and Thymeleaf dependencies. Spring Web is useful for building web applications using Spring MVC and Apache Tomcat. Apache Tomcat is a popular option among Java developers and serves as our Java application server in this project. Thymeleaf is also helpful, as it is a server-side Java template engine for web and standalone environments.


#### Table of Contents
- [Team Members](#team-members)
- [Architecture](#architecture)
- [Development Environment](#development-environment)
- [Executing the Web Application](#executing-the-web-application)
- [Executing Unit Test](#executing-the-unit-tests)
- [Reviewing Unit Test Coverage](#reviewing-unit-test-coverage)
- [Executing End-To-End Tests](#executing-end-to-end-tests)
- [Final Video Presentation](#final-video-presentation)


## Team Members
- [Trey Morris](https://github.com/TreyBMorris)

## Architecture
This project is split into 3 sections. The tests, the web application, and the calculator engine. To cover these sections briefly, the tests section contains both the unit tests and the end-to-end tests using JUnit and Playwright respectively. The Calculator engine is where all the logic for the calculator lies, such as the basic arithmetic, trigonometric functions, and other functions for our calculator. The web application, in the Model View Controller pattern, contains our UI and the controller calls our calculator engine directly for the calculator logic. All of the operations are implemented into the UI on the web server app, through the Calculator engine logic. 

## Development Environment
This project was created in a Windows environment, using JetBrain's IntelliJ. I HIGHLY recommend using IntelliJ and Windows for the ideal runtime experience, but IntelliJ and this project should be available on all platforms such as Windows, Mac OS X, and Linux.

To prepare your environment to execute this application:
1. [Install the latest Java runtime for your system.](https://www.java.com/en/download/manual.jsp)
2. [Install Apache Maven](https://maven.apache.org/install.html)
3. [Install IntelliJ(Optional)](https://www.jetbrains.com/idea/?var=1)
4. Clone the GitHub repository. Using the command-line interface you can run,
```bash
git clone <repository_url>
```
If you are not using the command-line interface, go to the top of the repository page and click the blue "<> Code" button, and click either GitHub desktop if you have it install or download as a ZIP file.
5. Configure dependencies. Check the "pom.xml" file for dependencies that are required for this project. Maven will automatically download and install these dependencies during the build process. 

## Executing the Web Application

## Executing the Unit Tests

## Reviewing Unit Test Coverage

## Executing End-to-End Tests

## Final Video Presentation