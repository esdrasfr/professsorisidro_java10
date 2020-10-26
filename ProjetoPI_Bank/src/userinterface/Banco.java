package userinterface;

import model.Conta;
import model.ContaEspecial;

public class Banco {
	public static void main(String[] args) {
		Conta c1;
		ContaEspecial c2;
		c1 = new Conta("Professor Isidro","987.654.321-00",1234,0.0);
		c2 = new ContaEspecial("Jose da Silva", "123.456.789-00", 9876, 0.0, 500.0);
		
		
//		c1.setNomeTitular("Professor Isidro");
//		c1.setCpf("987.654.321-00");
//		c1.setNumeroConta(1234);
		c1.creditar(1000.0);
		
		System.out.println(c1.exibirInfo());
		if (c1.debitar(350.0)) {
			System.out.println("Debito de R$ 350.0 autorizado na conta "+c1.getNumeroConta());
		}
		else {
			System.out.println("Saldo insuficiente na conta "+ c1.getNumeroConta());
		}
		System.out.println(c1.exibirInfo());
		
		System.out.println("-----------------------------");
		
//		c2.setNomeTitular("Jose da Silva");
//		c2.setCpf("123.456.789-00");
//		c2.setNumeroConta(9876);
//		c2.setLimite(500);
		c2.creditar(300);
		
		System.out.println(c2.exibirInfo());
		if (c2.debitar(430.0)) {
			System.out.println("Debito de R$ 430.0 autorizado na conta "+c2.getNumeroConta());
		}
		else {
			System.out.println("Debito nao autorizado na conta "+c2.getNumeroConta());
		}
		System.out.println(c2.exibirInfo());
	}
	

}
