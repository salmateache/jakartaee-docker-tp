CREATE DATABASE IF NOT EXISTS etudiants_db;
USE etudiants_db;
CREATE TABLE etudiant (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(50),
    prenom VARCHAR(50),
    email VARCHAR(100),
    date_naissance DATE -- Ajout de la colonne date_naissance
);
INSERT INTO etudiant (nom, prenom, email, date_naissance) VALUES
('Daaif', 'Achraf', 'ad@univ.ma', '2000-01-01'),
('Marimi', 'Jamila', 'jam@univ.ma', '1999-05-10'),
('Bodan', 'Lahcen', 'luc@univ.ma', '2001-11-20');