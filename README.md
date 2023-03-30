# DMN Samples on Quarkus

1. run this project in dev mode with:
```
mvn quarkus:dev
```

2. access http://localhost:8080/q/swagger-ui to try out the decisions using the REST API

Example input for "DatesAndLists" decision:
```
{
  "dates": [
    "2023-03-01",
    "2023-02-01",
    "2023-03-30",
    "2025-12-02",
    "2020-01-02"
  ]
}
```