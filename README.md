# 📘 Examen du Projet Spring Boot – Microservices : Gestion des Stagiaires

## 👤 Réalisé par
**Nom :** Abdoulaye Aliou Diallo  
**Date de livraison :** 30/06/2025  

---

## 🏗️ Architecture des Services

| Service              | Port  | Docker Image                                     | Description                            |
|---------------------|-------|--------------------------------------------------|----------------------------------------|
| MySQL               | 3308  | `mysql:8.0`                                      | Base de données relationnelle          |
| Eureka Server       | 8762  | [`abloking/eureka-server`](https://hub.docker.com/r/abloking/eureka-server) | Service de découverte                  |
| API Gateway         | 9090  | [`abloking/api-gateway`](https://hub.docker.com/r/abloking/api-gateway)     | Point d’entrée des microservices       |
| Stagiaire Service   | 9091  | [`abloking/stagiaire-service`](https://hub.docker.com/r/abloking/stagiaire-service) | Microservice CRUD stagiaires          |
| Encadreur Service   | 9092  | [`abloking/encadreur-service`](https://hub.docker.com/r/abloking/encadreur-service) | Microservice CRUD encadreurs          |

---

## ▶️ Lancement du projet

### 📦 Prérequis
- [Docker](https://www.docker.com/)
- [Docker Compose](https://docs.docker.com/compose/)

### 🚀 Commande

```bash
docker compose up -d
