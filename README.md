# WebServices-SpringBoot-JPA
![82755512-54be9a00-9daa-11ea-8e76-5190e0a0074d](https://user-images.githubusercontent.com/65496391/159095406-c54254b6-6d58-4a1f-9795-2b8e9ddfd32d.png)

### 🛠 Tecnologias
As seguintes ferramentas foram usadas na construção do projeto:
- [Java]
- [Spring Boot]
- [JPA] 
- [Maven]
- [PostgreeSQL]
- [Postman]
- [PgAdmin]
- [H2 Database engine]
- [Heroku]


## Backend web service com Spring boot, JPA e Banco de dados SQL

## MODELO DE DOMÍNIO

![82755495-3ce71600-9daa-11ea-8641-d01bfcaf1720](https://user-images.githubusercontent.com/65496391/159097913-928ef255-8715-4035-af5d-72508f58fffc.png)


## MODELO DE INSTÂNCIA

![82755481-280a8280-9daa-11ea-9be0-44ce2affc36b](https://user-images.githubusercontent.com/65496391/159098013-f0dd3888-a9bd-49e5-99cc-78ed9a8f6662.png)

## Aplicação disponivel em:

https://web-services-project.herokuapp.com/

## É possível utilizar qualquer ferramenta de requisições HTTP para testar o serviço, a utilizado no projeto foi a Postman.


## Serviços disponíveis

##  USER:
#### [GET]    https://web-services-project.herokuapp.com/users
#### [POST]   https://web-services-project.herokuapp.com/users
	{
	"name": "Diego Maradona",
	"email": "dieguitomaradona@gmail.com",
	"phone": "222222222",
	"password": lamanodedios
	 }
#### [PUT]    https://web-services-project.herokuapp.com/users/id
	{
	"name": "Ronaldo Nazário",
	"email": "ronaldoR9@gmail.com",
	"phone": "2222222222"
         }
#### [DELETE] https://web-services-project.herokuapp.com/users//id

## PRODUCT:
#### [GET]    https://web-services-project.herokuapp.com/products
#### [GET]    https://web-services-project.herokuapp.com/products/id

## CATEGORY:
#### [GET]    https://web-services-project.herokuapp.com/categories
#### [GET]    https://web-services-project.herokuapp.com/categories/id

## ORDER:
#### [GET]    https://web-services-project.herokuapp.com/orders
#### [GET]    https://web-services-project.herokuapp.com/orders/id
