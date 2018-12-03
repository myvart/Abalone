package Controleur;

import java.util.ArrayList;

import Modele.Bille;
import Modele.Plateau;

public class Engine {
	
	private Plateau plate;
	private ArrayList<Bille> selection;
	private int[] score;
	
	public Engine() {
		this.plate=new Plateau();
		score= new int[] {0,0};
		selection=new ArrayList<Bille>();
	}
	
	public Engine(ArrayList<Bille> billesB, ArrayList<Bille> billesN) {
		this.plate=new Plateau(billesB, billesN);
		score= new int[] {0,0};
		selection=new ArrayList<Bille>();
	}
	public ArrayList<Bille> getVoisins(Bille b){
		int i = b.location[0]
		int j = b.location[1]
		ArrayList<Bille> voisins = []
		//remplissage de la liste
		return (voisins)
		

	public Plateau getPlate() {
		return plate;
	}

	public void setPlate(Plateau plate) {
		this.plate = plate;
	}

	public int[] getScore() {
		return score;
	}
	
	public boolean validitySelection(Bille b) {
		
	}
	
	public void select(Bille b) {
		
	}
	
	public void deselect(Bille b) {
		
	}
	
	public boolean validityMove() {
		
	}
	
	public boolean billeIsOut(Bille b) {
		
	}
	
	public void move() {
		
	}
	
	public void actualisePlateau() {
		
	}
	
	public void actualiseScore() {
		
	}
	
	public boolean isFinish() {
		
	}
	
	
}
