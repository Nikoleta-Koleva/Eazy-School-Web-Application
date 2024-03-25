Web application project "Eazy School" project

Technologies used:
- Maven project management tool for building source code, testing, adding dependencies automatically from the Internet and managing them, packaging into JAR, WAR or EAR.
- J Unit testing
- Spring 6
- Aspect-oriented programming and Object oriented programming
- Spring MVC
- Spring Boot 3
- Thymeleaf
- Spring Security 6
- Spring Java Database Connectivity (JDBC)
- Java Persistence API
- REST (representational state transfer)

Project structure:
- source - root of the application source code and unit tests
- java - contains the source/production code for the application
- resources - static files used in the project
- test - shows unit tests (testing individual piece of code) and integration tests with J Unit
- pom.xml (Project Object Model) - contains metadata of the project's dependencies and plugins, responsible for automating repetitive tasks
- target - stores all the compiled Java files

Pom.xml info:
- Project tag - encapsulates all information related to the project
- The version of the pom that is used
- Group Id - unique identifier of the project
- Artifact Id - the name of the project
- Version - unique number that identifies the version of the artefact
 
Currently the project uses:
- Simple POM file (generated when creating a Maven project). Contains only information relevant to the current project.
- Super POM file - Parent of all the super POM files. It contains a lot of default configuration shared by all the simple POM files. Located in the Apache Maven folder.
- Effective POM file - combination of both types, used to build the project.

Dependencies as Jar files:
- Framework files
- Library files
