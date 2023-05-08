# Pet Management

This is the backend part of a pet management system that manages pet data through REST APIs.
The application is built using the Spring Boot framework and uses an H2 database. The database schema is managed using Liquibase.

## Technologies Used
The following technologies were used in this project:

IntelliJ Ultimate with Oracle OpenJDK version 19.0.2

Embedded H2 database

Liquibase changelogs

Spring Boot Framework


## Main Files
Here are the main files used in this project:

PetsApplication.java
This is the Spring Boot application that starts the server when run.

Pets.java
This is the class for pet objects, defining the properties of each pet.

PetService.java
This is the service class that provides methods for managing the pet data.

PetController.java
This is the RestController that maps requests to local server on path "/api/pets" and interacts with the PetService class.

PetRepository.java
This is an interface that extends the JpaRepository interface, providing CRUD operations for the pet objects.

changelog-master.yaml
This YAML file is used for creating and updating the H2 database schema. It contains the necessary Liquibase changelogs and creates first 3 pets used in the example.

## Running the Application
To run the application, simply run the main method in the PetsApplication.java file. The server will start on port 8080.
You can then access the API endpoints by sending HTTP requests to http://localhost:8080/api/pets.

## API Endpoints
The following API endpoints are available:

GET /api/pets - retrieves a list of all pets

GET /api/pets/{id} - retrieves a pet with the given ID

POST /api/pets - creates a new pet

PUT /api/pets/{id} - updates an existing pet with the given ID

DELETE /api/pets/{id} - deletes a pet with the given ID

## More information about this project:
This project consists of two repositories, one for the front-end and one for the back-end. In case managing two repositories is inconvenient, the front-end files have been included as a zip file in the back-end repository.
Please refer to the README in the front-end repository for more information about the front-end.

Link: https://github.com/Elisabethein/Pet_Management_App

The back-end took approximately 10 hours to develop, as I was new to Spring Boot and wanted to learn as much as possible during the project.
I would refer to these following learning materials:

https://github.com/getarrays/employeemanagerapp.git 

https://www.youtube.com/@amigoscode (Spring boot tutorials)

I will include some thoughts about this project in a free-form manner (which may include some aspects of the front-end, but I encourage you to also read the information in the other repository):

I found it very satisfying to see different pieces of my previous knowledge come together in this project, and that's exactly what I would want to do and practice more. As most technologies were quite new to me, I'm satisfied I was able to learn so much about them in such a short time.

Since I had no prior experience with Liquibase, I am unsure if I implemented it correctly. It might have some troubles with the output file for Liquibase.

I also created IDs for each pet because I was uncertain if pet codes would be unique for every pet.

Improvements:

I would like to add login capabilities for users with various access levels. I have learned how to create database users with different permissions, and I think this knowledge would come in handy.

In my solution I allow users to write whichever country their pet is originated from but an exception handling could be added, which checks if the input is correct.

To change the order of pets, I envision a bar with sorting options that allow users to arrange their pets in various ways.

Additionally, I would like to enhance the project by storing information about the pets that users have created or deleted, so that the same version is available when they log in again.

I did not devote much time to the HTML design, which could benefit from significant improvement. Although the solution is similar to the provided example, it could be further refined.
I am interested in exploring how this solution could be transformed into a fully functional website with comparable capabilities.
