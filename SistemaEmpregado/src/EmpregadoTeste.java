import java.util.ArrayList;

public class EmpregadoTeste {
	public static void main(String[] args) {
		
		// declaro uma variável do tipo ArrayList que armazena Empregados
		// o que significa? que posso ter uma quantidade incontável de objetos armazenados aqui
		ArrayList<Empregado> lista;
		
		lista = new ArrayList<Empregado>(); // instanciei a lista
		
		lista.add(new Empregado("Jose", "Presidente", 10000));
		lista.add(new Empregado("Maria", "Vice Presidente", 9000));
		lista.add(new Empregado("Joao", "Coordenador", 7000));
		lista.add(new Empregado("Iza","Patroa", 28962));
		lista.add(new Empregado("Pedro", "Piao", 2000));
		
		
		for ( int pos = 0; pos < lista.size() ; pos++) {
			lista.get(pos).imprimir();
		}
		
		System.out.println(" ------ AUMENTANDO O ORDENADO POR CONTA DO DISSIDIO -------- ");
	
		for ( Empregado e : lista) { //  equivale ao comando: for (int pos=0; pos<lista.size(); pos++){
			                         //                           Empregado e = lista.get(pos);
			e.aumentarSalario(10.0);
			e.imprimir();
		}
	
	}

}
