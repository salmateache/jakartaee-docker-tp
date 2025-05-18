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

CREATE TABLE IF NOT EXISTS note (
    id INT PRIMARY KEY AUTO_INCREMENT,
    idEtudiant INT NOT NULL,
    idEvaluation INT NOT NULL,
    valeur FLOAT NOT NULL,
    CONSTRAINT fk_etudiant FOREIGN KEY (idEtudiant) REFERENCES etudiant(id) ON DELETE CASCADE,
    CONSTRAINT fk_evaluation FOREIGN KEY (idEvaluation) REFERENCES evaluation(id) ON DELETE CASCADE
);

INSERT INTO note (idEtudiant, idEvaluation, valeur) VALUES
(1, 1, 15.5),
(1, 2, 12.0),
(2, 1, 14.0),
(2, 2, 16.5),
(3, 1, 13.0),
(3, 2, 14.5);


CREATE TABLE IF NOT EXISTS evaluation (
    id INT PRIMARY KEY AUTO_INCREMENT,
    idCours INT NOT NULL,
    typeEvaluation VARCHAR(50),
    dateEvaluation DATE,
    coefficient FLOAT,
    noteMax FLOAT,
    CONSTRAINT fk_cours FOREIGN KEY (idCours) REFERENCES cours(id) ON DELETE CASCADE
);

INSERT INTO evaluation (idCours, typeEvaluation, dateEvaluation, coefficient, noteMax) VALUES
(1, 'Examen', '2025-06-01', 0.6, 20),
(1, 'Devoir', '2025-05-15', 0.4, 20);

