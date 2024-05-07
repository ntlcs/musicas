Ex2_05

# Sistema de Gerenciamento de Músicas e Podcasts com POO

Este é um sistema de gerenciamento de músicas e podcasts desenvolvido em Java, utilizando os princípios da Programação Orientada a Objetos (POO). O código demonstra a aplicação de conceitos como encapsulamento, polimorfismo e herança para criar um sistema modular e extensível.

## Classes e Pacotes

O projeto está estruturado em pacotes e classes que representam entidades relacionadas ao domínio do problema:

- **`br.com.natalia.minhasmusicas.principal`**: Pacote que contém a classe principal do programa.
  - **`Principal.java`**: Classe principal que contém o método `main` e é responsável pela execução do programa.

- **`br.com.natalia.minhasmusicas.modelos`**: Pacote que contém as classes que representam os modelos de dados do sistema.
  - **`Musicas.java`**: Classe que representa uma música. Demonstra encapsulamento ao definir atributos privados e métodos públicos para acessá-los e manipulá-los.
  - **`Podcast.java`**: Classe que representa um podcast. Segue o mesmo padrão de encapsulamento da classe `Musicas`.
  - **`MinhasPreferidas.java`**: Classe que representa a lista de preferências do usuário. Demonstração de encapsulamento ao encapsular a lógica de manipulação da lista de preferências.

## Herança e Polimorfismo

As classes `Musicas` e `Podcast` são subclasses de uma classe mais abstrata ou interface que define um comportamento comum. Isso permite a utilização do polimorfismo, onde objetos de diferentes classes podem ser tratados de forma uniforme. No caso do código fornecido, não temos uma classe abstrata comum para `Musicas` e `Podcast`, mas a estrutura do código permite que ambas sejam tratadas de forma polimórfica quando manipuladas pela classe `MinhasPreferidas`.

## Funcionalidades

O programa possui as seguintes funcionalidades:

- **Cadastro de Músicas e Podcasts**: Utiliza encapsulamento para garantir que os atributos das músicas e podcasts sejam acessados e manipulados de forma controlada.
- **Reprodução e Curtidas**: Demonstra encapsulamento ao definir métodos públicos para reproduzir e curtir músicas e podcasts.
- **Armazenamento de Preferências**: Utiliza polimorfismo para armazenar tanto músicas quanto podcasts na lista de preferências, tratando-os de forma uniforme.

## Como Executar

Para executar o programa, siga os seguintes passos:

1. Certifique-se de ter o JDK (Java Development Kit) instalado em sua máquina.
2. Clone este repositório para o seu ambiente local.
3. Navegue até o diretório onde o projeto está localizado.
4. Compile o arquivo `Principal.java` com o comando:
    ```
    javac br/com/natalia/minhasmusicas/principal/Principal.java
    ```
5. Execute o arquivo compilado com o comando:
    ```
    java br.com.natalia.minhasmusicas.principal.Principal
    ```

