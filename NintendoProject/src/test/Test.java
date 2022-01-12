package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.*;

public class Test {

	public static void main(String[] args) {
		Console c1 = new Console("Megadrive");
		Console c2 = new Console("NES");
		
		Jeu j1 = new Jeu("Sonic", c1);
		Jeu j2 = new Jeu("Aladdin", c1);
		Jeu j3 = new Jeu("Streets of Rage", c1);
		Jeu j4 = new Jeu("Street Fighter", c1);
		Jeu j5 = new Jeu("Super Marios Bros", c2);
		
		Achat a1 = new Achat(j1,LocalDate.now(),30);
		Achat a2 = new Achat(j5,LocalDate.now(),15.99);
		
		List<Achat> achats =new ArrayList<Achat>();
		Collections.addAll(achats, a1, a2);
		
		Client c = new Client("Officier","Abid");
		c.setAchats(achats);
		
		System.out.println(c);

	}

}
