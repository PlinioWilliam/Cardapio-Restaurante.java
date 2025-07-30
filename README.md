# 🍽️ Sistema de Pedidos para Restaurante "O Pratão"

Este projeto é um sistema de pedidos orientado a objetos para o restaurante fictício “O Pratão”. Ele automatiza o processo de registrar pedidos, calcular custos com regras específicas e gerar extratos detalhados.

## 📘 Cenário

O restaurante vende diferentes tipos de produtos, como bebidas, buffet, sobremesas e serviços. O cálculo dos custos é feito com base na quantidade consumida, e algumas categorias oferecem descontos ou regras específicas.

## 📦 Estrutura de Classes

### `Produto`
Classe base com os atributos:
- `codigo`, `nome`, `unidadeVenda`, `precoUnitario`
- Método principal: `calculaCusto(quantidade)`

### Classes Derivadas de Produto
- **Refrigerante**: sem desconto, vendido em lata.
- **Suco**: vendido em copo; recebe 15% de desconto se 3 ou mais forem comprados.
- **Buffet**: vendido por quilo, com valor máximo limite.
- **Atendimento**: valor fixo por pessoa; grátis para 7 ou mais pessoas.

### `ItemPedido`
- Armazena um produto e sua quantidade.
- Método: `calculaSubtotal()`.

### `Pedido`
- Guarda até 10 itens de pedido.
- Métodos principais:
  - `adicionaItemPedido(produto, quantidade)`
  - `calculaTotalPedido()`
  - `gerarExtratoPedido()`
  - `getTotalRefrigerante()`, `getTotalSuco()`, `getTotalProdutoLata()`

## 🛠️ Implementação no `Restaurante.java`

- Carrega produtos a partir do arquivo `bebidas.txt` (formato CSV).
- Adiciona manualmente os produtos de Atendimento e Buffet.
- Cria um pedido com:
  - Dois buffets (um por quilo, um no limite).
  - Três sucos de limão.
- Exibe o extrato final do pedido.

## 📄 Formato do Arquivo `bebidas.txt`

```
tipo,codigo,nome,unidadeVenda,precoUnitario
R,101,Coca-Cola,lata,5.00
S,102,Suco de Limão,copo,6.00
...
```

## ✅ Avaliação e Regras

- Correção dos métodos e implementação das regras.
- Clareza, organização e comentários no código.
- Penalidades para atrasos ou cópias.

## 📅 Entrega

Entrega no Moodle até **17/06** com os seguintes arquivos `.java`:
- Produto, Refrigerante, Suco, Buffet, Atendimento, Pedido, ItemPedido, Restaurante