CREATE TABLE article (
	id int not null auto_increment,
	libelle VARCHAR(100),
	prix DOUBLE(4,2),
	PRIMARY KEY (id)
);

INSERT INTO article (libelle, prix) VALUES ('saucisson', 2.99);
INSERT INTO article (libelle, prix) VALUES ('1 kg de pommes vraiment pas chères', 0.67);
INSERT INTO article (libelle, prix) VALUES ('du chou qui lui par contre est super cher', 22.50);
INSERT INTO article (libelle, prix) VALUES ('un truc qui a rien avoir avec de la nourriture', 13.99);


