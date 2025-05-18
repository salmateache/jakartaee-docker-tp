CREATE DATABASE IF NOT EXISTS etudiants_db;
USE etudiants_db;

CREATE TABLE releve_notes (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nom_etudiant VARCHAR(100),
    matiere VARCHAR(100),
    note DOUBLE
);

INSERT INTO releve_notes (nom_etudiant, matiere, note) VALUES
('Aitkarroum titim', 'Mathématiques', 15.5),
('Belgriri Mery', 'Physique', 17.75),
('Achour Imane', 'Informatique', 12.2);
