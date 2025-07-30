public class ItemPedido {
    private Produto produto;
    private double quantidade;

    public ItemPedido(Produto produto, double quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public double getQuantidade() {
        return this.quantidade;
    }

    public double calculaSubtotal() {
        return this.produto.calculaCusto(this.quantidade);
    }
}
