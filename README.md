# GraphQL-Cars
Simple Backend API-project with Spring Boot, GraphQL and H2 Database

Runs on localhost:8181/graphql

JSON example-querys:
{
  "query": "{ getAllCars { id brand model modelYear details } }"
}

{
  "query": "{ getAllCars { brand model modelYear } }"
}

{
  "query": "{ getCarById(id: 1) { id brand model modelYear details } }"
}

{
  "query": "mutation { addCar(car: { id: 1, brand: \"KIA\", model: \"CEED SW Plug-in Hybrid\", modelYear: 2021, details: \"Bränslesnål plugin-hybrid\" }) { id brand model modelYear details } }"
}

{
  "query": "mutation { updateCar(car: { id: 1, brand: \"Toyota\", model: \"Camry\", modelYear: 2021, details: \"Uppdaterad bil\" }) { id brand model modelYear details } }"
}

{
  "query": "mutation { deleteCar(id: 1) }"
}
