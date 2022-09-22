create docker container with postgreSQL :
docker run     --name DSL-ass1-postgres    -p 5455:5432     -e POSTGRES_USER=auth    -e POSTGRES_PASSWORD=Qwerty!234     -e POSTGRES_DB=user_registration    -d     postgres

# Gateway Microservice

## Group Members

- Frederik Johnsen, cph-fj111@cphbusiness.dk
- Jean-Poul Leth-Møller, cph-jl360@cphbusiness.dk
- Mathias Parking, cph-mp525@cphbusiness.dk
- Magdalena Wawrzak cph-mw216@cphbusiness.dk
- Tobias Zimmermann cph-tz11@cphbusiness.dk

## Introduction

This microservice provides the ability to autorize and authenticate users and then to forwad request to other microservices (although currently mocked).

It uses JWT, bycrypt encoding, postgreSQL
## Local Usage

To simply use the microservice, run the command:

```bash
docker compose -f app.docker-compose.yaml up -d --build
```

This will start both the getway-service and the postgres server.

By default, the microservice will be running on port 9080, postgres on port 5455

### Configuration

The docker image `tobiaszimmer/assignment-lsola1-movies` allows for a few environment variables to change the default
behavior:


### Endpoints

The service exposes endpoints:

search endpoints in:

```http request
GET /search?q=searchquery
Required request headers: - Authorization: Bearer :token
```

register endpoints in:

```http request
POST /register
body {username:string, password: string}
```

register endpoints in:

```http request
POST /authenticate
body {username:string, password: string}
```

## Project Structure

- Config: Configuration such as spring beans and Elasticsearch setup
- Controller: The single search endpoint exposed by the microservice
- Dto: Objects used to transfer data from different layers in the system
- Model: The Product used to define the search items
- Repository: The CrudRepository used to connect to the postgreSQL server
- Service: The serverdispatch and userDetails implementation 

