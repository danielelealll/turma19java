package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Cerveja; // Importar os atributos e infos da classe Cerveja
import entities.Loja; // Importar os atributos e infos da classe Loja

public class CadVendas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		// Iniciando a interface para criar a lista de produtos e carrinho.
		List<Cerveja> cervejas = new ArrayList<>();
		List<Cerveja> carrinho = new ArrayList<>();

		// Declaração de variáveis
		double valorTotalCompra = 0; // Valor total da compra
		int qntC; // Quantida do produto selecionada
		char auxMarca; // Recebe a marca selecionada para compra
		char opcao; // opção do menu
		boolean continua = true; // continuar compra
		boolean skol = true;
		boolean brahma = true;
		boolean madalena = true;		// para durante o programa pode retirar a cerveja da lista de compra
		boolean tarantino = true;		// e o cliente não consegui selecionar novamente
		boolean colorado = true;
		boolean eisenbahn = true;

		// Lista de produtos
		cervejas.add(new Cerveja("Skol", "pi001", 2.30, 10, "Pilsen"));
		cervejas.add(new Cerveja("Brahma", "pi002", 2.30, 10, "Pilsen"));
		cervejas.add(new Cerveja("Madalena", "pa001", 6.99, 10, "Pale Ale"));
		cervejas.add(new Cerveja("Tarantino", "pa002", 4.99, 10, "Pale Ale"));
		cervejas.add(new Cerveja("Colorado", "ip001", 4.99, 10, "IPA"));
		cervejas.add(new Cerveja("Eisenbahn", "ip002", 3.99, 10, "IPA"));

		// Inicio do programa, mostrando as opções para seleção da compra.
		do {
			limpa();
			System.out.println("EdCerveja");
			System.out.println("que a gente gosta");
			System.out.println();
			System.out.println(
					"Escolha a cerveja que deseja:\n (1) Pilsen\t (2) Pale Ale\n (3) IPA\t (4) Carrinho\n (5) Sair");
			System.out.print("Digite sua opção aqui: ");
			opcao = leia.next().charAt(0);

			switch (opcao) {
			case '1':
				System.out.println("Escolha a marca de sua preferencia.");
				System.out.println("(1) Skol\t(2) Brahma");
				System.out.print("Digite aqui: ");
				auxMarca = leia.next().charAt(0);

				// Após seleção da cerveja desejada, iniciado o processo de compra e adição no
				// carrinho.

				// Laço condicional para compra da cerveja Skol
				if (auxMarca == '1') {
					if (skol == true) {
						for (Cerveja item : cervejas) {
							if (item.getDescricao().contains("Skol")) {
								System.out.println(item.getDescricao() + " | Valor Unitário: " + item.getValorUnitario()
										+ " | Quantidade em estoque: " + item.getQtdeEstoque());
								System.out.println("Digite a quantidade:");
								qntC = leia.nextInt();
								if (qntC <= item.getQtdeEstoque() && qntC > 0) {
									item.tirarDoEstoque(qntC);
									carrinho.add(new Cerveja(item.getDescricao(), item.getCodigo(),
											item.getValorUnitario(), qntC, item.getMarca()));
									skol = false; // Impede que a cerveja seja adicionada novamente no carrinho.
									break;
								} else if (qntC > item.getQtdeEstoque()) { // verifica se há a cerveja em estoque e
																			// printa na tela caso não tenha.
									System.out.println("Estoque não disponível!");
								} else if (qntC <= 0) {
									System.out.println("Opção Inválida"); // caso o usuario digite 0 na quantidade.
								}
							}
						}
					} else {
						System.out.println("Você não pode compra esse item novamente!"); // ira ocorrer caso o cliente
																							// ja tenha adcionado essa
																							// cerveja no carrinho
					}
				} else if (auxMarca == '2') { // Inicio da condicional para compra da Brahma.
					if (brahma == true) {
						for (Cerveja item : cervejas) {
							if (item.getDescricao().contains("Brahma")) {
								System.out.println(item.getDescricao() + " | Valor Unitário: " + item.getValorUnitario()
										+ " | Quantidade em estoque: " + item.getQtdeEstoque());
								System.out.println("Digite a quantidade:");
								qntC = leia.nextInt();
								if (qntC <= item.getQtdeEstoque() && qntC > 0) {
									item.tirarDoEstoque(qntC);
									carrinho.add(new Cerveja(item.getDescricao(), item.getCodigo(),
											item.getValorUnitario(), qntC, item.getMarca()));
									brahma = false; // Impede que a cerveja seja adicionada novamente no carrinho.
									break;
								} else if (qntC > item.getQtdeEstoque()) {
									System.out.println("Estoque não disponível!"); // verifica se há a cerveja em
																					// estoque e printa na tela caso não
																					// tenha.
								} else if (qntC <= 0) {
									System.out.println("Opção Inválida"); // caso o usuario digite 0 na quantidade.
								}
							}
						}
					} else {
						System.out.println("Você não pode compra esse item novamente!"); // ira ocorrer caso o cliente
																							// ja tenha adcionado essa
																							// cerveja no carrinho
					}
				}

				break;

			case '2':
				System.out.println("Escolha a marca de sua preferencia.");
				System.out.println("(1) Madalena\t(2) Tarantino");
				System.out.print("Digite aqui: ");
				auxMarca = leia.next().charAt(0);

				if (auxMarca == '1') {
					if (madalena == true) {
						for (Cerveja item : cervejas) {
							if (item.getDescricao().contains("Madalena")) {
								System.out.println(item.getDescricao() + " | Valor Unitário: " + item.getValorUnitario()
										+ " | Quantidade em estoque: " + item.getQtdeEstoque());
								System.out.println("Digite a quantidade:");
								qntC = leia.nextInt();
								if (qntC <= item.getQtdeEstoque() && qntC > 0) {
									item.tirarDoEstoque(qntC);
									carrinho.add(new Cerveja(item.getDescricao(), item.getCodigo(),
											item.getValorUnitario(), qntC, item.getMarca()));
									madalena = false; // Impede que a cerveja seja adicionada novamente no carrinho.
									break;
								} else if (qntC > item.getQtdeEstoque()) {
									System.out.println("Estoque não disponível!");
								} else if (qntC <= 0) {
									System.out.println("Opção Inválida");
								}
							}
						}
					} else {
						System.out.println("Você não pode compra esse item novamente!"); // ira ocorrer caso o cliente
																							// ja tenha adcionado essa
																							// cerveja no carrinho
					}
				} else if (auxMarca == '2') {
					if (tarantino == true) {
						for (Cerveja item : cervejas) {
							if (item.getDescricao().contains("Tarantino")) {
								System.out.println(item.getDescricao() + " | Valor Unitário: " + item.getValorUnitario()
										+ " | Quantidade em estoque: " + item.getQtdeEstoque());
								System.out.println("Digite a quantidade:");
								qntC = leia.nextInt();
								if (qntC <= item.getQtdeEstoque() && qntC > 0) {
									item.tirarDoEstoque(qntC);
									carrinho.add(new Cerveja(item.getDescricao(), item.getCodigo(),
											item.getValorUnitario(), qntC, item.getMarca()));
									tarantino = false; // Impede que a cerveja seja adicionada novamente no carrinho.
									break;
								} else if (qntC > item.getQtdeEstoque()) {
									System.out.println("Estoque não disponível!");
								} else if (qntC <= 0) {
									System.out.println("Opção Inválida");
								}
							}
						}
					} else {
						System.out.println("Você não pode compra esse item novamente!"); // ira ocorrer caso o cliente
																							// ja tenha adcionado essa
																							// cerveja no carrinho
					}
				}

				break;

			case '3':
				System.out.println("Escolha a marca de sua preferencia.");
				System.out.println("(1) Colorado\t(2) Eisenbhan");
				System.out.print("Digite aqui: ");
				auxMarca = leia.next().charAt(0);

				if (auxMarca == '1') {
					if (colorado == true) {
						for (Cerveja item : cervejas) {
							if (item.getDescricao().contains("Colorado")) {
								System.out.println(item.getDescricao() + " | Valor Unitário: " + item.getValorUnitario()
										+ " | Quantidade em estoque: " + item.getQtdeEstoque());
								System.out.println("Digite a quantidade:");
								qntC = leia.nextInt();
								if (qntC <= item.getQtdeEstoque() && qntC > 0) {
									item.tirarDoEstoque(qntC);
									carrinho.add(new Cerveja(item.getDescricao(), item.getCodigo(),
											item.getValorUnitario(), qntC, item.getMarca()));
									colorado = false; // Impede que a cerveja seja adicionada novamente no carrinho.
									break;
								} else if (qntC > item.getQtdeEstoque()) {
									System.out.println("Estoque não disponível!");
								} else if (qntC <= 0) {
									System.out.println("Opção Inválida");
								}
							}
						}
					} else {
						System.out.println("Você não pode compra esse item novamente!"); // ira ocorrer caso o cliente
																							// ja tenha adcionado essa
																							// cerveja no carrinho
					}
				} else if (auxMarca == '2') {
					if (eisenbahn == true) {
						for (Cerveja item : cervejas) {
							if (item.getDescricao().contains("Eisenbhan")) {
								System.out.println(item.getDescricao() + " | Valor Unitário: " + item.getValorUnitario()
										+ " | Quantidade em estoque: " + item.getQtdeEstoque());
								System.out.println("Digite a quantidade:");
								qntC = leia.nextInt();
								if (qntC <= item.getQtdeEstoque() && qntC > 0) {
									item.tirarDoEstoque(qntC);
									carrinho.add(new Cerveja(item.getDescricao(), item.getCodigo(),
											item.getValorUnitario(), qntC, item.getMarca()));
									eisenbahn = false; // Impede que a cerveja seja adicionada novamente no carrinho.
									break;
								} else if (qntC > item.getQtdeEstoque()) {
									System.out.println("Estoque não disponível!");
								} else if (qntC <= 0) {
									System.out.println("Opção Inválida");
								}
							}
						}
					} else {
						System.out.println("Você não pode compra esse item novamente!"); // ira ocorrer caso o cliente
																							// ja tenha adcionado essa
																							// cerveja no carrinho
					}
				}

				break;

			case '4': // Mostrar o carrinho
				limpa();
				for (Cerveja item : carrinho) {
					valorTotalCompra = valorTotalCompra + (item.getValorUnitario() * item.getQtdeEstoque());
					System.out.println("Produto: " + item.getDescricao() + " | Valor Unitário: "
							+ item.getValorUnitario() + " | Quantidade: " + item.getQtdeEstoque());
				}

				System.out.printf("Valor total da compra: %.2f\n", valorTotalCompra);
				
				// Inicia a forma de pagamento
				Loja loja = new Loja("EdCerveja", "35.425.368/0001-25\n"); 
				System.out.println("Qual a forma de pagamento? 1- A vista | 2- Debito | 3- Credito: ");
				char formaPagamento = leia.next().charAt(0);

				switch (formaPagamento) { 
				case '1': // Forma de pagamento a vista
					System.out.println(loja.getNome() + " | " + loja.getCnpj());
					System.out.printf("\nDesconto: %.2f\n", loja.desconto(valorTotalCompra));
					System.out.printf("Imposto: %.2f\n", loja.imposto(valorTotalCompra));
					System.out.printf("Valor total da compra: %.2f\n",
							valorTotalCompra - loja.desconto(valorTotalCompra));
					break;

				case '2': // forma de pagamento no cartão de débito
					System.out.println(loja.getNome() + " | " + loja.getCnpj());
					System.out.printf("Imposto: %.2f\n", loja.imposto(valorTotalCompra));
					System.out.printf("Valor total da compra: %.2f\n", valorTotalCompra);
					break;

				case '3': // Forma de pagamento no cartão de crédito
					System.out.println("Quantas parcelas? 1- 1x (10% de juros) | 2- 2x (20% de juros): ");
					char parcela = leia.next().charAt(0);
					switch (parcela) {
					case '1': // Pagamento em 1x com juros de 10%
						System.out.println(loja.getNome() + " | " + loja.getCnpj());
						System.out.printf("Imposto: %.2f\n", loja.imposto(valorTotalCompra));
						System.out.printf("Valor dos juros: %.2f\n",loja.jurosMais10(valorTotalCompra));
						System.out.printf("Valor da parcela: %.2f\n",(loja.jurosMais10(valorTotalCompra) + valorTotalCompra));
						System.out.printf("Valor total da compra: %.2f\n", (loja.jurosMais10(valorTotalCompra) + valorTotalCompra));
						break;

					case '2': // Pagamento em 2x com juros de 20%
						System.out.println(loja.getNome() + " | " + loja.getCnpj());
						System.out.printf("Imposto: %.2f\n", loja.imposto(valorTotalCompra));
						System.out.printf("Valor dos juros: %.2f\n", loja.jurosMais20(valorTotalCompra));
						System.out.printf("Valor das parcelas: %.2f\n",
								(valorTotalCompra + loja.jurosMais20(valorTotalCompra)) / 2);
						System.out.printf("Valor total da compra: %.2f\n",
								valorTotalCompra + loja.jurosMais20(valorTotalCompra));
						break;

					default: // caso seja selecionado a opção incorreta.
						System.out.println("Opção Inválida!");
						break;
					}
					break;

				default:

					break;
				}
				
				// Retorna as opções de cerveja para o menu de compra após o cliente finalizar a compra
				System.out.println("Digite qualquer tecla para finalizar a compra: "); 
				leia.next().charAt(0);
				carrinho.clear();
				skol = true;
				brahma = true;
				madalena = true;
				tarantino = true;
				colorado = true;
				eisenbahn = true;

				break;

			case '5':
				continua = false;
				System.out.println("Fim do programa. Volte sempre!!!");
				break;

			default:
				System.out.println("Opção inválida!\n");
				break;

			}
		} while (continua == true);
	}

	public static void cabecalho(String cervejaTipo) { // Mostra no inicio do programa
		char aux1;

		System.out.println("EdCerveja");
		System.out.println("que a gente gosta\n");

	}

	public static void limpa() { // função para pular linha.
		System.out.println("\n\n");
	}
}
