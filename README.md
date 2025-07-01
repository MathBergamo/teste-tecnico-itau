# 🏦 Processo Seletivo Itaú Unibanco – Fase 2 (Teste Técnico)

## Uso

Esta documentação tem como objetivo apresentar o desafio técnico proposto pelo Itaú. 
Seu uso é exclusivamente educacional. Aplicarei meus conhecimentos de acordo com as especificações do desafio utilizando
a lingaguem Java e Spring Boot.

## 📘 Contexto

Renda variável é uma modalidade de investimento em que os retornos não são fixos ou previsíveis, como ocorre na renda fixa.  
A principal característica desse tipo de investimento é a possibilidade de ganhos (ou perdas) conforme as oscilações de mercado.

Ações, fundos imobiliários (FIIs) e ETFs são exemplos comuns.  
É sobre esse contexto que iremos fazer o teste técnico.

---

## 📚 Glossário

- **Ativo:**  
  Um ativo é qualquer item que tenha valor econômico e possa ser negociado.  
  No mercado financeiro, ativos são títulos que representam participação (como ações) ou direitos sobre algo (como cotas de fundos).  
  _Ex: ITSA3, KDF11._

- **Preço:**  
  Determinado pela lei da oferta e da demanda no mercado.

- **Bolsa de Valores:**  
  Ambiente onde os ativos são negociados. No Brasil, a principal é a **B3**.

- **Volatilidade:**  
  Medida da variação de preços de um ativo.

- **Dividendos/JSP:**  
  Parte do lucro de empresas distribuído aos acionistas/cotistas.

- **Preço Médio:**  
  Média dos preços das operações, subindo e descendo.

- **P&L (Profit & Loss):**  
  Lucro / Prejuízo do cliente, valor pago vs preço atual do mercado.

- **Tipo de Operação:**  
  Compra e Venda

- **Corretagem:**  
  Valor pago à corretora Itaú por intermediar a operação com a B3.

---

## ✅ O que é esperado no teste

Esse teste visa:

- Conhecer seu potencial em resolver problemas reais.
- Avaliar padrões de codificação, organização e boas práticas.
- Ver foco em eficiência e escalabilidade, priorizando performance e clareza.

---

## 1. 🗃️ Modelagem de Banco Relacional (MySQL)

### Tabelas

- `usuarios` (id, nome, email, %corretagem)
- `ativos` (id, codigo, nome)
- `operacoes` (id, id_usuario, id_ativo, quantidade, preco_unitario, tipo_operacao, corretagem, data_hora)
- `cotacao` (id, id_ativo, preco_unitario, data_hora)
- `posicao` (id, id_usuario, id_ativo, quantidade, preco_medio, p_l)

### Tarefas

1. Apresente o script SQL de criação das tabelas (snake_case).
2. Justifique a escolha dos tipos de dados.

---

## 2. ⚙️ Índices e Performance

### Requisitos

- Consultar rapidamente as operações de um usuário em determinado ativo nos últimos 30 dias.
- As cotações mudam constantemente e afetam a posição dos clientes em tempo real.

### Tarefas

1. Proponha e justifique índices para essa consulta.
2. Escreva o SQL otimizado.
3. Crie a estrutura para atualização da posição com base na cotação.

---

## 3. 💻 Aplicação

### Requisitos

Crie um app .NET Core em C# (o front-end é livre). Deve:

- Exibir operações por usuário.
- Calcular total investido, P&L por papel e corretagem total.

### Tarefas

1. Crie a aplicação (sem dependências externas) com boas práticas.
2. Utilize `async/await` com Entity Framework ou Dapper.

---

## 4. 🧮 Lógica de Negócio – Preço Médio

### Tarefa

- Considere diferentes quantidades e preços.
- Trate entradas inválidas.

---

## 5. 🧪 Testes Unitários

Utilize xUnit ou MSTest.

### Tarefas

- Testes positivos com valores esperados.
- Testes de erro (quantidade zero, lista vazia).
- Estrutura clara e isolada.

---

## 6. 🧬 Testes Mutantes

### Conceito

Testes mutantes simulam erros no código para verificar se os testes conseguem detectá-los.

### Tarefas

- Explique o conceito.
- Dê um exemplo de mutação no método de preço médio que faria um teste falhar.

---

## 7. 🔗 Integração entre Sistemas

### Requisitos

Consumo de cotações por Kafka.

### Tarefas

- Crie um Worker Service .NET para consumir e salvar cotações.
- Implemente estratégias de **retry** e **idempotência**.

---

## 8. 🧯 Engenharia do Caos

O serviço deve funcionar mesmo que o serviço de cotações esteja indisponível.

### Tarefas

- Aplicar **circuit breaker**, fallback e observabilidade.

---

## 9. 📈 Escalabilidade e Performance

O volume de operações atingiu 1 milhão/dia.

### Tarefas

- Explique como aplicar **auto-scaling horizontal**.
- Compare estratégias de **balanceamento de carga** (round-robin vs latência).

---

## 10. 🌐 Documentação e APIs

### APIs REST

- Informar ativo e retornar última cotação.
- Consultar preço médio de um ativo por usuário.
- Consultar posição e corretagem.
- Retornar Top 10 clientes com maiores posições e corretagens.

### Atributos

- Crie um exemplo de endpoint REST (método, URL, parâmetros).
- Use OpenAPI 3.0 (YAML ou JSON).

---

## 🔗 Dicas

- [API para consulta de cotações](https://b3api.vercel.app/)
- [Conteúdo Educacional Itaú](https://www.itaucorretora.com.br/educacional/educacional.asp)
- [Site da B3](https://www.b3.com.br/pt_br/produtos-e-servicos/negociacao/renda-variavel/)

---

## 🚨 Entrega

> Após o término, **publique no GitHub pessoal** e **envie o caminho como resposta no retorno**,  
> de preferência com a **autorreferência solicitada no início**.

