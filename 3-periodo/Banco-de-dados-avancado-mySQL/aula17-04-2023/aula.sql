//Criando procedimentos

DELIMITER $
CREATE PROCEDURE brasil_cidade_inserir (id_estado int, nome varchar(50))
BEGIN 
	INSERT INTO cidade(id_estado, nome)
    VALUES (id_estado, nome);
END $
DELIMITER ;

Call brasil_cidade_inserir (16,"Tilambuco");

