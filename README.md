# spring-security-google-login-demo
A Spring Boot application demonstrating Google Sign-In authentication using Spring Security OAuth2 and Google Cloud OAuth 2.0 Client credentials.
# 🔐 Spring Security Google OAuth2 Login

A Spring Boot project demonstrating **Google Sign-In Authentication** using **Spring Security OAuth2** and **Google Cloud OAuth 2.0 Client Credentials**. This project enables users to securely log in with their Google accounts without managing passwords manually.

---

## 📌 Project Overview

This application showcases how to integrate **Google OAuth2 Login** into a Spring Boot application using Spring Security. It redirects users to Google's authentication page, verifies their identity, and grants access upon successful authentication.

This project is ideal for learning modern authentication techniques and serves as a foundation for building secure web applications.

---

## ✨ Features

- 🔑 Google Sign-In Authentication
- 🛡️ Spring Security OAuth2 Login
- 🌐 Secure OAuth 2.0 Authorization Flow
- 👤 Retrieve Authenticated User Details
- 🚪 Logout Support
- ⚙️ Easy Configuration with Google Cloud Console

---

## 🛠️ Tech Stack

- Java 21 (or your Java version)
- Spring Boot
- Spring Security
- OAuth2 Client
- Maven
- Google Cloud Console

---

## 📂 Project Structure

```
src
├── main
│   ├── java
│   │   └── com.example.googleoauth
│   │       ├── controller
│   │       ├── config
│   │       └── GoogleOauthApplication.java
│   └── resources
│       ├── application.properties
│       └── static
└── test
```

---

## ⚙️ Prerequisites

Before running this project, ensure you have:

- Java JDK 21 (or compatible version)
- Maven
- IntelliJ IDEA / Eclipse
- Google Cloud Project
- OAuth 2.0 Client ID & Client Secret

---

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/<your-username>/spring-security-google-oauth2.git
```

### 2. Navigate to the Project

```bash
cd spring-security-google-oauth2
```

### 3. Configure Google OAuth Credentials

Update your `application.properties` file:

```properties
spring.security.oauth2.client.registration.google.client-id=YOUR_CLIENT_ID

spring.security.oauth2.client.registration.google.client-secret=YOUR_CLIENT_SECRET

spring.security.oauth2.client.registration.google.scope=openid,email,profile
```

---

### 4. Run the Application

```bash
mvn spring-boot:run
```

---

## 🔗 Access the Application

Open your browser and visit:

```
http://localhost:8080
```

Click **Login with Google** to authenticate.

---

## 🔄 OAuth2 Authentication Flow

1. User clicks **Login with Google**
2. Application redirects to Google Login
3. User authenticates with Google
4. Google returns an Authorization Code
5. Spring Security exchanges it for an Access Token
6. User information is retrieved
7. User is successfully authenticated

---
![Home Page](home.png)

---

## 📚 Learning Outcomes

This project demonstrates:

- Spring Security OAuth2 Configuration
- Google OAuth2 Client Registration
- Authorization Code Flow
- Secure Authentication
- OAuth2 Login Integration
- User Authentication using Google

