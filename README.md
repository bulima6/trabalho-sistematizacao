
# Sistema Gerenciador de Contatos

Este é um sistema simples de Gerenciamento de Contatos escrito em Java. O sistema utiliza uma lista encadeada para armazenar, buscar e remover contatos.

## Funcionalidades:
1. Adicionar novo contato
2. Buscar contato por nome ou número de telefone
3. Remover contato por nome ou número de telefone
4. Listar todos os contatos

## Como configurar o ambiente e executar:
1. Certifique-se de ter o **Java Development Kit (JDK)** instalado. Você pode verificar a instalação com o comando:
   ```
   javac -version
   ```
2. Para compilar os arquivos Java, navegue até o diretório onde os arquivos estão salvos e execute:
   ```
   javac Contact.java Node.java ContactList.java ContactManager.java
   ```
3. Para rodar o programa:
   ```
   java ContactManager
   ```

## Persistência de Dados (Opcional):
O sistema pode ser modificado para incluir persistência de dados, utilizando um banco de dados ou arquivos para salvar os contatos de forma permanente. A versão atual não implementa essa funcionalidade, mas poderia ser estendida para tal.

## Estrutura do Código:
- `Contact.java`: Representa um contato com nome, número de telefone e email.
- `Node.java`: Representa um nó na lista encadeada, contendo um objeto `Contact` e uma referência para o próximo nó.
- `ContactList.java`: Gerencia a lista encadeada, fornecendo métodos para adicionar, buscar, remover e listar contatos.
- `ContactManager.java`: Contém o método principal para interagir com o usuário via linha de comando.

## Memória de Desenvolvimento

### Estrutura de Dados Utilizada:
Este projeto faz uso de uma **Lista Encadeada** para armazenar os contatos. Cada contato é encapsulado em um `Node`, que contém o objeto `Contact` e uma referência ao próximo nó na lista. Essa estrutura permite adicionar e remover contatos de forma dinâmica, sem a necessidade de definir um tamanho fixo para a lista.

### Algoritmos:
1. **Algoritmo de Busca**:
   O sistema utiliza uma busca linear para encontrar contatos na lista encadeada. Percorremos cada nó da lista, verificando se o nome ou o número de telefone corresponde ao termo de busca fornecido pelo usuário. Esse método foi escolhido por sua simplicidade e adequação a uma quantidade moderada de contatos.

2. **Algoritmo de Remoção**:
   A remoção de contatos é feita percorrendo a lista até encontrar o contato desejado, ajustando as referências dos nós para manter a integridade da lista encadeada.

### Estrutura Modular:
O projeto é organizado em quatro classes principais:
- `Contact`: Classe que encapsula as informações de um contato.
- `Node`: Classe que representa um nó na lista encadeada.
- `ContactList`: Classe que gerencia a lista encadeada, permitindo adicionar, remover, buscar e listar contatos.
- `ContactManager`: Classe que interage com o usuário através de um menu em linha de comando.

### Motivações para a Escolha:
A escolha da lista encadeada se justifica pela necessidade de adicionar e remover contatos de forma eficiente, sem precisar gerenciar o tamanho de um array. Embora a busca em uma lista encadeada seja linear, essa estrutura oferece maior flexibilidade para as operações de inserção e remoção, que são mais comuns em um sistema de gerenciamento de contatos.

### Possíveis Melhorias:
- **Persistência de Dados**: O sistema pode ser estendido para salvar os contatos permanentemente utilizando um banco de dados ou arquivos.
- **Interface Gráfica (GUI)**: A interface de linha de comando pode ser substituída por uma interface gráfica para melhorar a experiência do usuário.

