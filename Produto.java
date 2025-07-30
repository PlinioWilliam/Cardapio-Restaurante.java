public class Produto {
    private final int codigo;
    private String nome;
    private final String unidadeVenda;
    private double precoUnitario;

    public Produto(int codigo, String nome, String unidadeVenda, double precoUnitario) {
        this.codigo = codigo;
        this.nome = nome;
        this.unidadeVenda = unidadeVenda;
        this.precoUnitario = precoUnitario;
    }

    public double calculaCusto(double quantidade) {
        double valorCusto = quantidade * this.precoUnitario;
        return valorCusto;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnitario() {
        return this.precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getUnidadeVenda() {
        return this.unidadeVenda;
    }
}
