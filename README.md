# API SPEC

## AUTHENTICATION

All API must use this authentication

Request : 
- Header :
  - X-Api-Key : "your secret api key"

## CREATE PRODUCT

Request :
- Method : POST
- Endpoint : `/api/product`
- Header : 
    - Content-Type : applications/json
    - Accept : applications/json
- Body :

```json
{
  "code": "number",
  "status" : "string",
  "data" : [
    {
      "id" : "string,unique",
      "name" : "string",
      "price" : "long",
      "quantity" : "integer",
      "createdAt" : "date",
      "updatedAt" : "date"
    },
    {
      "id" : "string,unique",
      "name" : "string",
      "price" : "long",
      "quantity" : "integer",
      "createdAt" : "date",
      "updatedAt" : "date"
    }
  ]
}
```
- Response :

```json
{
  "code" : "number",
  "status" : "string",
  "data" :
  {
    "id" : "string,unique",
    "name" : "string",
    "price" : "long",
    "quantity" : "integer",
    "createdAt" : "date",
    "updatedAt" : "date"
  }
}
```

## GET PRODUCT

Request :
- Method : GET
- Endpoint : `/api/product/{id_product}`
- Header :
    - Content-Type : applications/json
    - Accept : applications/json
  
- Response :
```json
 {
  "code" : "number",
  "status" : "string",
  "data" :
  {
    "id" : "string,unique",
    "name" : "string",
    "price" : "long",
    "quantity" : "integer",
    "createdAt" : "date",
    "updatedAt" : "date"
  }
}
```

## UPDATE PRODUCT

Request :
- Method : POST
- Endpoint : `/api/product/{id_product}`
- Header :
  - Content-Type : applications/json
  - Accept : applications/json
- Body :

```json
{
  "code": "number",
  "status" : "string",
  "data" :     
  {
    "id" : "string,unique",
    "name" : "string",
    "price" : "long",
    "quantity" : "integer",
    "createdAt" : "date",
    "updatedAt" : "date"
  }
}
```

## LIST PRODUCT

Request :
- Method : GET
- Endpoint : `/api/products`
- Header :
  - Content-Type : applications/json
  - Accept : applications/json
- Query Param : {
    - size : number,
    - limit : number
- }
- Response :
```json
 {
  "code" : "number",
  "status" : "string",
  "data" :
  [
    {
      "id" : "string,unique",
      "name" : "string",
      "price" : "long",
      "quantity" : "integer",
      "createdAt" : "date",
      "updatedAt" : "date"
    },
    {
      "id" : "string,unique",
      "name" : "string",
      "price" : "long",
      "quantity" : "integer",
      "createdAt" : "date",
      "updatedAt" : "date"
    }
  ]
}
```

## DELETE PRODUCT


Request :
- Method : POST
- Endpoint : `/api/product/id_product`
- Header :
  - Content-Type : applications/json
  - Accept : applications/json
- Response  :
```json
{
  "code": "number",
  "status" : "string"
}
```