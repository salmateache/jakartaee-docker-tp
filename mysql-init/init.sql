CREATE DATABASE IF NOT EXISTS etudiants_db; 
 
USE etudiants_db; 
 
CREATE TABLE etudiant ( 
    id INT PRIMARY KEY AUTO_INCREMENT, 
    nom VARCHAR(50), 
    prenom VARCHAR(50), 
    email VARCHAR(100)); 
 
INSERT INTO etudiant (nom, prenom, email) VALUES 
('Daaif', 'Achraf', 'ad@univ.ma'), 
('Marimi', 'Jamila', 'jam@univ.ma'), 
('Bodan', 'Lahcen', 'luc@univ.ma'); 

CREATE TABLE IF NOT EXISTS cours (
    idCours INT PRIMARY KEY AUTO_INCREMENT,
    nomCours VARCHAR(100),
    codeCours VARCHAR(20),
    credits INT
);

INSERT INTO cours (nomCours, codeCours, credits) VALUES
('Algèbre Linéaire', 'MATH101', 4),
('Programmation Java', 'INFO201', 5),
('Systèmes d’exploitation', 'INFO310', 3);