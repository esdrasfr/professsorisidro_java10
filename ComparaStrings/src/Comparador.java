
public class Comparador {
	public static void main(String[] args) {
		
		// nesta situação a alocação da memória fica a cargo da Máquina virtual Java
//		String s1 = "Oi tudo bem? Quer batata?";
//		String s2 = "Oi tudo bem? Quer batata?";

		// quando eu uso o operador NEW, eu "forço" a Maquina Virtual a criar um novo bloco de memória
		
		String s1 = new String("Oi tudo bem? Quer batata?");
		String s2 = new String("Oi tudo bem? Quer batata?");
		
		if (s1 == s2) {
			System.out.println("apontam para o mesmo objeto");
		}
		else {
			System.out.println("apontam para objetos diferentes");
		}
		
		
		if (s1.equals(s2)) {
			System.out.println("Mesmo conteúdo");
		}
		else {
			System.out.println("Conteúdos distintos");
		}
		
		

	}
}
