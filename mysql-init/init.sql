CREATE DATABASE IF NOT EXISTS etudiants_db;
USE etudiants_db;

-- Table des étudiants
CREATE TABLE IF NOT EXISTS etudiant (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(50),
    prenom VARCHAR(50),
    email VARCHAR(100),
    date_naissance DATE
);

-- Table des notes
CREATE TABLE IF NOT EXISTS notes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    etudiant_id INT,
    matiere VARCHAR(100),
    note DOUBLE,
    FOREIGN KEY (etudiant_id) REFERENCES etudiant(id)
);

-- Insertion des étudiants
INSERT INTO etudiant (nom, prenom, email, date_naissance) VALUES
('Daif', 'Achraf', 'ade@univ.ma', '2000-05-15'),
('Marimi', 'Jamila', 'jam@univ.ma', '1999-08-22'),
('Bodan', 'Lahcen', 'luc@univ.ma', '2001-03-10');

-- Insertion des notes
INSERT INTO notes (etudiant_id, matiere, note) VALUES
(1, 'Maths', 16.5),
(1, 'Physique', 14.0),
(2, 'Maths', 12.0),
(3, 'Chimie', 13.5);
