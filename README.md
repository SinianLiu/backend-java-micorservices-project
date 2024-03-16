# Java Microservices Project - Order Management Systems
It contains 3 services: order,payment, and product

## Topics covered:
inter-communications between services
service registration
routing
configuration
load balancer, circuit-breaking and rate-limiting

## Tools:
Framework: SpringBoot, SpringCloud
Database: MySQL
ORM: Spring Data JPA
Spring Security
Test: Junit
Deployment: Docker, K8s

## Structure:
- Product Service：
    - APIs: addProduct/ getProduct/ reduceQuantity
    - Exception Handling
    - Model repos: Request and Response models are a way to represent the interaction with Controller layer and View layer

- Order Service:
    - APIs: placeOrder/getOrderDetails    
    in `getOrderDetails`：used RestTemplate to call other services
    - Client repos: call apis from other services

- Payment Service:
    - APIs: doPayment/getPaymentDetailsByOrderId

- ConfigServer：
    - Config services to Eureka server

- service-registry: 
    - Config Eureka server

- CloudGateway




      





