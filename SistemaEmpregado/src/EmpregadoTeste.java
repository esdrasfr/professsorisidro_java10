
public class EmpregadoTeste {
	public static void main(String[] args) {
		Empregado e1, e2;
		
		e1 = new Empregado();
		e2 = new Empregado();
		
		e1.setNome("Isidro");
		e1.setCargo("Professor");
		e1.setSalario(5000.0);
		
		e2.setNome("Adalberto");
		e2.setCargo("Presidente");
		e2.setSalario(8000.0);
		
		e1.imprimir();
		e2.imprimir();
		
		e1.aumentarSalario(15.72);
		e2.aumentarSalario(8.97);
		
		e1.imprimir();
		e2.imprimir();
	}

}
