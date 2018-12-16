# AutomatedTesting_RestFul
API tests for given service

```
https://jsonplaceholder.typicode.com/
```

## Getting Started

User may put all the available source code to an IDE for testing purposes, Maven usage is supported.

### Prerequisites

```
JAVA JDK 1.8
MAVEN
an IDE (IntelliJ is preferred)

```

### Installing

JDK should be installed, JAVA_HOME and MAVEN_HOME should be configured properly.

## Running the tests

Use MAVEN parameters to run all the tests available and run from console

```
mvn clean install
```
## Tech Stack
* Written in JAVA
* Used MAVEN for build management
* TestNG for test orchestration and assertion
* Hamcrest for assertion
* Extent Reports 3.15 for reporting
* REST Assured for Restful WebServices

## Functionalities available
* ReTry mechanism implemented
* Implemented with MAVEN support, in this way CI and CD supported. The project is ready to triggered by Jenkins for instance.
* Time statistics given in Reports. Check Reporting section below for more information.
* Simple Performance Test measurement added.

## Reporting

Reports can be found under reports folder with the date at which test is run.
In the same report appending is allowed.
Every new run will create an another report appended to the same report.
If any failures it will automatically log failure in the report by using Listeners.

## Suggestions for improvements

TestNG XML could be used to handle parameters in a file. And parallel runs could also be triggered by the use of TestNG XML



