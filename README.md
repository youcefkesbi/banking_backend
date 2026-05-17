<h1>🏦 Banking System Full-Stack Application</h1>

A full-stack banking application built with Spring Boot, React.js, and Supabase, featuring account management and transaction handling with a clean layered architecture and production deployment.

<img width="1083" height="777" alt="Screenshot 2026-05-17 at 20 10 39" src="https://github.com/user-attachments/assets/c2337621-4edb-407e-825c-10c4b5045e62" />
<img width="1073" height="778" alt="Screenshot 2026-05-17 at 20 10 48" src="https://github.com/user-attachments/assets/8cb6a4a3-85f0-48c8-8f5b-cc240cf16c27" />

<h2>🚀 Live Demo</h2>
Frontend (Vercel): https://banking-frontend-red.vercel.app

Backend (Railway): https://bankingbackend-production-c265.up.railway.app/api

<h2>🧰 Tech Stack :</h2>

<h3>Backend :</h3>
Spring Boot, Spring Web, Spring Data JPA, Maven

<h3>Frontend :</h3>
React.js, CSS Modules, React hooks

<h3>Database</h3>
Supabase (PostgreSQL)

<h3>Deployment</h3>
Backend: Railway
Frontend: Vercel

<h2>📦 Features :</h2>

<h3>👤 Account Management</h3>
Create bank accounts
View account details

<h3>💸 Transactions</h3>
Deposit money
Withdraw money
Transfer funds between accounts
Transaction history tracking

<h2>⚙️ Backend Architecture</h2>
DTO pattern (Data Transfer Objects)
Entity mapping layer
Service-based business logic
RESTful API controllers
Global exception handling
Account exception handling

<h2>🧱 Project Structure</h2>

<h3>Backend (Spring Boot)</h3>
src/main/java/com/example/banking

├── controller

├── service

├── dto

├── entity

├── mapper

├── repository

└── exception

<h3>Frontend (React)</h3>
src/

├── components

├── pages

├── services (API calls)

└── routes

<h2>🔌 API Overview</h2>

<h3>Accounts</h3>

POST /api/accounts → Create account

GET /api/accounts/{id} → Get account

GET /api/accounts → Get all accounts

<h3>Transactions</h3>

POST /api/transactions/deposit

POST /api/transactions/withdraw

POST /api/transactions/transfer

GET /api/transactions/{accountId}

<h2>⚙️ Setup Instructions</h2>

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

👨‍💻 Author

Youcef Kesbi

Software Engineer, Passionate about backend systems and scalable web apps.
