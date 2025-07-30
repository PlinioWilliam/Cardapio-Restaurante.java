public class Atendimento extends Produto {

    public Atendimento(int codigo, String nome, double precoUnitario) {
        super(codigo, nome, "unidade", precoUnitario);
    }

    @Override
    public double calculaCusto(double quantidade) {
        if(quantidade < 7) {
            return quantidade * super.getPrecoUnitario();
        } else {
            return 0;
        }
    }
}
