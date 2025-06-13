# solid-with-java
Este projeto tem o objetivo de implementar exemplos do SOLID, acrônimo que representa um conjunto de cinco princípios de design de software:

- **S** - Single Responsibility Principle (Princípio da Responsabilidade Única)
- **O** - Open/Closed Principle (Princípio do Aberto/Fechado)
- **L** - Liskov Substitution Principle (Princípio da Substituição de Liskov)
- **I** - Interface Segregation Principle (Princípio da Segregação de Interface)
- **D** - Dependency Inversion Principle (Princípio da Inversão de Dependência)

## Estrutura do Projeto

O projeto está organizado em pacotes que representam cada princípio SOLID:

```
src/main/java/br/com/fabex/solid/
├── S/ - Single Responsibility Principle
├── O/ - Open/Closed Principle
├── L/ - Liskov Substitution Principle
├── I/ - Interface Segregation Principle
└── D/ - Dependency Inversion Principle
```

Em cada pacote há uma implementação correta (`correct`) e incorreta (`wrong`) para demonstrar:

- Como o princípio deve ser aplicado corretamente
- Quais são as violações comuns do princípio

### Exemplos Incluídos:

- **Single Responsibility**: Separação de responsabilidades entre Client e ClientMapper
- **Open/Closed**: Implementação extensível de tipos de clientes
- **Liskov Substitution**: Hierarquia correta de contas bancárias
- **Interface Segregation**: Separação de operações de compra e venda
- **Dependency Inversion**: Desacoplamento através de interfaces DAO

Cada exemplo inclui casos de uso práticos que demonstram tanto a aplicação correta quanto as violações comuns dos princípios SOLID.
---
