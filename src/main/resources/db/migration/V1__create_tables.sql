CREATE TABLE usuarios (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    percentual_corretagem DECIMAL(5,2) NOT NULL
);

CREATE TABLE ativos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    codigo VARCHAR(10) NOT NULL UNIQUE,
    nome VARCHAR(100) NOT NULL
);

CREATE TABLE operacoes (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT NOT NULL,
    id_ativo INT NOT NULL,
    quantidade INT NOT NULL CHECK (quantidade > 0),
    preco_unitario DECIMAL(15,4) NOT NULL CHECK (preco_unitario > 0),
    tipo_operacao ENUM('COMPRA', 'VENDA') NOT NULL,
    corretagem DECIMAL(10,2) NOT NULL,
    data_hora DATETIME NOT NULL,

    FOREIGN KEY (id_usuario) REFERENCES usuarios(id),
    FOREIGN KEY (id_ativo) REFERENCES ativos(id),
    INDEX idx_operacoes_usuario_ativo_data (id_usuario, id_ativo, data_hora)
);

CREATE TABLE cotacao (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    id_ativo INT NOT NULL,
    preco_unitario DECIMAL(15,4) NOT NULL CHECK (preco_unitario > 0),
    data_hora DATETIME NOT NULL,

    FOREIGN KEY (id_ativo) REFERENCES ativos(id),
    INDEX idx_cotacao_ativo_data (id_ativo, data_hora)
);

CREATE TABLE posicao (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT NOT NULL,
    id_ativo INT NOT NULL,
    quantidade INT NOT NULL CHECK (quantidade >= 0),
    preco_medio DECIMAL(15,4) NOT NULL,
    p_l DECIMAL(15,4) NOT NULL,

    FOREIGN KEY (id_usuario) REFERENCES usuarios(id),
    FOREIGN KEY (id_ativo) REFERENCES ativos(id),
    UNIQUE KEY unq_usuario_ativo (id_usuario, id_ativo)
);
