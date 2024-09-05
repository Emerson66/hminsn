# HMINS

## Descrição
O **HMINS** é um sistema de controle e acompanhamento de indicadores neonatais.

## Versão
A versão atual do projeto é **0.0.1-SNAPSHOT**.

## Pré-requisitos
- [Java](https://www.oracle.com/java/technologies/javase-downloads.html) (Versão 17)
- [Maven](https://maven.apache.org/download.cgi)

## Dependências
O projeto utiliza o **Spring Boot** na versão **3.3.3** e inclui as seguintes dependências:

- **spring-boot-starter-web**: Oferece suporte para a construção de aplicativos da web usando o Spring MVC.
- **spring-boot-devtools**: Fornece ferramentas de desenvolvimento, como reinicialização automática do aplicativo.
- **Loombok**: Biblioteca de anotação Java que ajuda a reduzir o código padrão.
- **Spring Data JPA**: Persiste dados em armazenamentos SQL com Java Persistence API usando Spring Data e Hibernate.
- **H2 Database**: Fornece um banco de dados rápido na memória que suporta API JDBC e acesso R2DBC, com um espaço ocupado pequeno (2 MB). Suporta modos incorporados e de servidor, bem como um aplicativo de console baseado em navegador.
- **Validation**: Validação de Bean com Hibernate.




## Setup
O projeto utiliza o plugin **spring-boot-maven-plugin** para facilitar a construção e execução. Certifique-se de ter o Maven instalado e execute o seguinte comando para iniciar a aplicação:

```bash
mvn spring-boot:run
```

### H2
Para acessar o banco de dados H2 deve-se entrar no seguinte endereço [http://localhost:8080/h2-console](http://localhost:8080/h2-console) e inserir as seguintes configurações:

![Captura de tela de 2024-09-02 19-21-44](https://github.com/user-attachments/assets/cb167702-9353-42e4-956f-6edeb0243d24)

## Diagramas

### Diagrama de Classe

![neonatal - diagrama de classe-0](https://github.com/user-attachments/assets/68c51a5c-da01-4536-b633-8399767901e7)
