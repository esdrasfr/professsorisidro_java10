package userinterface;

import java.util.ArrayList;

import model.Chefe;
import model.Comissionado;
import model.Empreiteiro;
import model.Funcionario;
import model.Horista;

public class FolhaDePagamento {
	public static void main(String[] args) {
		ArrayList<Funcionario> lista;
		
		lista = new ArrayList<Funcionario>();
		
		lista.add(new Chefe("Joao Chefe", 1234, 8500.0, 10.0, 450.0));
		lista.add(new Comissionado("Ana Comissionada", 1235, 4500.0, 27.32));
		lista.add(new Horista("Pedro Horista", 1236, 78, 65.50));
		lista.add(new Empreiteiro("Priscila Projetista", 1237, 5643.32));
		lista.add(new Horista("Joana Horista", 1238, 88, 72.32));
		//System.out.println(" REG  Nome                           Salario ");
		for (Funcionario f: lista) {
			//
			//System.out.printf("%5d %-30s R$ %8.2f\n", f.getNumRegistro(), f.getNome(), f.calcularSalario());
		    System.out.println(f.exibirRecibo());
		    System.out.println(".................................................................");
		}
	}

}
