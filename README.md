💳 Sistema de Transações Bancárias
Este projeto simula um sistema de pagamentos entre contas bancárias usando Java e Spring Boot. Ele permite criar contas, consultar informações e realizar transferências com persistência em banco de dados PostgreSQL.

🧰 Tecnologias
✅ Java 17
✅ Spring Boot 3
✅ Maven
✅ PostgreSQL
✅ Spring Data JPA (Hibernate)
✅ RESTful API
✅ Insomnia/Postman (testes de API)

📌 Funcionalidades
📂 Contas Bancárias
Método	Endpoint	Descrição
POST	/contas	Cria uma nova conta bancária
GET	/contas	Lista todas as contas cadastradas
GET	/contas/{numero}	Consulta uma conta pelo número

💸 Transações
Método	Endpoint	Descrição
POST	/transacoes	Realiza uma transferência entre duas contas

🛠️ Como rodar o projeto localmente
1. Pré-requisitos
Java 17
PostgreSQL
Maven 3.8+
Git
2. Clonar o projeto
git clone https://github.com/DandaraEmiliano/transacoes-bancarias.git
cd transacoes-bancarias
3. Configurar banco de dados
Crie o banco e usuário no PostgreSQL:

CREATE DATABASE pagamentos;
CREATE USER seu_usuario WITH PASSWORD 'sua_senha';
GRANT ALL PRIVILEGES ON DATABASE pagamentos TO dandaraemiliano;
4. Configurar o application.properties
spring.datasource.url=jdbc:postgresql://localhost:5432/pagamentos
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
5. Rodar o projeto
./mvnw spring-boot:run

📦 Estrutura de pacotes
sistema.de.pagamento.transacional
├── controller         # Controllers REST
├── model              # Entidades JPA
├── repository         # Interfaces JPA
├── service            # Lógica de negócio
└── TransacionalApplication.java

🧪 Exemplos de requisições
Criar conta
POST /contas
Content-Type: application/json

{
  "titular": "Dandara",
  "numeroConta": "1111",
  "saldo": 1000.00
}
Realizar transação
POST /transacoes
Content-Type: application/json

{
  "origem": "1111",
  "destino": "2222",
  "valor": 250.00
}

📈 Próximos passos
🔐 Implementar autenticação com JWT
📄 Documentar com Swagger/OpenAPI
🧪 Adicionar testes unitários e de integração
☁️ Publicar em ambiente cloud (Heroku, Render, etc)

👩‍💻 Autora
Dandara Emiliano
GitHub · LinkedIn

📝 Licença
Este projeto está sob a licença MIT.