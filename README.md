# WorkSphere

Enterprise Project and Task Management Platform.

## Technology Stack

### Backend
- Java 21
- Spring Boot 3.5.x
- Spring Data JPA
- Spring REST APIs
- PostgreSQL

### Frontend
- React
- JavaScript
- Vite

### DevOps
- Docker
- Jenkins
- AWS

## Project Structure

- backend: Spring Boot application
- frontend: React application
- infrastructure: Deployment configurations

## Prerequisites

- Java 21
- Maven
- Node.js
- Docker Desktop

## Run the Database

docker compose up -d

## Run the Backend

cd backend

DB_NAME=worksphere \
DB_USERNAME=worksphere_app \
DB_PASSWORD=local-dev-only-change-me \
./mvnw spring-boot:run

## Run the Frontend

cd frontend

npm install
npm run dev

## Application URLs

Frontend:
http://localhost:5173

Backend:
http://localhost:8080

Health API:
http://localhost:8080/api/v1/health