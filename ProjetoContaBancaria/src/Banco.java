import java.util.Scanner;

public class Banco {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int opcao;
		double valor;
		ContaBancaria c = new ContaBancaria("123.456.789-00","Isidro",1234,9876,1);
		
		do {
			System.out.println("Digite sua opcao 1 - deposito / 2 - saque / 3 - info / -1 - sair");
			opcao = teclado.nextInt();
			switch(opcao) {
			case 1:
				System.out.print("Digite o valor a depositar: ");
				valor = teclado.nextDouble();
				c.depositar(valor);
				break;
			case 2:
				System.out.println("Digite o valor a sacar: ");
				valor = teclado.nextDouble();
				boolean res = c.sacar(valor);
				if (res) {
					System.out.println("   SAQUE autorizado!");
				}
				else {
					System.out.println("   SAQUE Não autorizado!");
				}
				break;
			case 3:
				System.out.println("SALDO da conta "+c.getConta()+"-"+c.getDv()+ " = R$ "+c.getSaldo() );
				break;
			case -1:
				System.out.println(" *** OBRIGADO POR FAZER PARTE DO NOSSO BANCO *** ");
				break;
			default:
				System.out.println("ERRO: OPCÃO INVALIDA!");
			}
			
		} while (opcao != -1);
		
		
		
	}

}
