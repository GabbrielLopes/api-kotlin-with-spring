# Mercado Livro

Este é um projeto desenvolvido em Kotlin utilizando o framework Spring Boot. Ele implementa uma API REST para gerenciar clientes de uma livraria.

## Tecnologias Utilizadas

- **Kotlin**: Linguagem principal do projeto.
- **Spring Boot**: Framework para desenvolvimento da API.
- **Gradle**: Ferramenta de build.
- **Postman**: Ferramenta para testar a API.

## Funcionalidades

- **Clientes**:
    - Criar um cliente.
    - Atualizar um cliente.
    - Listar todos os clientes.
    - Buscar um cliente por ID.
    - Deletar um cliente.

## Endpoints

### Clientes

| Método  | Endpoint         | Descrição                  |
|---------|------------------|----------------------------|
| `GET`   | `/customer`      | Lista todos os clientes.   |
| `GET`   | `/customer/{id}` | Busca um cliente por ID.   |
| `POST`  | `/customer`      | Cria um novo cliente.      |
| `PUT`   | `/customer/{id}` | Atualiza um cliente.       |
| `DELETE`| `/customer/{id}` | Deleta um cliente.         |

## Como Executar o Projeto

1. Certifique-se de ter o **Java 17** e o **Gradle** instalados.
2. Clone este repositório:
   ```bash
   git clone https://github.com/GabbrielLopes/api-kotlin-with-spring.git