package userinterface;

import java.util.Scanner;

import core.BombaDeCombustivel;

public class Posto {
	public static void main(String[] args) {
		BombaDeCombustivel bombas[]; // aqui eu crio uma lista de referências
		
		int opcao, modo;
		double valor;
		Scanner teclado = new Scanner(System.in);
		bombas = new BombaDeCombustivel[5]; // aqui quando eu uso [], sou obrigado a definir o tamanho do meu conjunto
		
		// agora eu crio os objetos
		bombas[0] = new BombaDeCombustivel("Gasolina Comum", 4.194);
		bombas[1] = new BombaDeCombustivel("Gasolina Aditivada", 4.394);
		bombas[2] = new BombaDeCombustivel("Gasolina Podium", 6.789);
		bombas[3] = new BombaDeCombustivel("Etanol", 2.494);
		bombas[4] = new BombaDeCombustivel("Diesel", 3.999);
		
		do {
			System.out.println("Escolha seu combustivel ou -1 para sair");
			for (int pos=0; pos < bombas.length; pos++) {
				System.out.println("   "+pos+" "+bombas[pos].getNome()+"  R$"+bombas[pos].getPrecoLitro());
			}
			opcao = teclado.nextInt();
			
			if (opcao >= 0 && opcao < bombas.length) {
				System.out.print("1 para litros / 2 para valor:");
				modo = teclado.nextInt();
				if (modo == 1) {
					System.out.print("  Quantos litros? ");
					valor = teclado.nextDouble();
					bombas[opcao].abastecerPorLitros(valor);
					System.out.println(bombas[opcao].exibirRecibo());
				}
				else if (modo == 2) {
					System.out.print("  Qual o valor? ");
					valor = teclado.nextDouble();
					bombas[opcao].abastecerPorValor(valor);
					System.out.println(bombas[opcao].exibirRecibo());
				}
				else {
					System.out.println("ERRO - MODO INVALIDO");
				}
			}
			else if (opcao == -1) {
				System.out.println("VOLTE SEMPRE");
			}
			else {
				System.out.println("OPCAO INVALIDA");
			}
			
			/*
			switch(opcao) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.print("1 para litros / 2 para valor:");
				modo = teclado.nextInt();
				if (modo == 1) {
					System.out.print("  Quantos litros? ");
					valor = teclado.nextDouble();
					bombas[opcao].abastecerPorLitros(valor);
					System.out.println(bombas[opcao].exibirRecibo());
				}
				else if (modo == 2) {
					System.out.print("  Qual o valor? ");
					valor = teclado.nextDouble();
					bombas[opcao].abastecerPorValor(valor);
					System.out.println(bombas[opcao].exibirRecibo());
				}
				else {
					System.out.println("ERRO - MODO INVALIDO");
				}
				break;
			case -1:
				System.out.println("OBRIGADO E VOLTE SEMPRE À ISIDROCORP GAS & ENERGY");
				break;
			default:
				System.out.println("ERRO - OPCAO INVALIDA");
			}
			*/
			
		} while (opcao != -1);
		
		
		
	}

}
