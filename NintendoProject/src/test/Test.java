package test;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.*;

public class Test {

	public static void main(String[] args) {
		Console c1 = new Salon("Megadrive");
		Console c2 = new Salon("NES");
		
		Adresse a1 = new Adresse( "8", "7th avenue", "New york");
		Adresse a2 = new Adresse("1", "rue Eiffel", "Paris");
		
		Boutique b1 = new Boutique ("Shop", a1);
		
		Jeu j1 = new Jeu("Sonic", c1,b1);
		Jeu j2 = new Jeu("Aladdin", c1,b1);
		Jeu j3 = new Jeu("Streets of Rage", c1,b1);
		Jeu j4 = new Jeu("Street Fighter", c1,b1);
		Jeu j5 = new Jeu("Super Marios Bros", c2,b1);
		

		Achat achat1 = new Achat(j1,LocalDate.now(),30);
		Achat achat2 = new Achat(j5,LocalDate.now(),15.99);
		
		List<Achat> achats =new ArrayList<Achat>();
		Collections.addAll(achats, achat1, achat2);
		
		Client c = new Client("Officier","Abid");
		c.setAchats(achats);
		
		System.out.println(c);
		System.out.println(b1);

		
		
		Client client1 = new Client ("john","Doe");
		Client client2 = new Client ("Jean", "Durant");


	}

}
