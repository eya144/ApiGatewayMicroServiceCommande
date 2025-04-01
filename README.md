Realisé par eya maamouri 
https://github.com/eya144/MicroServiceCommande.git 
https://github.com/eya144/EurekaMicroServiceCommande.git 
https://github.com/eya144/ApiGatewayMicroServiceCommande.git

Microservice Commande avec API Gateway, Eureka et Keycloak Ce projet implémente un système de gestion des commandes basé sur une architecture de microservices. L'objectif est de fournir une solution robuste, sécurisée et scalable pour gérer les commandes dans un environnement de gestion de projet de construction. Le projet utilise les technologies Spring Boot, Spring Cloud Gateway, Eureka, et Keycloak pour assurer la communication entre les microservices, la découverte des services, et l'accès sécurisé.

Technologies utilisées : Spring Boot : Framework principal utilisé pour créer des microservices légers et rapides.

Spring Cloud Gateway (API Gateway) : Sert de point d'entrée unique pour toutes les requêtes externes, en dirigeant les requêtes vers les microservices appropriés. Il permet également de gérer les filtrages, la sécurisation et la gestion des routes.

Eureka (Spring Cloud Netflix Eureka) : Serveur de découverte de services. Permet aux microservices de se découvrir mutuellement, facilitant ainsi la communication dynamique et l'équilibrage de charge entre les services.

Keycloak : Solution d'authentification et d'autorisation basée sur OpenID Connect et OAuth2. Keycloak sécurise l'accès aux API en générant des tokens JWT pour garantir que seules les requêtes authentifiées et autorisées peuvent accéder aux ressources protégées.

Spring Data JPA : Gestion des données avec une base de données relationnelle pour la persistance des commandes.

JWT (JSON Web Tokens) : Système de gestion des tokens d'authentification pour sécuriser l'accès aux API.

Fonctionnalités principales : Gestion des Commandes :

Création, lecture, mise à jour, et suppression des commandes (CRUD). Filtrage des commandes en fonction de leur statut (par exemple, "EnCours", "Livré", "Annulé").

API Gateway (Spring Cloud Gateway) :

Point d'entrée centralisé pour toutes les requêtes des utilisateurs.

Redirection des requêtes vers les microservices backend appropriés en fonction des routes définies.

Application de filtres pour la gestion de la sécurité, la gestion des erreurs, et la surveillance des requêtes.

Permet également de gérer la sécurité.

Découverte des services avec Eureka :

Les microservices s'enregistrent automatiquement auprès du serveur Eureka, permettant une découverte dynamique des services.

Cela permet une gestion flexible des services distribués sans avoir besoin de connaître les adresses IP ou les ports des autres services.

La communication entre les microservices est simplifiée par cette découverte automatique.

Sécurisation des API avec Keycloak :

Utilisation de Keycloak pour l'authentification et l'autorisation centralisée.

Les utilisateurs doivent s'authentifier via Keycloak pour obtenir un token JWT.

Chaque microservice valide le JWT avant d'autoriser l'accès aux ressources protégées, garantissant ainsi la sécurité des API.

Intégration avec Spring Security pour sécuriser toutes les endpoints via JWT.

Scalabilité et Résilience :

L'architecture basée sur des microservices permet de déployer les services de manière indépendante et de mettre à l'échelle chaque microservice selon la demande.

La découverte dynamique des services via Eureka garantit que même si un service est redémarré ou mis à l'échelle, les autres services peuvent toujours le trouver et interagir avec lui.

Exemples d'API disponibles : POST localhost:8091/commandes : Crée une nouvelle commande.

GET localhost:8091/commandes : Récupère toutes les commandes.

GET localhost:8091/commandes/{id} : Récupère une commande par son ID.

PUT localhost:8091/commandes/{id} : Met à jour les informations d'une commande existante.

DELETE localhost:8091/commandes/{id} : Supprime une commande par son ID.

GET localhost:8091/commandes/{statut} : Filtre les commandes en fonction de leur statut (par exemple, "EnCours", "Livré").
