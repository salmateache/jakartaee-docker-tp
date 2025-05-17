CREATE DATABASE IF NOT EXISTS evaluations_db;

USE evaluations_db;

CREATE TABLE etudiant (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(50),
    prenom VARCHAR(50),
    email VARCHAR(100)
);

CREATE TABLE evaluation (
    id INT PRIMARY KEY AUTO_INCREMENT,
    matiere VARCHAR(50),
    date_eval VARCHAR(50),
    id_etud INT,
    FOREIGN KEY (id_etud) REFERENCES etudiant(id)
);


INSERT INTO etudiant (nom, prenom, email) VALUES
('Achour', 'Imane', 'ad@univ.ma'),
('AitKarroum', 'Fatimazohra', 'fati@univ.ma'),
('Belgriri', 'Meriem', 'mery@univ.ma');

INSERT INTO evaluation (matiere, date_eval, id_etud) VALUES
('Maths', '2024-12-20', 1),
('Physique', '2025-01-05', 2),
('Informatique', '2025-02-01', 3);
