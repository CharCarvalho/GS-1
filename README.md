# GS-1

Este projeto visa desenvolver um aplicativo mobile para disseminar informações e notícias sobre problemas que afetam os ambientes marinhos. O foco principal é conscientizar e informar os usuários sobre questões como poluição marinha, derretimento de geleiras e outras problemáticas ambientais que impactam a vida cotidiana. A conscientização pública é essencial para a preservação do meio ambiente, e o aplicativo surge como uma ferramenta educativa e informativa.

O objetivo do aplicativo é aumentar a conscientização sobre os desafios enfrentados pelos ambientes marinhos. O aplicativo fornecerá notícias atualizadas sobre a situação dos mares, abrangendo temas como poluição, aquecimento global e biodiversidade marinha. Além disso, disponibilizará conteúdos educativos que explicam os fenômenos ambientais, suas causas e consequências, e incentivará a participação ativa dos usuários em ações de preservação ambiental através de dicas práticas.

O desenvolvimento do aplicativo foi realizado com o framework React Native, permitindo a criação de aplicativos nativos para iOS e Android a partir de uma base de código única. Esta escolha tecnológica proporciona desempenho nativo, desenvolvimento acelerado e suporte robusto da comunidade de desenvolvedores.

Para a gestão de dados e fornecimento de conteúdo dinâmico, o aplicativo utiliza uma API desenvolvida em Java. A API coleta e consolida notícias de diversas fontes confiáveis sobre questões ambientais, facilita a criação e administração de conteúdos educativos e garante a segurança dos dados dos usuários.

Espera-se que o aplicativo contribua para o aumento da conscientização pública sobre os problemas ambientais, promovendo uma cultura de preservação e responsabilidade ecológica. Além disso, fornecerá uma base de conhecimento sólida, permitindo aos usuários compreender melhor os desafios ambientais e as ações necessárias para mitigá-los, e estimulará a participação em iniciativas de conservação.

O desenvolvimento deste aplicativo representa um passo significativo na disseminação de informações cruciais sobre os ambientes marinhos e na promoção da conscientização ambiental. Utilizando tecnologias modernas como React Native para o front-end e uma API robusta em Java para o back-end, o projeto oferece uma solução eficaz para educar e engajar o público em questões ambientais, promovendo práticas sustentáveis.

# Ocean Preservation API

Esta aplicação é uma API RESTful desenvolvida com Spring/Spring Boot, que foca na preservação e manutenção da saúde dos oceanos. A API permite a criação, leitura, atualização e exclusão de usuários e notícias relacionadas aos oceanos. Abaixo estão os detalhes e instruções para configurar e utilizar esta aplicação.

## Estrutura do Projeto

O projeto está organizado nas seguintes camadas:

1. **Model**: Contém as classes de entidade `UsuarioModel` e `NoticiaModel` que representam os usuários e notícias no banco de dados.
2. **Repository**: Contém as interfaces `UsuarioRepository` e `NoticiaRepository` que extendem `JpaRepository` para operações de persistência.
3. **Service**: Contém as classes `UsuarioService` e `NoticiaService` que encapsulam a lógica de negócio.
4. **Controller**: Contém os controladores REST `UsuarioController` e `NoticiaController` que gerenciam as requisições HTTP.
5. **Assembler**: Contém os assemblers `UsuarioModelAssembler` e `NoticiaModelAssembler` que transformam os modelos em representações HATEOAS.

## Funcionalidades

- **Gerenciamento de Usuários**: CRUD (Create, Read, Update, Delete) de usuários.
- **Gerenciamento de Notícias**: CRUD de notícias.
- **HATEOAS**: Implementação de HATEOAS para atender ao Nível 3 de Maturidade proposto por Leonard Richardson.
- **Validação**: Validação de dados com Bean Validation.
- **Paginaçã**: Paginação de recursos com muitos registros.
- **Tratamento de Erros**: Tratamento adequado dos erros e exceções.
- **Documentação**: Documentação automática com Swagger.
- **Deploy**: Capacidade de deploy em nuvem.

## Requisitos

- Java 11+
- Maven 3.6+
- Banco de dados H2 (pode ser substituído por outro banco de dados relacional configurando o `application.properties`)

## Configuração

### Clonar o Repositório

```bash
git clone https://github.com/CharCarvalho/GS-1.git)
cd GS-1
```
## Configurar o Banco de Dados

No arquivo src/main/resources/application.properties, configure as propriedades do banco de dados:

spring.datasource.url=jdbc:h2:mem:testdb

spring.datasource.driverClassName=org.h2.Driver

spring.datasource.username=sa

spring.datasource.password=password

spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

## Executar a Aplicação

Use o Maven para construir e executar a aplicação:

mvn clean install

mvn spring-boot:run

A aplicação estará disponível em http://localhost:8080.

## Documentação da API

Endpoints

Usuários

**Criar Usuários:** POST /usuarios

Request Body: Lista de objetos UsuarioModel

**Obter Todos os Usuários:** GET /usuarios

**Obter Usuário por ID:** GET /usuarios/{id}

**Atualizar Usuário:** PUT /usuarios/{id}

Request Body: Objeto UsuarioModel

**Deletar Usuário:** DELETE /usuarios/{id}

# Notícias

**Criar Notícias:** POST /noticias

Request Body: Lista de objetos NoticiaModel

**Obter Todas as Notícias:** GET /noticias

**Obter Notícia por ID:** GET /noticias/{id}

**Atualizar Notícia:** PUT /noticias/{id}

Request Body: Objeto NoticiaModel

Deletar Notícia: DELETE /noticias/{id}

Deploy em Nuvem

Para o deploy em nuvem, siga as instruções específicas da Azure.

## Contribuidores

## Vídeo de Demonstração
O vídeo de demonstração do funcionamento do software pode ser acessado no seguinte link: https://www.youtube.com/watch?v=rpnYXeC02mM
