# spring-boot
 CRUD

#1 Config your database in application.properties
Line spring.datasource.url=jdbc:mysql://localhost:{yourport}/{yourdatabase}

#2 Run the project then the table will be generated automatically



----- in case you need ---
```
create database myshop;
use myshop;

CREATE TABLE shop (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    owner VARCHAR(255) NOT NULL,
    address TEXT NOT NULL,
    city VARCHAR(100) NOT NULL,
    country VARCHAR(100) NOT NULL,
    phone VARCHAR(20) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    website VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

INSERT INTO shop (name, owner, address, city, country, phone, email, website, created_at, updated_at) 
VALUES 
('Flower Haven', 'Alice Johnson', '123 Rose Street', 'New York', 'USA', '+1-555-1234', 'alice@flowerhaven.com', 'https://flowerhaven.com', NOW(), NOW()),

('Garden Bliss', 'Michael Smith', '456 Orchid Lane', 'Los Angeles', 'USA', '+1-555-5678', 'michael@gardenbliss.com', 'https://gardenbliss.com', NOW(), NOW()),

('Bloom & Co.', 'Emily Davis', '789 Tulip Road', 'Chicago', 'USA', '+1-555-9101', 'emily@bloomco.com', 'https://bloomco.com', NOW(), NOW());
```
