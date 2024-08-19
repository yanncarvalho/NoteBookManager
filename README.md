
## NoteBook Manager
### Spring boot Rest Api+swagger+H2

NoteBook Manager is a sample tiny application that performs CRUD jobs on Notebook Entity via Restful Webservices.

It exposes 5 endpoint as following list :

- GET /api/notebooks (get a list of notebook)
- POST /api/notebooks (create a notebook)
- GET /api/notebooks/1 (get one notebook from the list)
- PATCH /api/notebooks/1 (update the price of a single notebook)
- DELETE /api/notebooks/1 (delete a single notebook)



## How to use
This application is Restful and it follows OpenAPI specification in API documentation. Thanks to SwaggerUI, you can see endpoints documentation in a graphical user interface and try their functionality and see the response. After running the containers, you can access the application links as :

- Application Rest services : http://localhost:8080/api/notebooks
- SwaggerUI : http://localhost:8080/swagger-ui.html



## Test

Tests are written with H2 in-memory database with initial records.


## Link

[Original project](https://github.com/birddevelper/NoteBookManager)
