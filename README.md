create docker container with postgreSQL :
docker run     --name DSL-ass1-postgres    -p 5455:5432     -e POSTGRES_USER=auth    -e POSTGRES_PASSWORD=Qwerty!234     -e POSTGRES_DB=user_registration    -d     postgres