[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/WCHp-cRl)
# Projet "Dice" - Gestion de lancés de dés avec Spring Boot

## Description
Le projet "Dice" est une application construite avec Spring Boot permettant de simuler des lancés de dés et de gérer un historique des résultats en base de données. Ce projet met en œuvre les concepts fondamentaux de Spring Boot, notamment l'injection de dépendances, les services RESTful, les entités JPA et les repositories.


# Endpoints
## Roll Dice
- URL: http://localhost:8081/api/dice-rolls/roll
- Method: GET
- Description: Roll a single dice and get the result.

## Roll Multiple Dice
- URL: http://localhost:8081/api/dice-rolls/roll/{count}
- Method: GET
- Description: Roll count dice and get the results.

## Dice Roll History
- URL: http://localhost:8081/api/dice-rolls/logs
- Method: GET
- Description: Retrieve the history of all dice rolls.

## Technologies
- **Framework principal** : Spring Boot
- **Base de données** : H2 
- **Documentation API** : Swagger
- **Simplification de code** : Lombok 
