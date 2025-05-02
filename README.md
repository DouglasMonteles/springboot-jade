# JADE Frameword with Springboot

This project contains a base structure for creating a modularized application that combines the Spring ecosystem 
with agents from the JADE platform. Initially, the project includes two modules: server and agents. The server 
module contains the server structure, as well as the application's endpoints and frontend. The agents module 
contains the implementation of the agents and is also responsible for starting the application as a whole.

# Prerequisites

- <a href="https://www.oracle.com/br/java/technologies/downloads/#java21" target="_blank">JDK 21</a>

# Environment

- Any Linux Distribution

# Build and run

The build of this project can be performed using the command: `./mvnw clean install`

The agents module is configured to create a fat JAR containing all necessary dependencies, ready to be executed. To 
run the project, you have the following options:

- Run the build: After building, go to agents/target and execute: `java -jar agents-3.4.5.jar`
- Open the project in an IDE: Run the main class located at: `agents/src/main/java/br/com/app/AgentApplication.java`

# Technologies

Technologies:
- Java 21
- JADE (Java Agent DEvelopment Framework);
- Maven;
- Spring Boot, and
- Makefile;

# Help

The project includes a help command that can be executed via makefile, allowing you to view all available commands.


# References

> **Welcome to Apache Maven**. Available at: <https://maven.apache.org/>. Accessed on: May 1, 2025.
> **JAVA Agent DEvelopment Framework (JADE)**. Available at: <https://jade.tilab.com>. Accessed on: May 1, 2025.
