# 📄 Banco Digital em Java (POO)

## 📚 Sobre o Projeto

Este projeto consiste em uma simulação de um **Banco Digital**, simples, desenvolvido em **Java**, com foco no uso de **Programação Orientada a Objetos (POO)**.  
O objetivo é praticar conceitos fundamentais como abstração, encapsulamento, herança e polimorfismo através da criação de clientes, contas e operações bancárias.

---

## 🚀 Tecnologias Utilizadas

- Java 17
- Paradigma de Programação Orientada a Objetos (POO)
- IDE: IntelliJ IDEA 

---

## 🛠️ Funcionalidades Implementadas

- Registo de **clientes**.
- Criação de contas:
    - **Conta Corrente** (CC)
    - **Conta Poupança** (CP)
- Realização de **depósitos**.
- Realização de **levantamentos**.
- **Transferência** de valores entre contas.
- Emissão de **extratos bancários**.
- Organização de contas dentro de um **banco**.
- Impressão de todas as contas registadas.

---

## 🧩 Conceitos de POO Aplicados

- **Abstração**: Criação de classes que representam entidades do banco.
- **Encapsulamento**: Controle de acesso a atributos e métodos.
- **Herança**: Especialização de `Conta` em `ContaCorrente` e `ContaPoupanca`.
- **Polimorfismo**: Comportamento diferente para contas através da interface `IConta`.

---

## 📝 Estrutura do Projeto

```plaintext
src/
├── Banco.java
├── Cliente.java
├── Conta.java (classe abstrata)
├── ContaCorrente.java
├── ContaPoupanca.java
├── IConta.java (interface)
└── Main.java
````

---

## 👩‍💻 Desenvolvido por

Tayara Cruz | Bradesco - Java Cloud Native

### 🏆 Créditos
Este projeto foi desenvolvido como exercício de prática de Java com POO, inspirado nos desafios da DIO - Digital Innovation One.




