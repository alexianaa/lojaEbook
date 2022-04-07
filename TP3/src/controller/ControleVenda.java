package controller;

import model.Cliente;
import model.Dados;
import model.Ebook;

public class ControleVenda {

	/**
	 * 
	 * @param cliente
	 */
	public static void processoVenda(Cliente cliente) {
		/*
		 * System.out.println("digite a forma de pagamento (credito ou debito)");
		 * Scanner ler = new Scanner(System.in); String f = ler.nextLine();
		 * 
		 * switch (f) { case "credito":
		 * 
		 * cliente.getCarrinho().getVenda().setFormaPagamento(f);
		 * System.out.println("\n" + f + "\n" + "R$" +
		 * cliente.getCarrinho().getPreco());
		 * System.out.println("deseja confirmar a compra? 1. Sim 2.Nao"); int k =
		 * ler.nextInt(); switch (k) { case 1:
		 * System.out.println("compre efetuada! volte sempre!"); break; case 2:
		 * System.out.println("compra cancelada"); break; default:
		 * System.out.println("opção inválida");
		 * 
		 * break; } break; case "debito":
		 * cliente.getCarrinho().getVenda().setFormaPagamento(f);
		 * System.out.println("\n" + f + "\n" + "R$" +
		 * cliente.getCarrinho().getPreco());
		 * System.out.println("deseja confirmar a compra? 1. Sim 2.Nao"); int k2 =
		 * ler.nextInt(); switch (k2) { case 1:
		 * System.out.println("compre efetuada! volte sempre!"); break; case 2:
		 * System.out.println("compra cancelada"); break; default:
		 * System.out.println("opção inválida"); break; } break; default:
		 * System.out.println("operacao invalida"); return; }
		 */
	}

	public static String[] infoCarrinho(String cliente) {
		String[] carrinho = new String[10];
		for (Cliente edit : Dados.getClientes()) {
			if (edit.getNome().equals(cliente)) {
				Ebook[] preCarrinho = edit.getCarrinho().getEbooks();
				if (preCarrinho != null) {
					for (int i = 0; preCarrinho[i] != null; i++) {
						carrinho[i] = preCarrinho[i].toString();
					}
				}
			}
		}
		return carrinho;
	}

}
