public class Buffet extends Produto {
    private double valorLimite;

    public Buffet(int codigo, String nome, double precoUnitario, double valorLimite) {
        super(codigo, nome, "quilo", precoUnitario);
        this.valorLimite = valorLimite;
    }

    @Override
    public double calculaCusto(double quantidade) {
        if(quantidade * super.getPrecoUnitario() < this.valorLimite) {
            return quantidade * super.getPrecoUnitario();
        } else {
            return this.valorLimite;
        }
    }

    public double getValorLimite() {
        return valorLimite;
    }
}
