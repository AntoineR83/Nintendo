package model;

import java.time.LocalDate;

public class Achat {
	
	private Jeu jeu;
	private LocalDate date;
	private double prix;
	
	public Achat(Jeu jeu, LocalDate date, double prix) {
		this.jeu = jeu;
		this.date = date;
		this.prix = prix;
	}

	public Jeu getJeu() {
		return jeu;
	}

	public LocalDate getDate() {
		return date;
	}

	public double getPrix() {
		return prix;
	}

	public void setJeu(Jeu jeu) {
		this.jeu = jeu;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Achat [jeu=" + jeu + ", date=" + date + ", prix=" + prix + "€]";
	}
	
	

}
