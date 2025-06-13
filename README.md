# 💳 Sistema de Transações Bancárias

Este projeto simula um sistema de pagamentos entre contas bancárias usando Java e Spring Boot. Ele permite criar contas, consultar informações e realizar transferências com persistência em banco de dados PostgreSQL.

---

## 🧰 Tecnologias

- ✅ **Java 17**
- ✅ **Spring Boot 3**
- ✅ **Maven**
- ✅ **PostgreSQL**
- ✅ **Spring Data JPA (Hibernate)**
- ✅ **RESTful API**
- ✅ **Insomnia/Postman** (testes de API)

---

## 📌 Funcionalidades

### 📂 Contas Bancárias

| Método  | Endpoint             | Descrição                                |
|---------|----------------------|------------------------------------------|
| `POST`  | `/contas`            | Cria uma nova conta bancária             |
| `GET`   | `/contas`            | Lista todas as contas cadastradas        |
| `GET`   | `/contas/{numero}`   | Consulta uma conta pelo número da conta  |
| `PUT`   | `/contas/{id}`       | Atualiza os dados de uma conta           |
| `DELETE`| `/contas/{id}`       | Remove uma conta pelo ID                 |

### 💸 Transações

| Método | Endpoint      | Descrição                                       |
|--------|----------------|-------------------------------------------------|
| `POST` | `/transacoes`  | Realiza uma transferência entre duas contas    |

---

## 🛠️ Como rodar o projeto localmente

### 1. Pré-requisitos

- Java 17
- PostgreSQL
- Maven 3.8+
- Git

### 2. Clonar o projeto

```bash
git clone https://github.com/DandaraEmiliano/transacoes-bancarias.git
cd transacoes-bancarias
```

### 3. Configurar banco de dados

Crie o banco e usuário no PostgreSQL:

```sql
CREATE DATABASE pagamentos;
CREATE USER seu_usuario WITH PASSWORD 'sua_senha';
```

### 4. Configurar o `application.properties`

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/pagamentos
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

### 5. Rodar o projeto

```bash
./mvnw spring-boot:run
```

---

## 📦 Estrutura de pacotes

```
com.dandaraemiliano.transacoes_bancarias
├── controller             
│   ├── ContaController.java
│   └── TransacaoController.java
├── dto                   
│   └── TransacaoRequest.java
├── model                 
│   └── Conta.java
├── repository            
│   └── ContaRepository.java
├── service               
│   ├── ContaService.java
│   └── TransacaoService.java
└── TransacoesBancariasApplication.java
```

---

## 🧪 Exemplos de requisições

### Criar conta

```http
POST /contas
Content-Type: application/json

{
  "titular": "Dandara",
  "numeroConta": "1010",
  "saldo": 1000.00
}
```

### Realizar transação

```http
POST /transacoes
Content-Type: application/json

{
  "origem": "1010",
  "destino": "2020",
  "valor": 50.00
}
```
---

## 👩🏻‍💻 Autora

**Dandara Emiliano**  
[GitHub](https://github.com/DandaraEmiliano) · [LinkedIn](https://linkedin.com/in/dandaraemiliano)

---

## 📝 Licença

Este projeto está sob a licença MIT.
