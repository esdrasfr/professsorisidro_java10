package userinterface;

import model.Carro;
import model.Motoca;
import model.Veiculo;

public class Estacionamento {
	public static void main(String[] args) {
		Veiculo v1, v2;
		
		v1 = new Carro("Vokisvage", "ABC1234", "Fuka");
		v2 = new Motoca("Iamarra","XYZ9876","Super Spidi");
		
		
		v1.acelerar();
		v2.acelerar();
		
		v1.frear();
		v2.frear();
	}
}
