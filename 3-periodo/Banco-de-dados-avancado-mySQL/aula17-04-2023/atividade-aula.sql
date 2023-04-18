use mepoupe;

select * from cliente;
select * from conta_corrente;
select * from registro_deposito; 

-- 1)

INSERT INTO cliente (nome, CPF, sexo, dt_nasc, Telefone, email)
VALUES ('Felipe Silva', '12345678910', 'M', '1990-01-01', '(11) 9999-9999', 'joao.silva@email.com'),
('Tatiane Souza', '98765432110', 'F', '1995-05-15', '(11) 8888-8888', 'maria.souza@email.com');

INSERT INTO conta_corrente (dt_hora_abertura, saldo, status, cod_cliente)
VALUES ('2023-04-17 10:00:00', 1000.00, 'Ativa', 7),
('2023-04-17 11:00:00', 500.00, 'Ativa', 8);

INSERT INTO registro_Deposito (cod_conta, dt_deposito, valor_deposito)
VALUES (2, '2023-04-17', 100.00),
(4, '2023-04-17', 200.00),
(5, '2023-04-17', 50.00),
(2, '2023-04-17', 150.00),
(5, '2023-04-17', 100.00),
(6, '2023-04-17', 150.00),
(1, '2023-04-17', 50.00),
(3, '2023-04-17', 100.00);

-- 2

DELIMITER $
CREATE PROCEDURE sp_insere_cli (var_nome varchar(50), var_cpf char(11), var_sexo char(1), var_tel char(15), var_email varchar(100)) BEGIN
CASE
WHEN var_nome IS NULL THEN SELECT "insira o nome do cliente" as msg;
WHEN var_cpf IS NULL THEN SELECT "insira o cpf do cliente" as msg;
ELSE INSERT INTO cliente(nome, CPF, sexo, telefone, email) VALUES (var_nome, var_cpf, var_sexo, var_tel, var_email);END CASE;
END $
DELIMITER ;

-- 3 

DROP TABLE transferencia;

CREATE TABLE transferencia (
cod_transferencia INT PRIMARY KEY AUTO_INCREMENT,
cod_conta_origem INT,
cod_conta_destino INT,
valor DECIMAL(9,2),
data_hora datetime,
FOREIGN KEY (cod_conta_origem) references conta_corrente(cod_conta), 
FOREIGN KEY (cod_conta_destino) references conta_corrente(cod_conta) 
);

DROP PROCEDURE sp_registra_transf;

DELIMITER $
CREATE PROCEDURE sp_registra_transf (
var_cod_conta_origem INT,
var_cod_conta_destino INT,
var_valor DECIMAL(9,2)) BEGIN
DECLARE saldo_origem DECIMAL(9,2);
SELECT saldo INTO saldo_origem from conta_corrente WHERE cod_cliente = var_cod_conta_origem;
IF (saldo_origem>=var_valor) THEN
	INSERT INTO transferencia(cod_conta_origem, cod_conta_destino, valor, data_hora) VALUES(var_cod_conta_origem, var_cod_conta_destino, var_valor, CURRENT_DATE());
	UPDATE conta_corrente
	SET saldo = saldo - var_valor
	WHERE cod_conta = var_cod_conta_origem;
	UPDATE conta_corrente
	SET saldo = saldo + var_valor
	WHERE cod_conta = var_cod_conta_destino;
ELSE SELECT 'Saldo Insuficiente' as msg;END IF;
END $
DELIMITER ;

call sp_registra_transf(3,1,600.00);

-- 4

DELIMITER $
CREATE PROCEDURE sp_lista_rel_deposito (var_data_inicial date, var_data_final date) BEGIN
SELECT c.nome, r.cod_conta, sum(r.valor_deposito) FROM registro_deposito r
JOIN conta_corrente cc ON cc.cod_conta = r.cod_conta
JOIN cliente c ON c.cod_cliente = cc.cod_cliente
WHERE dt_deposito BETWEEN var_data_inicial 
AND var_data_final
GROUP BY cod_conta
ORDER BY 3;
END $
DELIMITER ;

call sp_lista_rel_deposito('2023-02-02','2023-04-17');

-- 5 

DELIMITER $
CREATE PROCEDURE sp_rel_anual (var_data year, tipo_relatorio int) BEGIN
IF (tipo_relatorio = 1) THEN
	SELECT r.cod_conta, month(dt_saque) AS 'mes' ,sum(r.valor_saque) FROM registro_saque r
	JOIN conta_corrente cc ON cc.cod_conta = r.cod_conta
    GROUP BY 1,2;
ELSEIF (tipo_relatorio = 2) THEN 
	SELECT r.cod_conta, month(dt_deposito) 'mes' ,sum(r.valor_deposito) FROM registro_deposito r
	JOIN conta_corrente cc ON cc.cod_conta = r.cod_conta
    GROUP BY 2,1;
ELSE SELECT 'Selecione um tipo de relatorio válido'; END IF;
END $
DELIMITER ;

call sp_rel_anual (2023,2);
