CREATE DATABASE IF NOT EXISTS db_livraria;

USE db_livraria;

CREATE TABLE Livro (
    id_livro BIGINT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    isbn VARCHAR(10) NOT NULL,
    genero VARCHAR(45),
    EDITORA_id_editora int,
FOREIGN KEY (EDITORA_id_editora) REFERENCES editora(id_editora)
);

CREATE TABLE Editora (
    id_disciplina BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cnpj VARCHAR(14) NOT NULL,
    email VARCHAR(45)
);

INSERT INTO Livro (titulo, isbn, genero)
VALUES
('Daisy jones & the six', '12345','Romance'),
('Um de nós está mentindo', '54321','Suspense');

INSERT INTO Editora (nome, cnpj, email)
VALUES
('Papel', '12345678910112', 'papel@gmail.com'),
('Letras', '98765432134678','letras@gmail.com');