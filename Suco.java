public class Suco extends Produto {
    private boolean comAcucar;

    public Suco(int codigo, String nome, double precoUnitario, boolean comAcucar) {
        super(codigo, nome, "copo", precoUnitario);
        this.comAcucar = comAcucar;
    }

    @Override
    public double calculaCusto(double quantidade) {
        if (quantidade < 3) {
            double valorCusto = quantidade * super.getPrecoUnitario();
            return valorCusto;
        } else {
            double valorBruto = quantidade * super.getPrecoUnitario();
            double valorDesconto = valorBruto * 0.15;
            double valorCusto = valorBruto - valorDesconto;
            return valorCusto;
        }
    }

    public boolean comAcucar() {
        this.comAcucar = true;
        return this.comAcucar;
    }

    public boolean semAcucar() {
        this.comAcucar = false;
        return this.comAcucar;
    }
}
