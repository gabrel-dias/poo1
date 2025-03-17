# Trabalho para AP1

**Este Trabalho vale 50% da nota AP1**  
Dever ser feito em grupos de até 4 pessoas.  

## Data de entrega
- **Até 07/04/2025 às 23:59** por e-mail.

## Instruções para envio
- E-mail para envio: **nelson.lima@faculdadecdl.edu.br**  
- Assunto do e-mail: **Trabalho AP1 – Disciplina POO**  
- O e-mail deve conter o nome completo de todos os integrantes.

## Entregáveis
Cada grupo deve enviar:  
1. Os arquivos `.java` contendo o projeto do Eclipse.  
2. Um arquivo `.pdf` explicando o código.  

---

## Especificação da Classe

Defina em Java uma classe `CadastroDeContas`, que servirá para armazenar todas as contas bancárias de um Banco.  
Crie a classe `Conta` que possui os seguintes atributos e métodos:  
- **Atributos:** `número` e `saldo`  
- **Métodos:** `get` e `set` correspondentes.

Proporcione os seguintes construtores e métodos para as classes:  

### a) Construtores - Gabriel
1. Dois construtores que criem um cadastro de contas vazio:
   - O padrão terá uma capacidade para armazenar 10 contas.
   - Outro que receba como parâmetro esta capacidade, **não permitindo capacidade menor que 5**.  
   **(2 pts)**

### b) Método `cadastrar` - Gabriel
- Recebe como parâmetro uma instância da classe `Conta` e a armazena no cadastro.  
- Retorna:
  - `true` caso o armazenamento seja realizado com sucesso.
  - `false`, caso contrário.  
  **(2 pts)**

### c) Método `procurar`
- Recebe como parâmetro um inteiro com o número da conta.  
- Retorna:
  - A instância da classe `Conta` armazenada no cadastro, caso a encontre.
  - `null`, caso contrário.  
  **(2 pts)**

### d) Método `excluir`
- Recebe como parâmetro um inteiro com o número da conta.  
- Remove-a do cadastro.  
- Retorna:
  - `true` caso a conta seja encontrada e removida.
  - `false` caso contrário.  
  **(2 pts)**

### e) Método `qtdCadastradas`
- Retorna a quantidade de contas cadastradas atualmente no cadastro.  
**(2 pts)**
