package userinterface;

import java.util.ArrayList;

import model.Cliente;
import model.ClienteFiel;

public class SistemaLoja {
	public static void main(String[] args) {
		
		ArrayList<Cliente> listaClientes;
		listaClientes = new ArrayList<Cliente>();
		
		listaClientes.add(new Cliente("Prof. Isidro ","isidro@isidro.com", 1000.0));
		listaClientes.add(new Cliente("Jose da Silva","jose@jose.com    ", 2000.0));
		listaClientes.add(new ClienteFiel("Jose Fiel", "jose@fiel", 2000.0, 5));
		
		for (Cliente c: listaClientes) {
			if (c.comprar(1500.0)) {
				System.out.println("Compra efetuada para o cliente "+c.getNomeCliente());
			}
			else {
				System.out.println("Linha de crédito insuficiente para "+c.getNomeCliente());
			}
		}
		
		for (Cliente c: listaClientes) {
			System.out.println(c.exibirFatura());
		}
	}

}
