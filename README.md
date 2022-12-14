<p align="center">
  <img alt="GitHub language count" src="https://img.shields.io/github/languages/count/MatMB115/Trabalho_2_ESWL?color=%2304D361">

<img alt="Repository size" src="https://img.shields.io/github/repo-size/MatMB115/Trabalho_2_ESWL">

<a href="https://github.com/darlosss/repime/commits/main">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/MatMB115/Trabalho_2_ESWL">
  </a>

<img alt="License" src="https://img.shields.io/badge/license-MIT-brightgreen">
   <a href="https://github.com/MatMB115/Trabalho_2_ESWL/targazers">
    <img alt="Stargazers" src="https://img.shields.io/github/stars/MatMB115/Trabalho_2_ESWL?style=social">
  </a>
</p>

<p align="center">
  <a href="https://github.com/MatMB115/Trabalho_2_ESWL">
    <img src="https://miro.medium.com/max/460/1*ahIiDbsR6s9XgR45nJJ5DA.png" height="185" width="185" alt="Test-logo" />
  </a>
</p>

<p align="center">
    <a href="https://www.java.com/pt-BR">
        <img align="center" alt="Java" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg">
</p>

# Testes da Aplicação Web Monitor

A CLI, Command Line Interface, Web Monitor foi desenvolvido com o intuito de ser uma ferramenta leve para monitoramento via HTTPS para servidores, sem custo e Open Source.

---

## Sobre

Conforme os conceitos abordados na disciplina COM221.

As orientações estão divididas nos seguintes tópicos:

- [Funcionalidades](#funcionalidades-gear)
- [Pré-requisitos e configuração](#pré-requisitos-e-configuração-hammer_and_wrench)
- [Tecnologias](#tecnologias-technologist)
- [Contribuidores](#contribuidores)

---

## Funcionalidades :gear:

 - [x] O comando addUser deve permitir inserir um usuário no sistema capaz de herdar status de administrador. Para isso, o comando será composto pelas entradas com os campos identificados por flags (--name, -p, –email e –admin). Ademais, cada flag identifica o método responsável por coletar e validar a entrada;
 - [x] Gerar um relatório da cobertura de testes com JaCoCo.

---

## Pré-requisitos e configuração :hammer_and_wrench:
No geral, para executar a aplicação é recomendado que o sistema já possua:

  - Java 8+;
  - JUnit 4.11;
  - Visual Studio Code;
  - Maven / Gradle;
  - JaCoCo.

```bash

# Clone este repositório com
$ git clone https://github.com/MatMB115/Trabalho_2_ESWL
# ou
$ git clone git@github.com:MatMB115/Trabalho_2_ESWL.git

# Acesse a pasta do projeto no seu terminal/cmd
$ cd Trabalho_2_ESWL

# Instale o JaCoCo para gerar relatório de cobertura de código
$ mvn jacoco:prepare-agent test install jacoco:report

# Acesse a pasta do relatório
$ cd target/site

# Abre o arquivo index.html para ter acesso ao relatório gerado

```

---

## Tecnologias :technologist:
    O ponto de início foi um projeto Maven, as dependências utilizadas estão presentes no pom.xml. 
    
---

Aplicação:

    - WebMonitor
    - JUnit
    - JaCoCo
    - Lombok
    - SQLite JDBC
    - Java Dotenv
    - Log4j core
    - Picocli
    - Caffeine
    - Gson
    - J Text Util
    
---

Utilitários:

    -> Dev
    - Visual Studio Code 1.73
    - IntelliJ
---  

## Contribuidores

<table>
  <tr>
    <td align="center"><a href="https://github.com/MatMB115"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/63670910?v=4" width="100px;" alt=""/><br /><sub><b>Matheus Martins</b></sub></a><br /><a href="https://github.com/MatMB115?tab=repositories" title="Minesweep">:technologist:</a></td>
    <td align="center"><a href="https://github.com/ODBreno"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/92598517?v=4" width="100px;" alt=""/><br /><sub><b>Breno Oliveira</b></sub></a><br /><a href="https://github.com/MatMB115/repime" title="RepiMe">:technologist:</a></td>
    <td align="center"><a href="https://github.com/moohbr"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/48070411?v=4" width="100px;" alt=""/><br /><sub><b>Matheus Araújo</b></sub></a><br /><a href="https://github.com/thais-souza311" title="RepiMe">:technologist:</a></td>
    <td align="center"><a href="https://github.com/mateusbonette00"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/67030818?v=4" width="100px;" alt=""/><br /><sub><b>Mateus de Freitas Bonette</b></sub></a><br /><a href="https://github.com/omateusluz" title="RepiMe">:technologist:</a></td>
  </tr>
</table>
