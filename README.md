# 💰 Sistema Bancário em Java (POO)

## ✨ Descrição
Projeto simples de um sistema bancário utilizando os princípios da Programação Orientada a Objetos (POO) em Java. O sistema permite criar contas, realizar saques, depósitos e aplicar rendimentos em contas do tipo poupança.

---

## 📄 Conceitos de POO utilizados

### 🔀 Herança: reutilização de código entre classes
Utilizamos herança para criar uma estrutura base comum a diferentes tipos de conta. A classe principal contém atributos e comportamentos que são compartilhados por todas as contas bancárias. As classes derivadas herdam essas funcionalidades, podendo adicionar ou sobrescrever comportamentos específicos. Isso evita repetição de código e facilita a manutenção.

### 🔒 Encapsulamento: proteção do estado dos objetos
Os atributos das classes são mantidos privados e acessados apenas por meio de métodos públicos (getters e setters). Isso impede que dados sensíveis como o saldo sejam alterados diretamente de fora da classe, garantindo maior controle e segurança sobre o estado interno dos objetos.

### 🧬 Polimorfismo: diferentes comportamentos para o mesmo método
O polimorfismo permite que uma mesma operação tenha comportamentos diferentes dependendo da classe que a implementa. No projeto, métodos comuns podem ser adaptados em cada tipo de conta, possibilitando variações de acordo com a necessidade, como diferentes formas de aplicar rendimentos.

### 🏦 Diferenças entre Conta Corrente e Conta Poupança
A conta corrente serve para movimentações básicas como depósitos e saques. Já a conta poupança, além dessas funcionalidades, também possui um mecanismo de rendimento, onde uma porcentagem é aplicada sobre o saldo, aumentando o valor armazenado ao longo do tempo. Cada tipo de conta pode ter regras e comportamentos distintos.

### 🧱 Abstração: definição de comportamentos comuns
A abstração foi utilizada para representar somente os comportamentos e atributos essenciais de uma conta bancária. Através dela, é possível criar um modelo genérico que pode ser estendido para representar diferentes tipos de contas, mantendo um padrão e facilitando a expansão futura do sistema.

---

## 📁 Estrutura de Arquivos
```
Banco.java             // Classe base com saldo, nome e número da conta
ContaPoupanca.java     // Classe que herda Banco e aplica rendimentos
TestarBancos.java      // Classe principal para testar o sistema
