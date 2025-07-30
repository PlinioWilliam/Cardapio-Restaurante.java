import java.sql.Ref;

public class Pedido {
    private ItemPedido itens[];
    private int totalItens = 0;

    public Pedido() {
        this.itens = new ItemPedido[10];
    }

    public void adicionaItemPedido(Produto produto, double quantidade) {
        if(totalItens >= 10) {
            System.out.println("Comanda Cheia");
            return;
        } else {
            ItemPedido novoItem = new ItemPedido(produto, quantidade);
            itens[totalItens] = novoItem;
            totalItens++;
        }
    }

    public double calculaTotalPedido() {
        double valorTotal = 0;
        for(int i = 0; i < totalItens; i++) {
            valorTotal += itens[i].calculaSubtotal();
        }
        return valorTotal;
    }

    public void gerarExtratoPedido() {
        System.out.println("========== EXTRATO DE COMPRA ==========");
        for(int i = 0; i < totalItens; i++) {
            System.out.println("Item #" + i + " - " + itens[i].getProduto().getNome() + " " + itens[i].getQuantidade() + "x R$" + arredondar(itens[i].getProduto().getPrecoUnitario()) + " = R$" + arredondar(itens[i].calculaSubtotal()));
        }
        System.out.println("> Total: R$" + arredondar(calculaTotalPedido()));
    }

    public int getTotalRefrigerante() {
        int totalRefrigerante = 0;
        for(int i = 0; i < totalItens; i++) {
            if(itens[i].getProduto() instanceof Refrigerante) {
                totalRefrigerante += itens[i].getQuantidade();
            }
        }
        return totalRefrigerante;
    }

    public int getTotalSuco() {
        int totalSuco = 0;
        for(int i = 0; i < totalItens; i++) {
            if(itens[i].getProduto() instanceof Suco) {
                totalSuco += itens[i].getQuantidade();
            }
        }
        return totalSuco;
    }

    public int getTotalProdutoLata() {
        int totalLata = 0;
        for(int i = 0; i < totalItens; i++) {
            if(itens[i].getProduto().getUnidadeVenda().equalsIgnoreCase("Lata")) {
                totalLata += itens[i].getQuantidade();
            }
        }
        return totalLata;
    }

    private double arredondar(double valor) {
        // METODO QUE ARREDONDA VALOR EM DUAS CASAS DECIMAIS
        return Math.round(valor * 100.0) / 100.0;
    }

}
