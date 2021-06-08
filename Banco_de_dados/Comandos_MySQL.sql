-- Sites importante = Gerar massa de dados https://generatedata.com/
-- Sites importante = Design de Banco de Dados relacional https://www.dbdesigner.net/

-- Sintaxe utilizada para criar um database (banco de dados), no MySQl
-- Sintaxe <create> <database> <nome_do_banco>;     
-- ex: create database itau;
create database itau;

-- Sintaxe utilizada para por em uso o database (Rodar)
-- Sintaxe <use> <nome_do_banco> 
use itau;

-- Criando uma tabela e colunas
-- Sintaxe para criar a tabela 
create table itau.cliente(
codigo_cliente integer not null primary key,
nome_cliente varchar(50) not null,
idade_cliente integer not null,
email_cliente varchar(80) not null);

-- sintaxe utilizada para ver a estrutura da tabela
describe itau.cliente;

-- Inserindo dado em uma tabela 
-- Sintaxe para insert - Primeiro chamo o insert na tabela que desejo
-- depois entre () insira as colunas ou linhas da tabela separadopor virgula, apos inserir od dados.
insert into itau.cliente
(codigo_cliente,nome_cliente,idade_cliente,email_cliente)
value
(1,"Roberto Rivelino",19,"roberto.r@itau.com.br"),
(2,"Rodrigo Fasano",36,"rodrigo.fasano@hotmail.com"),
(3,"Priscila Fasano",37,"priscilacelisa@homail.com"),
(4,"Lucas Fasano",5,"lulu@hotmail.com");



-- sintaxe de consulta os registros
select * from itau.cliente;

use itau;

-- Sintaxe utilizada para fazer a ordenação da visualização dos dados
select * from itau.cliente order by nome_cliente asc;
select * from itau.cliente order by nome_cliente desc;


-- Sintaxe utilizada para criar um filtro no Banco de dados ex: clientes com idade de 18 anos ou outro select para buscar o primeiro cliente da lista
select * from itau.cliente where idade_cliente=18;
select * from itau.cliente where codigo_cliente=1;

-- Sintaxe utilizada para fazer um range de registros no Banco de dados ex:
select * from itau.cliente where idade_cliente>=18 and idade_cliente<=25 order by idade_cliente;
-- ou a sintaxe abaixo
select * from itau.cliente where idade_cliente between 18 and 25 order by idade_cliente;

-- Sintaxe utilizada para fazer busca de registros predefinidos no Banco de dados ex: clientes com 18 anos, 20 anos e 25 anos
select * from itau.cliente where idade_cliente in(18,20,25) order by idade_cliente;


-- Sintaxe utilizada para fazer busca de registros predefinidos no Banco de dados somente do cliente e idade cliente
select nome_cliente,idade_cliente from itau.cliente where idade_cliente in(15,18,20) order by idade_cliente;

-- Sintaxe utilizada para retornar o menor valor de um campo nmérico
select min(idade_cliente) from itau.cliente;
-- ou 
select min(idade_cliente) as Idade_minina_cliente from itau.cliente;
-- ou
select * from itau.cliente where idade_cliente=18;


-- Sintaxe utilizada para fazer um sub-select
select * from itau.cliente where idade_cliente=(select min(idade_cliente) from itau.cliente);

-- Sintaxe utilizada para retornar o mairo valor de um campo nmérico
select max(idade_cliente) as Maior_Idade_cliente from itau.cliente;
-- ou subselect
select * from itau.cliente where idade_cliente=(select max(idade_cliente) from itau.cliente);

-- Sintaxe de procura de registro utilizando um campo texto
select nome_cliente,email_cliente from itau.cliente where nome_cliente="Priscila Fasano";
-- ou a primeira parte do nome
select nome_cliente,email_cliente from itau.cliente where nome_cliente like "Pri%";
-- ou a ultima parte do nome
select nome_cliente,email_cliente from itau.cliente where nome_cliente like "%Fasano";
-- ou todos os nome que contenha um nome que esta abrevidado o no com a letra M
select nome_cliente,email_cliente from itau.cliente where nome_cliente like "%M.%";

-- sintax para criar um backup nossa base de dados
create table itau.bck_cliente select * from itau.cliente;

select * from itau.bck_cliente;

-- Sintaxe para fazer a contagem dos registros
select count(*) as Total_Registros_Tab_Cliente from itau.cliente;
select count(*) as Total_Registros_Tab_Cliente_BKP from itau.bck_cliente;

select count(*) as Total_Pessoas_18_ate_25_anos from itau.cliente idade_cliente where idade_cliente between 18 and 25 order by idade_cliente;

-- Sintaxe para criar um novo campo na estrutura da nossa tabele
alter table itau.cliente add endereco varchar(80)not null;
describe itau.cliente;


-- Sintaxe de exclusão de um campo ou coluna da tabela e os seus registros
alter table itau.cliente drop endereco;

-- Sintaxe utlilizadfa para renomear um campo existente na tabela 
alter table itau.cliente rename column endereco to endereco_cliente;
select * from itau.cliente;

-- Sintaxe utilizada para modificar o tipo de dados, ou tamanho de um campo
alter table itau.cliente change endereco_cliente endereco_clientes varchar(50) not null;
alter table itau.cliente change email_cliente email_clientes varchar(60) not null;


-- Sintaxe utilizada para fazer a inserção em registros existentes e em um campo desejado
update itau.cliente set endereco_cliente="Rua Cel Joviniano Brandão, 173" where codigo_cliente=2;
-- Sintaxe utilizada para fazer a inserção em registros existentes em lote que estão em branco
update itau.cliente set endereco_cliente="Atualizar o campo Endereço Cliente" where endereco_cliente="";


-- Sintaxe do comando para xcluir fisicamente toda a tavela e os seus registros
drop table itau.funcionarios;
use itau;

-- Sintaxe utilizada para excluir registros
delete from itau.cliente;
-- ou apenas um range
delete from itau.cliente where idade_cliente >=40;

select * from itau.cliente;

-- Sintaxe de recupração de BKP de um tabela - restaurando BKP
insert into itau.cliente
(codigo_cliente,nome_cliente,idade_cliente,email_clientes,endereco_cliente)
select codigo_cliente,nome_cliente,idade_cliente,email_clientes,endereco_cliente from itau.bck_cliente;

use itau;
CREATE TABLE itau.funcionarios (
  id mediumint(8) unsigned NOT NULL auto_increment,
  codifo_funcionario mediumint,
  nome_funcionario varchar(255) default NULL,
  email_funcionario varchar(255) default NULL,
  telefone_funcionario varchar(100) default NULL,
  PRIMARY KEY (`id`)
) AUTO_INCREMENT=1;

INSERT INTO `funcionarios` (`codigo_funcionario`,`nome_funcionario`,`email_funcionario`,`telefone_funcionario`) VALUES (1,"Benedict H. Snow","parturient.montes.nascetur@eu.net","1-332-877-5140"),(2,"Ferris Henderson","sem.ut.cursus@ut.com","1-654-551-1660"),(3,"Cassandra R. Golden","torquent@nunc.net","1-976-409-1127"),(4,"Bradley X. Lowery","In@Classaptent.net","1-894-108-6861"),(5,"Aileen D. Harrington","Duis@Nullatinciduntneque.net","1-571-482-2477"),(6,"Gannon Fuller","ultrices@nonlorem.edu","1-651-600-6855"),(7,"Arden Knapp","consectetuer.adipiscing.elit@lobortis.com","1-783-507-8505"),(8,"Emerson Pennington","luctus.ut@aliquamarcu.net","1-594-724-8038"),(9,"Gil I. Beach","lorem.tristique@Suspendissedui.com","1-915-345-7482"),(10,"Ocean E. West","Suspendisse.tristique.neque@acturpisegestas.ca","1-962-505-7370");
INSERT INTO `funcionarios` (`codigo_funcionario`,`nome_funcionario`,`email_funcionario`,`telefone_funcionario`) VALUES (11,"Jeremy Small","lorem.ipsum@Donecfringilla.net","1-495-586-6098"),(12,"Kimberly Blankenship","convallis.est@tellusfaucibusleo.ca","1-422-629-3202"),(13,"Phillip Farmer","nisl.arcu@diam.edu","1-250-881-7043"),(14,"Luke Green","ligula.Aenean.euismod@acmattis.org","1-836-945-0956"),(15,"Ashton X. Davidson","tempor.augue@nonfeugiatnec.org","1-895-393-8750"),(16,"Katell Q. Branch","elit.fermentum.risus@dapibusligula.edu","1-759-827-0065"),(17,"Branden Mason","Donec.sollicitudin@Donecvitaeerat.co.uk","1-897-322-4911"),(18,"Velma Q. Kaufman","dolor.Fusce.feugiat@Quisqueimperdiet.org","1-464-698-1548"),(19,"Jenette Meyer","nisl.elementum.purus@quis.org","1-778-452-9307"),(20,"Paloma Bray","libero@mollisDuissit.edu","1-133-640-5867");
INSERT INTO `funcionarios` (`codigo_funcionario`,`nome_funcionario`,`email_funcionario`,`telefone_funcionario`) VALUES (21,"Thane Jimenez","Phasellus.fermentum.convallis@aliquetodio.ca","1-846-918-5088"),(22,"Priscilla Daniel","blandit@eu.net","1-221-143-3462"),(23,"Serena L. Horn","Ut.semper.pretium@laciniavitae.net","1-244-891-2455"),(24,"Reagan M. Morrison","ullamcorper.nisl@amet.com","1-829-571-1163"),(25,"Imogene A. Hunter","Cras.dolor@luctus.net","1-214-277-2053"),(26,"Brennan J. Stanton","luctus.sit@augue.net","1-150-979-9254"),(27,"Isabelle Casey","mi.lorem.vehicula@pretiumneque.org","1-709-849-5690"),(28,"Nehru N. Nelson","eleifend@neque.com","1-192-838-0546"),(29,"Odessa Morse","et.tristique@Crasconvallisconvallis.edu","1-276-994-3625"),(30,"Bradley Wiggins","nunc.nulla.vulputate@sagittisaugue.ca","1-407-314-6449");
INSERT INTO `funcionarios` (`codigo_funcionario`,`nome_funcionario`,`email_funcionario`,`telefone_funcionario`) VALUES (31,"Lucas E. Salinas","Aliquam@orci.com","1-464-942-9375"),(32,"Aileen U. Bryant","ullamcorper.magna@auctor.ca","1-428-100-0893"),(33,"Ronan Finch","Donec.tempus.lorem@blanditmattis.edu","1-924-341-2258"),(34,"Heidi Finley","purus.Nullam@Sedeunibh.net","1-193-181-6178"),(35,"Dante Marks","sed.pede.nec@dolortempusnon.co.uk","1-818-382-3410"),(36,"Emi W. Peck","eros.Nam@Donec.ca","1-321-879-6581"),(37,"Belle C. Marquez","metus.In@arcuiaculisenim.com","1-810-673-4950"),(38,"Idona Holmes","Fusce.aliquam.enim@Proinnislsem.net","1-556-998-7759"),(39,"Arden Q. Ray","dolor@odio.net","1-334-838-1154"),(40,"Zachary H. Humphrey","ut@molestie.co.uk","1-480-455-0949");
INSERT INTO `funcionarios` (`codigo_funcionario`,`nome_funcionario`,`email_funcionario`,`telefone_funcionario`) VALUES (41,"Norman Miles","magna@congueInscelerisque.com","1-659-693-0641"),(42,"Jenna E. Harrington","a.mi.fringilla@nisiCum.net","1-543-190-2545"),(43,"Maris M. Greer","aliquet.vel.vulputate@tellus.net","1-768-301-5357"),(44,"Todd Nieves","eu@turpisIn.com","1-277-227-1549"),(45,"Kennedy Moody","lectus.rutrum.urna@turpisnon.ca","1-905-465-0220"),(46,"Baxter Osborn","molestie@semelit.co.uk","1-920-971-5576"),(47,"Evangeline F. Stein","et.ipsum@Duis.com","1-208-677-5450"),(48,"Peter Stone","luctus.lobortis.Class@aliquetnec.org","1-732-388-2350"),(49,"Clinton Taylor","sed.sapien.Nunc@sedsem.ca","1-382-405-6550"),(50,"Fay Palmer","sodales@luctusipsum.ca","1-438-699-6388");
INSERT INTO `funcionarios` (`codigo_funcionario`,`nome_funcionario`,`email_funcionario`,`telefone_funcionario`) VALUES (51,"Walter Meadows","Donec.consectetuer@massa.com","1-858-471-1864"),(52,"Miranda O. Gross","aliquam.eu.accumsan@Donec.co.uk","1-803-404-1407"),(53,"Cheryl Z. Johnson","ut@risus.com","1-684-679-3476"),(54,"Lacy Cannon","dolor.dolor.tempus@molestiesodalesMauris.co.uk","1-768-354-7052"),(55,"Cleo W. Lott","Donec.fringilla.Donec@Sedmalesuada.edu","1-653-381-1876"),(56,"Naida Hendrix","tincidunt.dui.augue@at.edu","1-856-690-5568"),(57,"Bernard Q. Burris","Nullam@aodio.ca","1-685-232-8951"),(58,"Delilah Little","ipsum@Curabitur.com","1-683-228-6722"),(59,"Hyacinth Benjamin","eu@egetlaoreetposuere.org","1-747-892-5366"),(60,"Gisela F. Fuentes","nec.imperdiet.nec@egetmetuseu.edu","1-525-891-4493");
INSERT INTO `funcionarios` (`codigo_funcionario`,`nome_funcionario`,`email_funcionario`,`telefone_funcionario`) VALUES (61,"Brady G. Dyer","dui@Quisqueporttitoreros.edu","1-503-175-2774"),(62,"Kermit Q. Long","nec@et.ca","1-219-210-5361"),(63,"Leilani Gonzalez","eu.tellus@Vestibulumanteipsum.ca","1-305-378-0131"),(64,"Sierra P. Best","eros.non.enim@mollisvitae.co.uk","1-722-228-8803"),(65,"Vance Z. Frazier","dictum@quamdignissimpharetra.org","1-533-897-7506"),(66,"Mark O. Reid","aptent.taciti@facilisis.com","1-652-668-7753"),(67,"Nayda S. Santiago","non.ante.bibendum@Nam.co.uk","1-945-519-6469"),(68,"Galvin J. Ballard","felis@euodiotristique.com","1-140-591-2687"),(69,"Dora Duke","vitae.sodales@cubiliaCuraeDonec.ca","1-352-251-0574"),(70,"Faith X. West","auctor.velit.Aliquam@eu.edu","1-478-668-5990");
INSERT INTO `funcionarios` (`codigo_funcionario`,`nome_funcionario`,`email_funcionario`,`telefone_funcionario`) VALUES (71,"Timon K. Simmons","Nullam.velit@nequesedsem.edu","1-844-732-9054"),(72,"Gillian Mathews","Donec@diamvel.org","1-248-848-5485"),(73,"Kirsten Y. William","quis.arcu@enimnislelementum.ca","1-481-721-9493"),(74,"Christine Faulkner","rhoncus.Donec@bibendumDonecfelis.net","1-308-493-7696"),(75,"Chaim Y. Kirk","vulputate.velit@nectellus.co.uk","1-496-457-0126"),(76,"Stuart Hodges","Integer.vitae.nibh@utpellentesqueeget.co.uk","1-867-778-7143"),(77,"Len I. Lawson","rutrum.urna@ut.edu","1-762-938-6222"),(78,"Tashya Z. Sweeney","Duis.ac@mipede.ca","1-634-507-4973"),(79,"Ciaran Farrell","rhoncus@convallisest.org","1-391-957-8875"),(80,"Logan Ashley","consequat.enim.diam@luctus.edu","1-982-100-7126");
INSERT INTO `funcionarios` (`codigo_funcionario`,`nome_funcionario`,`email_funcionario`,`telefone_funcionario`) VALUES (81,"Jacob Randall","dolor.dapibus@Craslorem.edu","1-502-867-2503"),(82,"Sean M. Morrow","venenatis@ut.ca","1-549-641-8503"),(83,"Hayden Q. Fitzgerald","et@imperdietnon.ca","1-689-572-2907"),(84,"Hayfa Mason","tristique.pellentesque@auctor.net","1-489-961-6348"),(85,"Branden Blackburn","id.ante.Nunc@tellus.org","1-275-744-2418"),(86,"Evan Ochoa","convallis.ligula.Donec@purusaccumsan.edu","1-231-946-7112"),(87,"Kelsie Maynard","ac.eleifend.vitae@sodaleselit.org","1-952-148-9033"),(88,"Malcolm U. Burgess","ornare.elit.elit@temporarcuVestibulum.co.uk","1-887-257-0240"),(89,"Raven Alford","Duis.mi@felisorci.co.uk","1-820-823-9043"),(90,"Sybil Michael","ultricies.ornare.elit@amet.net","1-594-726-1676");
INSERT INTO `funcionarios` (`codigo_funcionario`,`nome_funcionario`,`email_funcionario`,`telefone_funcionario`) VALUES (91,"Rinah R. Conley","Sed.dictum.Proin@commodoatlibero.com","1-787-176-2030"),(92,"James Dickerson","sit@sitamet.com","1-705-353-4215"),(93,"Chester Espinoza","sed.facilisis.vitae@Donecatarcu.net","1-468-584-3729"),(94,"Ira V. Duncan","odio@vitaerisusDuis.org","1-829-933-7897"),(95,"Mannix Q. Christensen","tempus.lorem.fringilla@ipsumdolorsit.ca","1-142-195-1801"),(96,"Rana Walters","lorem.eu@egetmetus.edu","1-959-552-1372"),(97,"Regan Jefferson","lacinia@telluseuaugue.edu","1-431-654-3918"),(98,"Cyrus Luna","ipsum.ac.mi@egestasAliquam.org","1-323-781-4749"),(99,"Kieran Underwood","ut@et.org","1-424-221-3928"),(100,"Cole Z. Richmond","Etiam.imperdiet@Aliquamultrices.com","1-697-603-9137");

select * from itau.funcionarios;

use unibanco;

CREATE TABLE funcionarios (
  id mediumint(8) unsigned NOT NULL auto_increment,
  codigo_funcionario mediumint,
  nome_funcionario varchar(255) default NULL,
  email_funcionario varchar(255) default NULL,
  telefone_funcionario varchar(100) default NULL,
  PRIMARY KEY (`id`)
) AUTO_INCREMENT=1;


select * from unibanco.funcionarios;

create table itau.funcionarios(
codigo_funcionario integer not null auto_increment primary key,
nome_funcionario varchar(50) not null,
cpf_funcionario char(11) not null,
idade_funcionario integer not null,
email_funcionario varchar(80) not null);

describe itau.vendas;

insert into itau.vendas
(codigo_venda,produto_vendido,quantidade_vendida,valor_unitario_venda,nome_vendedor)
values
(1,"Mouse",10,28.50,"Marcos"),
(2,"Teclado",15,39.50,"Cristina"),
(3,"Impressora",10,280.00,"Edison"),
(4,"Monitores",20,450.99,"Cristina");
select * from itau.vendas;


create table itau.vendas(
codigo_venda integer not null auto_increment primary key,
produto_vendido varchar(50) not null,
quantidade_vendida integer not null,
valor_unitario_venda decimal(8,2) not null,
nome_vendedor varchar(50) not null);





-- Sintaxe utilizada para fazer o desenvolvimento de cálculos na tabela
SELECT 
    produto_vendido,
    quantidade_vendida,
    valor_unitario_venda,
    (quantidade_vendida*valor_unitario_venda) as Total,
    nome_vendedor
FROM
    itau.vendas;

-- Sintaxe utilizando a função soma para calcular os campos de uma coluna
SELECT 
    SUM(quantidade_vendida * valor_unitario_venda) AS total
FROM
    itau.vendas;
    
-- Sintaxe utilizando a função group by para agrupar resultados de um cálculo
SELECT 
    SUM(quantidade_vendida * valor_unitario_venda) AS total,
    nome_vendedor
FROM
    itau.vendas group by nome_vendedor order by total;



use itau;

CREATE TABLE `Produtos` (
	`codigo_produto` INT NOT NULL AUTO_INCREMENT,
	`nome_produto` varchar(50) NOT NULL,
	`valor_produto` DECIMAL(8.2) NOT NULL,
	`codigo_marca_produto` INT NOT NULL,
	PRIMARY KEY (`codigo_produto`)
);

CREATE TABLE `Marcas` (
	`codigo_marca` int NOT NULL AUTO_INCREMENT,
	`nome_marca` varchar(50) NOT NULL,
	PRIMARY KEY (`codigo_marca`)
);

ALTER TABLE `Produtos` ADD CONSTRAINT `Produtos_fk0` FOREIGN KEY (`codigo_marca_produto`) REFERENCES `Marcas`(`codigo_marca`);

select * from itau.marcas;
select * from itau.produtos;

describe itau.marcas;

insert into itau.produtos
(nome_produto,valor_produto,codigo_marca_produto)
values
("Fogão",1600,1),
("Microondas",480,1),
("TV",1800,2),
("Celular",1950,3);

insert into itau.marcas
(nome_marca)
values
("Brastemp"),
("Samsung"),
("LG"),
("Sony");


-- - Criando um relacionamento entre as tabelas nobanco de dados 
select p.nome_produto,p.valor_produto,m.nome_marca,m.codigo_marca
from itau.marcas as m
inner join itau.produtos as p
on(p.codigo_marca_produto=m.codigo_marca);

-- Criando um relacionamento entre as tabelas no banco de dados left join
select p.codigo_marca_produto,p.nome_produto,p.valor_produto,m.nome_marca,m.codigo_marca
from itau.marcas as m
right join itau.produtos as p
on(p.codigo_marca_produto=m.codigo_marca);

