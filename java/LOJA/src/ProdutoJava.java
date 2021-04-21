package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Teste {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		Produto product1 = new Produto("XL1", "Camisa", 100.55);

		product1.incluirEstoque(10);

		product1.setValorUnitario(80.99);
		System.out.println(product1.getDescricao() + " R$" + product1.getValorUnitario() + " - Qtde em estoque: "
				+ product1.getQtdeEstoque());

	}

}
