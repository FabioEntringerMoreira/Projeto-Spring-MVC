# Cadastro de títulos
> Sistema de cadastro e consulta de títulos.

## Índice
* [Informações gerais](#informacoesgerais)
* [Screenshots](#screenshots)
* [Tecnologias](#tecnologias)
* [Sugestão de configuração](#sugestoes)
* [Status](#status)

## Informações gerais
Projeto com fins educacionais. Um sistema de cadastro de títulos em geral onde o usuário entra com os dados de decrição, data de vencimento e status do título em questão e armazena os dados em um banco de dados. O sistema é responsivo e inteiramente funcional.

## Screenshots
![Screenshot](https://github.com/FabioEntringerMoreira/Projeto-Spring-MVC/blob/master/imagem/3.png)
## Technologies
* Spring MVC
* Spring Boot  
* Spring data;
* Maven;
* MySQL;
* Thymeleaf;
* DevTools e Livereload;

## Sugestão de configuração
 Criar o banco MySQL e editar o arquivo application.properties para apontar para seu banco:
```
  spring.datasource.url=jdbc:mysql://localhost:3306/db_saraiva
  spring.datasource.username=root
  spring.datasource.password=toor
```
Rodar o comando: 
```
mvn spring-boot:run
```
## Status
Projeto: _Em construção..._
