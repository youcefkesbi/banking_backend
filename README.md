🏦 Banking System Full-Stack Application

A full-stack banking application built with Spring Boot, React.js, and Supabase, featuring account management and transaction handling with a clean layered architecture and production deployment.

<img width="1073" height="778" alt="Screenshot 2026-05-17 at 20 10 48" src="https://github.com/user-attachments/assets/8cb6a4a3-85f0-48c8-8f5b-cc240cf16c27" />
<img width="1083" height="777" alt="Screenshot 2026-05-17 at 20 10 39" src="https://github.com/user-attachments/assets/c2337621-4edb-407e-825c-10c4b5045e62" />

🚀 Live Demo
Frontend (Vercel): https://banking-frontend-red.vercel.app

Backend (Railway): https://bankingbackend-production-c265.up.railway.app

🧰 Tech Stack
Backend
Spring Boot
Spring Web
Spring Data JPA
Supabase (PostgreSQL)
Maven
Frontend
React.js
Axios
React Router
Database
Supabase (PostgreSQL)
Deployment
Backend: Railway
Frontend: Vercel

📦 Features :

👤 Account Management
Create bank accounts
View account details
Handle account validation

💸 Transactions
Deposit money
Withdraw money
Transfer funds between accounts
Transaction history tracking

⚙️ Backend Architecture
DTO pattern (Data Transfer Objects)
Entity mapping layer
Service-based business logic
RESTful API controllers
Global exception handling

🧱 Project Structure
Backend (Spring Boot)
src/main/java/com/example/banking
├── controller
├── service
├── dto
├── entity
├── mapper
├── repository
└── exception

Frontend (React)
src/
├── components
├── pages
├── services (API calls)
└── routes

🔌 API Overview

Accounts
POST /api/accounts → Create account
GET /api/accounts/{id} → Get account
GET /api/accounts → Get all accounts

Transactions
POST /api/transactions/deposit
POST /api/transactions/withdraw
POST /api/transactions/transfer
GET /api/transactions/{accountId}

⚙️ Setup Instructions
Backend
git clone https://github.com/your-username/banking-backend.git
cd banking-backend
./mvnw spring-boot:run

Create a .env or configure:

SUPABASE_URL=your_url
SUPABASE_KEY=your_key
DATABASE_URL=your_db_url

Frontend
git clone https://github.com/your-username/banking-frontend.git
cd banking-frontend
npm install
npm run dev

Create .env:

VITE_API_URL=https://your-backend-url.up.railway.app

🧠 Key Learnings
Building scalable REST APIs with Spring Boot
Structuring backend using DTO + service layers
Handling financial transactions safely
Connecting React frontend to REST backend
Deploying full-stack apps (Railway + Vercel)
Working with Supabase PostgreSQL in production

📌 Future Improvements
Authentication (JWT / OAuth2)
Role-based access (Admin / User)
Transaction fees & limits
Audit logs
Improved UI/UX dashboard
Real-time balance updates

👨‍💻 Author

Youcef Kesbi
Software Engineering Student
Passionate about backend systems and scalable web apps
