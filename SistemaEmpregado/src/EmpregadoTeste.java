
public class EmpregadoTeste {
	public static void main(String[] args) {
		// declaro
		Empregado e1, e2, e3, e4;
		
		// instancio o objeto
		e1 = new Empregado("Isidro","Professor",5000.0);
		e2 = new Empregado("Adalberto", "Presidente", 8000.0);
		e3 = new Empregado("Fulano", "Cargo da base salarial");
		e4 = new Empregado("Empregado sem cargo", 2000.0);
		
		// preencho
//		e1.setNome("Isidro");
//		e1.setCargo("Professor");
//		e1.setSalario(5000.0);
//		
//		e2.setNome("Adalberto");
//		e2.setCargo("Presidente");
//		e2.setSalario(8000.0);
		
		e1.imprimir();
		e2.imprimir();
		e3.imprimir();
		e4.imprimir();
		
		e1.aumentarSalario(15.72);
		e2.aumentarSalario(8.97);
		
		e1.imprimir();
		e2.imprimir();
		
		
	
	}

}
