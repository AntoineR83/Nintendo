package test;

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
		

	}

}
