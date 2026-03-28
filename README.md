# 🌍 Disaster Analytics Platform

A  backend API for analyzing historical disaster data (1900-present) from the UN/CRED EM-DAT database. Built with Spring Boot and PostgreSQL.

## 🚀 Tech Stack

- **Java 17** | **Spring Boot 3.x**
- **PostgreSQL**
- **Spring Data JPA**
- **Maven**

## 📊 Database

- 27,522 real disaster records from EM-DAT
- Disaster types, locations, dates
- Human impact: deaths, injured, affected
- Economic damage costs

## 🔧 API Endpoints

### Disaster Operations
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/disasters` | Get all disasters |
| GET | `/api/disasters/paginated?page=0&size=50` | Paginated results |
| GET | `/api/disasters/country/{country}` | Filter by country |
| GET | `/api/disasters/type/{type}` | Filter by disaster type |
| GET | `/api/disasters/deadliest` | Top 10 deadliest disasters |

### Analytics
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/analytics/yearly-trends` | Yearly disaster counts & deaths |
| GET | `/api/analytics/economic-impact` | Economic damage by disaster type |
| GET | `/api/analytics/seasonal-patterns` | Monthly patterns |
| GET | `/api/analytics/deadliest-countries` | Top 10 countries by deaths |

## 🛠️ Setup Instructions

### Prerequisites
- Java 17+
- PostgreSQL 14+
- Maven
### Database Setup
```sql
CREATE DATABASE crisis_db;
```
Update with your PostgreSQL credentials(username and password)

### 📁 Project Structure
```
Disaster_Analytics/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/crisisconnect/disastermanagement/
│   │   │       ├── DisasterManagementApplication.java
│   │   │       ├── controller/
│   │   │       │   ├── DisasterController.java
│   │   │       │   └── AnalyticsController.java
│   │   │       ├── service/
│   │   │       │   ├── DisasterService.java
│   │   │       │   └── AnalyticsService.java
│   │   │       ├── repository/
│   │   │       │   └── DisasterRepo.java
│   │   │       ├── entity/
│   │   │       │   └── DisasterEntity.java
│   │   │       └── dto/
│   │   │           ├── DisasterResponseDTO.java
│   │   │           ├── EconomicImpactDTO.java
│   │   │           ├── SeasonalPatternDTO.java
│   │   │           └── TimeTrendDTO.java
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── application-example.properties
│   │       └── application-dev.properties
│   └── test/
│       └── java/
│           └── com/crisisconnect/disastermanagement/
│               └── DisasterManagementApplicationTests.java
├── pom.xml
├── .gitignore
└── README.md
```
### Run the Application
mvn spring-boot:run
