import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int id;
		String desc;
		double preco;
		int opcao = 1;

		do {

			try {
				Produto p = new Produto();
				System.out.print("Digite o ID ");
				id = Integer.parseInt(teclado.nextLine());
				p.setId(id);

				System.out.print("Digite a descricao ");
				desc = teclado.nextLine();
				p.setDescricao(desc);

				System.out.print("Digite o preco ");
				preco = Double.parseDouble(teclado.nextLine());
				p.setPreco(preco);

				System.out.println("Produto cadastrado " + p);
				
				System.out.println("Deseja continuar? 0-Nao / 1-Sim");
				opcao = Integer.parseInt(teclado.nextLine());

			} catch (IsiException e) {
				System.out.println("Erro na regra de negocio ");
				System.out.println("Natureza do erro = " + e.getMessage());
			} catch (NumberFormatException e) {
				System.out.println("Valor digitado errado");
			} catch (InputMismatchException e) {
				System.out.println("Esperado valor NUMERICO");
			} catch (Exception e) {
				System.out.println("ERRO " + e.getMessage());
				System.out.println("Tipo do erro = " + e.getClass().getName());
			}

		} while (opcao != 0);
	}
}