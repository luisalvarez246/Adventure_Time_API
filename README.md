# Adventure Time REST API

Welcome to the Adventure Time REST API, where you can explore characters from the iconic TV show Adventure Time. This API provides endpoints to retrieve, create, update, and delete character information. Whether you're a fan of Finn, Jake, Princess Bubblegum, or any other character, this API has you covered!

## Table of Contents

- [Getting Started](#GettingStarted)
- [Endpoints](#Endpoints)
- [Technologies Used](#TechnologiesUsed)
- [Contributing](#Contributing)
- [License](#License)

## Getting Started

### Prerequisites
Before running the Adventure Time REST API, make sure you have the following installed:

Java Development Kit (JDK) 8 or higher
MySQL database
Git

### Installation
Clone the repository:
```
git clone https://github.com/luisalvarez246/adventure-time-rest-api.git
```

Configure your MySQL database settings in src/main/resources/application.properties.

Like, for example:

```
spring.datasource.url=jdbc:mysql://localhost/db_adventure_time
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
```

Build and run the API:

```
./mvnw spring-boot:run
```
The API will be available at http://localhost:8080.

## Endpoints
For detailed information on all endpoints, please refer to the [API Documentation](https://documenter.getpostman.com/view/29010570/2s9XxzvtL4 "Adventure Time API Documentation").

## Technologies Used
- Java Spring Boot
- Hibernate (ORM)
- MySQL (Database)
- H2 Database (for testing, database simulation)
- Mockito (Unit testing)
- Spring MVC
- RESTful architecture

## Contributing
Contributions to the Adventure Time REST API are welcome! Feel free to open issues for bugs, feature requests, or submit pull requests with improvements.

## Fork the repository.
Create a new branch for your feature or bug fix.
Make your changes and submit a pull request.

## License
CC0: Public Domain
