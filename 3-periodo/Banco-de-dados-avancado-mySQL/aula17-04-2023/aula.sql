 //Criando procedimentos

DELIMITER $
CREATE PROCEDURE brasil_cidade_inserir (id_estado int, nome varchar(50))
BEGIN 
	INSERT INTO cidade(id_estado, nome)
    VALUES (id_estado, nome);
END $
DELIMITER ;

call brasil_cidade_inserir (16,"Tilambuco");

DELIMITER $
CREATE PROCEDURE brasil_cidade_atualizar (
id_cidade int,
id_estado int,
nome varchar (50))
BEGIN 
	REPLACE INTO cidade VALUES(id_cidade, id_estado, nome);
END $
DELIMITER ;

call brasil_cidade_atualizar (9715, 16, "TILAMBUCO");

DELIMITER $
CREATE PROCEDURE brasil_cidades_listar(ID_cidade int)BEGIN
IF(id_cidade is null) THEN
	SELECT * FROM cidade;
ELSE
	SELECT * FROM cidade
	WHERE id = id_cidade;
END IF;
END $
DELIMITER ;

call brasil_cidades_listar(2);

