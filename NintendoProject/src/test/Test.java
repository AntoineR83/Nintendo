package test;

import model.Adresse;
import model.Boutique;
import model.Client;
import model.Console;
import model.Jeu;

public class Test {

	public static void main(String[] args) {
		Console c1 = new Console("Megadrive");
		Console c2 = new Console("NES");
		
		Jeu j1 = new Jeu("Sonic", c1);
		Jeu j2 = new Jeu("Aladdin", c1);
		Jeu j3 = new Jeu("Streets of Rage", c1);
		Jeu j4 = new Jeu("Street Fighter", c1);
		Jeu j5 = new Jeu("Super Marios Bros", c2);
		
		Adresse a1 = new Adresse( "8", "7th avenue", "New york");
		//Adresse a2 = new Adresse("1", "rue Eiffel", "Paris");
		
		Boutique b1 = new Boutique ("Shop", a1);
		
		Client client1 = new Client ("john","Doe");
		Client client2 = new Client ("Jean", "Durant");

	}

}
