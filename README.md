# JpaQueryDsl
Springboot JPA with QueryDSL using Gradle.

# Getting Started

Go to the root of the project and run the following command `./gradlew build`.

After executing the command, if everything happens as expected and the build finishes successfully.
You can find the `QAuthor` and `QBook` generated classes in the following path `"build/generated/source/apt/main"`

# Running

Run the following command `./gradlew bootRun` 

got to browser and open : http://localhost:8080/api/v1/books?price=50

You should see this:

```
[
  {
    "id": 2,
    "title": "Spring boot jpa",
    "description": "Spring Boot JPA",
    "price": 50,
    "publishedDate": "2018-03-22T07:11:11.000Z",
    "authors": [
      {
        "id": 1,
        "name": "anderson@email.com",
        "email": "Anderson",
        "books": []
      }
    ]
  }
]
```
