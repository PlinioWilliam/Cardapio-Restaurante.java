import java.io.*;

public class Restaurante {
    public static void main(String[] args) throws IOException {

        Produto itens[] = new Produto[9];
        int index = 0;

        Atendimento atendimento = new Atendimento(1, "Atendimento", 4.00);
        itens[index++] = atendimento;
        Buffet buffet = new Buffet(2, "Buffet", 65.00, 35.00);
        itens[index++] = buffet;

        BufferedReader brItens = new BufferedReader(new FileReader("bebidas.txt"));
        brItens.readLine();

        String linha;
        while((linha = brItens.readLine()) != null) {
            String partes[] = linha.split(",");
            String tipo = partes[0];
            int codigo = Integer.parseInt(partes[1]);
            String nome = partes[2];
            String unidadeVenda = partes[3];
            double precoUnitario = Double.parseDouble(partes[4]);

            if(tipo.equals("R")) {
                Refrigerante refrigerante = new Refrigerante(codigo, nome, precoUnitario);
                itens[index] = refrigerante;
            } else {
                Suco suco = new Suco(codigo, nome, precoUnitario, false);
                itens[index] = suco;
            }
            index++;
        }

    }
}