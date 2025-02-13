# valorTotal
O projeto "valorTotal" é uma aplicação desenvolvida em Java utilizando o framework Spring Boot, com o objetivo de calcular o valor final de pedidos, considerando descontos e frete. O sistema recebe os dados do pedido, aplica a porcentagem de desconto especificada e adiciona o valor do frete, resultando no valor total final.

 
 Funcionalidades Principais
Cálculo do Valor Total do Pedido: O sistema permite a inserção dos itens do pedido, aplicação de um percentual de desconto e adição do valor do frete, fornecendo o valor total final do pedido.

🛠 Tecnologias Utilizadas
Java: Linguagem de programação utilizada para o desenvolvimento da aplicação.
Spring Boot: Framework que facilita a criação de aplicações Java standalone e de produção.
Maven: Ferramenta de automação de compilação utilizada para gerenciamento de dependências e construção do projeto.

📂 Estrutura do Projeto
A estrutura do projeto segue a convenção padrão do Spring Boot:


css
Copiar
Editar
valorTotal
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── valortotal
│   │   │               ├── ValorTotalApplication.java
│   │   │               └── model
│   │   │                   ├── Pedido.java
│   │   │                   └── Item.java
│   │   ├── resources
│   │       └── application.properties
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── valortotal
│                       └── ValorTotalApplicationTests.java
├── .gitignore
├── HELP.md
├── LICENSE
├── README.md
├── mvnw
├── mvnw.cmd
└── pom.xml

ValorTotalApplication.java: Classe principal que inicializa a aplicação Spring Boot.
Pedido.java: Classe que representa o pedido, contendo os itens, percentual de desconto e valor do frete.
Item.java: Classe que representa um item do pedido, com atributos como nome, quantidade e preço unitário.
application.properties: Arquivo de configuração da aplicação.

🚀 Como Executar o Projeto
Pré-requisitos:

Java Development Kit (JDK) 11 ou superior instalado.
Maven instalado.
Clonar o repositório:

bash
Copiar
Editar
git clone https://github.com/MarcoAntonio86/valorTotal.git
cd valorTotal
Compilar e executar a aplicação:

bash
Copiar
Editar
./mvnw spring-boot:run
Utilizar a aplicação:

A aplicação pode ser acessada via terminal ou através de requisições HTTP, dependendo da implementação dos controladores.

📌 Melhorias Futuras
Interface Gráfica: Desenvolver uma interface gráfica para facilitar a interação do usuário com o sistema.
Persistência de Dados: Implementar um banco de dados para armazenar os pedidos e itens de forma persistente.
Validações: Adicionar validações para garantir a integridade dos dados inseridos pelo usuário.
Testes Unitários: Escrever testes unitários para assegurar o correto funcionamento das funcionalidades implementadas.
Este projeto é um exemplo prático de como utilizar o Spring Boot para desenvolver aplicações Java que realizam cálculos específicos, como o valor total de um pedido considerando descontos e frete. Contribuições e sugestões são bem-vindas!
