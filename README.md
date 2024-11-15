# 🚗 Pancadex - Sistema de Gerenciamento de Acidentes de Trânsito

## 📝 Sobre o Projeto
Pancadex é um sistema de gerenciamento de acidentes de trânsito desenvolvido como parte das disciplinas de Programação Orientada a Objetos e Estrutura de Dados. O sistema permite registrar, classificar e analisar diferentes tipos de acidentes de trânsito, utilizando conceitos avançados de programação.

## 🎯 Objetivos
- Implementar um sistema robusto de gerenciamento de acidentes
- Aplicar conceitos de POO e Estrutura de Dados
- Fornecer análise de risco para diferentes tipos de acidentes

## 🔧 Tecnologias Utilizadas
- Linguagem: Java
- IDE: VSCode
- Estrutura de Dados: QuickSort para ordenação

## 📚 Conceitos Aplicados

### Programação Orientada a Objetos
- **Encapsulamento**: Proteção dos dados através de modificadores de acesso
- **Herança**: Hierarquia de classes para veículos e tipos de acidentes
- **Polimorfismo**: Diferentes comportamentos para tipos específicos de acidentes
- **Abstração**: Interfaces e classes abstratas para definir contratos

### Estrutura de Dados
- **QuickSort**: Algoritmo de ordenação implementado para classificar acidentes por nível de risco
- **Listas**: Utilização de ArrayList para gerenciamento de ocorrências
- **Complexidade**:
  - Melhor caso: O(n log n)
  - Caso médio: O(n log n)
  - Pior caso: O(n²)

## 📁 Estrutura do Projeto

``` Estrutura do Projeto PANCADEX ├── .vscode ├── bin ├── lib ├── src │ ├── Acidentes │ │ ├── AcidenteCapotamento.java │ │ ├── AcidenteColisao.java │ │ └── Ocorrencia.java │ ├── Gerenciador │ │ └── GerenciadorOcorrencias.java │ ├── Tipos │ │ ├── ColisaoEngavetamento.java │ │ ├── ColisaoFrontal.java │ │ ├── ColisaoLateral.java │ │ ├── ColisaoTraseira.java │ │ └── TipoColisao.java │ └── Veiculos │ ├── Carro.java │ ├── Moto.java │ └── Veiculo.java ├── App.java └── README.md ```

### 📂 Descrição dos Diretórios

- **Acidentes/**: Classes relacionadas aos tipos de acidentes e ocorrências
- **Gerenciador/**: Contém a lógica de gerenciamento das ocorrências
- **Tipos/**: Implementações dos diferentes tipos de colisões
- **Veiculos/**: Classes que representam os diferentes tipos de veículos
- **App.java**: Classe principal que inicializa o sistema
