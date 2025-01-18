# Projeto Web Services com Spring Boot e JPA / Hibernate

Este é o meu primeiro projeto publicado no GitHub, desenvolvido como parte do curso **Java COMPLETO: Programação Orientada a Objetos + Projetos** ministrado pelo Dr. Nélio Alves. O projeto é uma aplicação backend para um sistema de gerenciamento de pedidos, construído com **Spring Boot** e **JPA / Hibernate**.

---

## ✨ **Funcionalidades**

- **CRUD Completo:** Permite criar, listar, atualizar e deletar usuários, pedidos, categorias e produtos.
- **Relacionamentos Entre Entidades:** Implementa relações como *One-to-Many*, *Many-to-One* e *Many-to-Many*.
- **Persistência de Dados:** Integração com banco de dados H2 para desenvolvimento e testes.
- **Nível de Abstração:** Uso de repositories e serviços para organização do código.
- **Formato JSON:** Serialização e desserialização de dados.

---

## 🔧 **Tecnologias Utilizadas**

- **Linguagem:** Java 17
- **Framework:** Spring Boot 3
- **Banco de Dados:** H2 Database
- **ORM:** JPA / Hibernate
- **Ferramenta de Construção:** Maven
- **IDE:** Visual Studio Code
- **Testes de API:** Postman

---

## ⚡ **Como Executar o Projeto**

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   ```
2. Abra o projeto em sua IDE (ex.: Visual Studio Code).
3. Certifique-se de que o **JDK 17** e o **Maven** estão instalados.
4. Execute o projeto com o comando:
   ```bash
   mvn spring-boot:run
   ```
5. Acesse o console H2 no navegador em: `http://localhost:8080/h2-console`.
6. Utilize ferramentas como **Postman** para testar os endpoints REST em: `http://localhost:8080/`.

---

## 🔍 **Estrutura do Projeto**

O projeto é organizado em camadas para facilitar a manutenção e expansão:

- **Entities:** Representação das tabelas do banco de dados.
- **Repositories:** Interfaces para operações de persistência.
- **Services:** Camada de lógica de negócio.
- **Resources:** Endpoints RESTful.
- **Config:** Configurações iniciais e população do banco de dados.

---

## 📝 **Modelo Conceitual**

O sistema foi estruturado com o seguinte modelo conceitual:

- **Usuários (Users):** Dados pessoais.
- **Pedidos (Orders):** Contêm status, itens e clientes.
- **Categorias (Categories):** Agrupam os produtos.
- **Produtos (Products):** Itens vinculados aos pedidos.

---

## ⭐ **Aprendizados**

Durante o desenvolvimento deste projeto, aprendi:

- A criar aplicações RESTful usando **Spring Boot**.
- Configuração e mapeamento de entidades com **JPA / Hibernate**.
- Estruturação de projetos backend com boas práticas.
- Serialização de objetos e controle de ciclos infinitos com **Jackson**.

---

##

