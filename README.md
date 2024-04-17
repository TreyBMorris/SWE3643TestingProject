# Introduction
This is a Java 21 web application using Spring MVC, with JUnit for unit testing and Playwright for e2e testing. 
<br/>
This project uses [Spring Initializr](https://start.spring.io/) with the Maven package manager and the Spring Web and Thymeleaf dependencies. Spring Web is useful for building web applications using Spring MVC and Apache Tomcat. Apache Tomcat is a popular option among Java developers, and serves as our Java application server in this project. Thymeleaf is also helpful, as it is a server-side Java template engine for web and standalone environments.


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
1. Follow the prerequisites above in the Development Environment section, to make sure you have everything you need for the program to run correctly.
2. Launch your IDE. For my example, I use IntelliJ.
3. Navigate to the "CalculatorApplication.java" file, this will be in the directory "/src/web/src/main/java/swe3643/project". Open this file.
4. Press the green arrow next to the class name, or the main method to run the web application. This will start the web server in your IDE. You should get this in the console below,
```bash
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (vX.x.x)

 swe3643.project.CalculatorApplication    : Starting CalculatorApplication using Java 21.0.1 with PID #####
 swe3643.project.CalculatorApplication    : No active profile set, falling back to 1 default profile: "default"
 o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
 o.apache.catalina.core.StandardService   : Starting service [Tomcat]
 o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.18]
 o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
 w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 918 ms
 o.s.b.a.w.s.WelcomePageHandlerMapping    : Adding welcome page: class path resource [static/index.html]
 o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path ''
 swe3643.project.CalculatorApplication    : Started CalculatorApplication in 1.77 seconds (process running for 2.41)
```

5. Launch your web browser and navigate to "http://localhost:8080/calculator", if you navigate to just "http://localhost:8080" please click the "Calculator" link.
6. Interact with the application in your browser.
7. Shutdown the server. When you are finished, please close your browser and press the red stop button in IntelliJ to stop the web server.
## Executing the Unit Tests
1. Launch your IDE. For my example, I use IntelliJ.
2. Navigate to the "CalculatorEngineTests.java" file, located in the directory "src/tests/src/main/java"
3. Press the green arrow at the class name, and press the first run option to run all the unit tests. If you want to run a test individually, press the green arrow next to the method name of the test you want to run.
You should get something along the lines of this in the console below, 
```bash
C:\Users\user\.jdks\openjdk-21.0.1\bin\java.exe ...
Process finished with exit code 0
```

4. Review the Results. On the left hand side of the the console, you will get a return of the tests results, where the tests will be listed along with the status of pass or fail. A green checkmark means the test passed, and a red X means the test failed. Alternatively, it will be listed above the console that displays how many tests passed and failed out of the total tests, and how long it took. It should always show "Test passed: 19 out of 19".
4. To run outside of the IDE, navigate to the pdirectory in a terminal or command prompt. Run the command below to run the tests,
```bash
mvn test
```

5. Re-run tests (if needed). If any tests fail, review the code and test cases to identify the failure. All tests should pass first try, but if they do not, feel free to submit an issue within the GitHub repository.
## Reviewing Unit Test Coverage
1. For this application, I was able to achieve 100% coverage for the Calculator Engine class. I was able to cover all methods within the class, and 99% of lines in the class were covered by my tests.
![Coverage Image](image.png)
## Executing End-to-End Tests
1. Run the web application on your local machine, the tests will fail if the web application is not running. 
2. After, navigate to the "CalculatorE2ETests.java" file, this will be in the directory "/src/web/src/main/java/swe3643/project". Open this file.
3. Press the green arrow at the class name, and press the first run option to run all the tests.
## Final Video Presentation
