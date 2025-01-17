# UUIDGenerator


## Description

UUIDGenerator é um projeto  que atualmente esta sendo consumido pelo projeto [UUIDFront](https://github.com/MateusSantoSB/UUIDFront). Esta API foi criada com o objetivo de solucionar um problema que enfrentei ao realizar inserts em um banco de dados. Especificamente, tive dificuldades para inserir um ID do tipo UUID manualmente, pois não sabia como proceder. Durante minhas pesquisas, descobri sites que geravam UUIDs, o que me fez pensar: "Por que não criar uma solução própria?"

Assim, desenvolvi a API e, em seguida, o [UUIDFront](https://github.com/MateusSantoSB/UUIDFront), uma ferramenta que facilita os testes no banco de dados, permitindo inserir UUIDs manualmente sem depender de projetos ou ferramentas de terceiros.

Este projeto foi desenvolvido inteiramente utilizando a liguagem java eo framework Spring boot.
A api esta online em [UUIDGenerator](https://uuidgenerator1-0.onrender.com) com limitações no primeiro request de aproximadamente 1min, pois utilizo a versão gratuita do render.com

##
UUIDGenerator is a project currently being consumed by [UUIDFront](https://github.com/MateusSantoSB/UUIDFront). This API was created to solve a problem I faced when performing inserts into a database. Specifically, I struggled to manually insert a UUID-type ID since I didn't know how to proceed. During my research, I found websites that generated UUIDs, which led me to think: "Why not create my own solution?"

Thus, I developed the API and later [UUIDFront](https://github.com/MateusSantoSB/UUIDFront), a tool that simplifies database testing by allowing UUIDs to be inserted manually without relying on third-party projects or tools.

This project was entirely developed using the Java programming language and the Spring Boot framework.

The API is online at [UUIDGenerator](https://uuidgenerator1-0.onrender.com), with a limitation of approximately 1 minute for the first request due to the use of the free tier of render.com.

##  Technologies
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)


![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)

## Test
### Instalação

Certifique-se de ter o Jdk 21 eo Maven instalado em sua maquina.


Se prefirir temos na ```/``` o ```Dockerfile``` para rodar em ambiente docker.



### Pare rodar use na pasta raiz do projeto:

```mvn clean install``` 

```java -jar target/UGen-0.0.1.jar```

### O projeto ira rodar na porta ```8080```


##

### Installation

Make sure you have Jdk 21 and Maven installed on your machine.

If you prefer, we have in ```/``` the ```Dockerfile``` to run in a docker environment.

### To run use in the project root folder:

```mvn clean install``` 

```java -jar target/UGen-0.0.1.jar```

### The project will run on localhost ```8080```

## End Points


### ``` Get``` 
### /generator/generateUUID
For generate a UUID

```
{
    "id":"356eae12-6060-4c6d-8162-5289cb078e7d"
}
```
