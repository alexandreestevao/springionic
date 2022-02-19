INSERT INTO tb_product (name, price) VALUES ('Computador', 2000.00);
INSERT INTO tb_product (name, price) VALUES ('Impressora', 800.00);
INSERT INTO tb_product (name, price) VALUES ('Mouse', 80.00);

INSERT INTO tb_category (name) VALUES ('Informática');
INSERT INTO tb_category (name) VALUES ('Escritório');

INSERT INTO tb_product_category (category_id, product_id) VALUES (1, 1);
INSERT INTO tb_product_category (category_id, product_id) VALUES (1, 2);
INSERT INTO tb_product_category (category_id, product_id) VALUES (1, 3);
INSERT INTO tb_product_category (category_id, product_id) VALUES (2, 2);

INSERT INTO tb_state (name) VALUES ('Minas Gerais');
INSERT INTO tb_state (name) VALUES ('São Paulo');

INSERT INTO tb_city (name, state_id) VALUES ('Uberlândia', 1);
INSERT INTO tb_city (name, state_id) VALUES ('São Paulo', 2);
INSERT INTO tb_city (name, state_id) VALUES ('Campinas', 2);