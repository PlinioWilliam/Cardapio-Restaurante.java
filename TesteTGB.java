/**
 * Programação Orientada a Objetos - 2025/1
 * Classe de teste para o Trabalho GB
 */
public class TesteTGB{

	public static void main(String[] args){
		//Classe Produto
		Produto p1 = new Produto(8721, "Item", "Copo", 7.30);
		System.out.println(p1.getNome().equals("Item") ? "#1 [OK] Produto - Nome do produto" : "#1 [NOK] Produto - Nome do produto");
		
		p1.setNome("Produto");
		System.out.println(p1.getNome().equals("Produto") ? "#2 [OK] Produto - Nome do produto" : "#2 [NOK] Produto - Nome do produto");
		
		System.out.println(p1.getPrecoUnitario() == 7.3 ? "#3 [OK] Produto - Preço unitário" : "#3 [NOK] Produto - Preço unitário");
		
		p1.setPrecoUnitario(6.5);
		System.out.println(p1.getPrecoUnitario() == 6.5 ? "#4 [OK] Produto - Preço unitário" : "#4 [NOK] Produto - Preço unitário");
		
		System.out.println(p1.calculaCusto(3) == 19.5 ? "#5 [OK] Produto.calculaCusto()" : "#5 [NOK] Produto.calculaCusto()");
		
		//Classe Refrigerante
		Refrigerante r1 = new Refrigerante(87, "Coca", 4.5);
		
		System.out.println(r1.getUnidadeVenda().equals("lata") ? "#6 [OK] Refrigerante - Unidade de venda" : "#6 [NOK] Refrigerante - Unidade de venda");
		
		System.out.println(r1.calculaCusto(4) == 18 ? "#7 [OK] Refrigerante.calculaCusto()" : "#7 [NOK] Refrigerante.calculaCusto()");
		
		//Classe Suco
		Suco s1 = new Suco(23, "Laranja", 6, true);
		
		System.out.println(s1.getUnidadeVenda().equals("copo") ? "#8 [OK] Suco - Unidade de venda" : "#8 [NOK] Suco - Unidade de venda");
		
		System.out.println(s1.calculaCusto(4) == 20.4 ? "#9 [OK] Suco.calculaCusto()" : "#9 [NOK] Suco.calculaCusto()");
		
		//Classe Buffet
		Buffet b1 = new Buffet(6, "Buffet", 65, 35);
		
		System.out.println(b1.getUnidadeVenda().equals("quilo") ? "#10 [OK] Buffet - Unidade de venda" : "#10 [NOK] Buffet - Unidade de venda");
		
		if(b1.calculaCusto(0.582) == 35){
			System.out.println("#11 [OK] Buffet.calculaCusto()");
		} else{
			System.out.println("#11 [NOK] Buffet.calculaCusto()");
			System.out.println("  Valor previsto: 35");
			System.out.println("  Valor recebido: " + b1.calculaCusto(0.582));
		}
		
		if(b1.calculaCusto(0.420) == 27.3){
			System.out.println("#12 [OK] Buffet.calculaCusto()");
		} else{
			System.out.println("#12 [NOK] Buffet.calculaCusto()");
			System.out.println("  Valor previsto: 27.3");
			System.out.println("  Valor recebido: " + b1.calculaCusto(0.420));
		}
		
		//Classe Atendimento
		Atendimento a1 = new Atendimento(2, "Atendimento", 7);
		
		if(a1.calculaCusto(3) == 21){
			System.out.println("#13 [OK] Atendimento.calculaCusto()");
		} else{
			System.out.println("#13 [NOK] Atendimento.calculaCusto()");
			System.out.println("  Valor previsto: 21");
			System.out.println("  Valor recebido: " + a1.calculaCusto(3));
		}
		
		if(a1.calculaCusto(8) == 0){
			System.out.println("#14 [OK] Atendimento.calculaCusto()");
		} else{
			System.out.println("#14 [NOK] Atendimento.calculaCusto()");
			System.out.println("  Valor previsto: 0");
			System.out.println("  Valor recebido: " + a1.calculaCusto(8));
		}
		
		//Classe ItemPedido
		ItemPedido ip1 = new ItemPedido(s1, 8);		
		if(ip1.calculaSubtotal() == 40.8){
			System.out.println("#15 [OK] ItemPedido.calculaSubtotal()");
		} else{
			System.out.println("#15 [NOK] ItemPedido.calculaSubtotal()");
			System.out.println("  Valor previsto: 40.8");
			System.out.println("  Valor recebido: " + ip1.calculaSubtotal());
		}
		
		ItemPedido ip2 = new ItemPedido(r1, 2);
		if(ip2.calculaSubtotal() == 9){
			System.out.println("#16 [OK] ItemPedido.calculaSubtotal()");
		} else{
			System.out.println("#16 [NOK] ItemPedido.calculaSubtotal()");
			System.out.println("  Valor previsto: 9");
			System.out.println("  Valor recebido: " + ip2.calculaSubtotal());
		}
		
		ItemPedido ip3 = new ItemPedido(b1, 0.45);
		if(ip3.calculaSubtotal() == 29.25){
			System.out.println("#17 [OK] ItemPedido.calculaSubtotal()");
		} else{
			System.out.println("#17 [NOK] ItemPedido.calculaSubtotal()");
			System.out.println("  Valor previsto: 29.25");
			System.out.println("  Valor recebido: " + ip3.calculaSubtotal());
		}
		
		ItemPedido ip4 = new ItemPedido(b1, 0.570);
		if(ip4.calculaSubtotal() == 35){
			System.out.println("#18 [OK] ItemPedido.calculaSubtotal()");
		} else{
			System.out.println("#18 [NOK] ItemPedido.calculaSubtotal()");
			System.out.println("  Valor previsto: 35");
			System.out.println("  Valor recebido: " + ip4.calculaSubtotal());
		}
		
		Pedido pedido = new Pedido();
		pedido.adicionaItemPedido(a1, 7);
		pedido.adicionaItemPedido(s1, 8);
		pedido.adicionaItemPedido(r1, 2);
		pedido.adicionaItemPedido(r1, 3);
		pedido.adicionaItemPedido(b1, 0.45);
		pedido.adicionaItemPedido(b1, 0.570);
		pedido.adicionaItemPedido(b1, 0.495);
		pedido.adicionaItemPedido(b1, 0.386);
		pedido.adicionaItemPedido(b1, 0.585);
		pedido.adicionaItemPedido(b1, 0.483);
		
		pedido.adicionaItemPedido(b1, 0.510);
		
		if(pedido.calculaTotalPedido() == 251.21){
			System.out.println("#19 [OK] Pedido.calculaTotalPedido()");
		} else{
			System.out.println("#19 [NOK] Pedido.calculaTotalPedido()");
			System.out.println("  Valor previsto: 251.21");
			System.out.println("  Valor recebido: " + pedido.calculaTotalPedido());
		}
		
		System.out.println(pedido.getTotalRefrigerante() == 5 ? "#20 [OK] Pedido.getTotalRefrigerante()" : "#20 [NOK] Pedido.getTotalRefrigerante()");
		
		System.out.println(pedido.getTotalSuco() == 8 ? "#21 [OK] Pedido.getTotalSuco()" : "#21 [NOK] Pedido.getTotalSuco()");
		
		System.out.println(pedido.getTotalProdutoLata() == 5 ? "#22 [OK] Pedido.getTotalProdutoLata()" : "#22 [NOK] Pedido.getTotalProdutoLata()");
		
		pedido.gerarExtratoPedido();
		
	}
}
