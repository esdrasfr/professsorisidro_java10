package userinterface;
import core.Estudante;
import core.Pessoa;

public class TestePessoa {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Isidro");
		p1.setEmail("isidro@isidro.com");
		p1.setTelefone("98765-4321");
		
		Estudante e1 = new Estudante();
		
		e1.setCurso("Computação");
		e1.setNumeroMatricula(1234);
		e1.setNome("Jose");
		e1.setEmail("jose@jose.com");
		e1.setTelefone("91234-5678");
		
		p1.exibirInfo();
		e1.exibirInfo();
	}

}
