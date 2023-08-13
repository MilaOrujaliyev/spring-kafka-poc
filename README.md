# spring-kafka-poc
A proof-of-concept (POC) project demonstrating the integration of Apache Kafka with Spring Boot. This repository contains the essential configurations and setups for quickly bootstrapping a Spring Boot application with Kafka capabilities.
# Spring Kafka POC

This repository provides a proof-of-concept (POC) for integrating Apache Kafka with Spring Boot. Using the provided Docker Compose setup, you can quickly bootstrap a Kafka cluster and send/receive messages using the simple Spring Boot service.

## Getting Started

### Prerequisites

1. Docker and Docker Compose installed on your machine.
2. Java 8+.
3. Maven 

### Running the Project

 **1. Start the Kafka and Zookeeper services**:
docker-compose up -->This will start a Kafka broker and a Zookeeper instance using the provided docker-compose.yml configuration.

**2. Run the Spring Boot application**:
mvn spring-boot:run  

Once the application starts, it will connect to the Kafka broker running at localhost:29092.

**3.Interacting with the Service**
You can send a message to the Kafka topic by making a POST request:
POST /kafka/send
Body: "Your message here"
The received messages will be logged in the console of your Spring Boot application.

**Code Overview**
KafkaProducer Service: A service that uses KafkaTemplate to send messages to a specified Kafka topic.

KafkaConsumer Service: A service that listens to a specified Kafka topic using the @KafkaListener annotation.

KafkaController: A REST controller that provides an endpoint for sending messages to Kafka.

**Postman Screenshot**

![image](https://github.com/MilaOrujaliyev/spring-kafka-poc/assets/88654285/8fe3c292-63bb-4079-8d1b-30093abf49cb)
