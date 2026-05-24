# Software Mavericks

Projeto desenvolvido para a disciplina **Arquitetura Orientada a Serviços e Web Services (SOA)**.

## Objetivo do Projeto

O projeto tem como objetivo desenvolver uma API RESTful utilizando Spring Boot para gerenciamento de clientes, veículos e serviços automotivos.

A aplicação permite cadastrar clientes, associar veículos aos clientes e registrar serviços realizados nos veículos, seguindo conceitos de Arquitetura Orientada a Serviços (SOA), organização em camadas e boas práticas de desenvolvimento.

---

## Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- Maven
- H2 Database
- Flyway
- Swagger OpenAPI
- Git/GitHub

---

## Arquitetura do Projeto

O projeto foi desenvolvido utilizando arquitetura em camadas:

```text
Swagger/API Client
        ↓
Controller
        ↓
Service
        ↓
Repository
        ↓
Banco de Dados (H2)

Flyway → Controle de Migrações
```

Estrutura do projeto:

```text
src
 ├── controller
 ├── service
 ├── repository
 ├── model
 ├── exception
 └── resources
```

---

## Funcionalidades

### Clientes

- Cadastrar cliente
- Listar clientes
- Buscar cliente por ID
- Atualizar cliente
- Excluir cliente

### Veículos

- Cadastrar veículo
- Listar veículos
- Buscar veículo por ID
- Atualizar veículo
- Excluir veículo

### Serviços

- Cadastrar serviço
- Listar serviços
- Buscar serviço por ID
- Atualizar serviço
- Excluir serviço

---

## Endpoints da API

### Cliente

| Método | Endpoint |
|----------|-----------|
| GET | /clientes |
| GET | /clientes/{id} |
| POST | /clientes |
| PUT | /clientes/{id} |
| DELETE | /clientes/{id} |

### Veículos

| Método | Endpoint |
|----------|-----------|
| GET | /veiculos |
| GET | /veiculos/{id} |
| POST | /veiculos |
| PUT | /veiculos/{id} |
| DELETE | /veiculos/{id} |

### Serviços

| Método | Endpoint |
|----------|-----------|
| GET | /servicos |
| GET | /servicos/{id} |
| POST | /servicos |
| PUT | /servicos/{id} |
| DELETE | /servicos/{id} |

---

## Banco de Dados

O projeto utiliza banco H2 em memória para desenvolvimento.

As tabelas são criadas automaticamente utilizando:

```text
Flyway Migration
```

Arquivo de migração:

```text
V1__create_tables.sql
```

---

## Documentação da API

Após iniciar a aplicação, a documentação Swagger pode ser acessada em:

```text
http://localhost:8080/swagger-ui/index.html
```

---

## Como executar o projeto

Clone o repositório:

```bash
git clone https://github.com/lzFelipee/Software-Mavericks.git
```

Entre na pasta:

```bash
cd Software-Mavericks
```

Execute:

```bash
.\mvnw.cmd spring-boot:run
```

A aplicação iniciará em:

```text
http://localhost:8080
```

---

## Integrantes

Luiz Felipe Motta da Silva — RM 559126

Pedro Henrique Faim dos Santos — RM 557440

Nicolas Lorenzo Ferreira da Silva — RM 557962

---

## Disciplina

Arquitetura Orientada a Serviços e Web Services

Professor: Carlos Eduardo Machado de Oliveira
