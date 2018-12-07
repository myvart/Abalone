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
	
	public ArrayList<Bille> getVoisin(bille) {
		int color = getColor(bille);
		int i =getLocation(bille)[0];
		int j =getLocation(bille)[1];
		ArrayList<Bille> billes_meme_couleur = new ArrayList<Bille>;
		ArrayList<Bille> voisins = new ArrayList<Bille>;
		if (color == 1) {
			billes_meme_couleur = getBillesB();
		}
		else {
			billes_meme_couleur = getBillesN();
		}
		if 
		ArrayList<ArrayList<int>> voisins_possibles = new ArrayList<ArrayList<int>>;
		voisins_possibles.add({i+1,j});
		voisins_possibles.add({i-1,j});
		voisins_possibles.add({i,j-1});
		voisins_possibles.add({i,j+1});
		if (i<5) {
			voisins_possibles.add({i-1,j-1});
			voisins_possibles.add({i+1,j+1});
		}
		else if (i==5) {
			voisins_possibles.add({i-1,j-1});
			voisins_possibles.add({i-1,j+1});
		}
		else {
			voisins_possibles.add({i+1,j-1});
			voisins_possibles.add({i-1,j+1});
		}
		//test est dans le plateau ?
		for (ArrayList<int> location : voisins_possibles) {
			for (Bille b : bille_meme_couleur) {
				if ( location == getLocation(b)) {
					voisins.add(b);
				}
			}
		}
		return voisins
	}
	
	public ArrayList<Bille> getAlignes(bille1, bille2) {
		ArrayList<Bille> voisins_directs = new ArrayList<Bille>;
		voisins_directs = getVoisins(bille1);
		voisins_directs.add(getVoisins(bille2));
		ArrayList<Bille> alignes = new ArrayList<Bille>;
		for (Bille b : voisins_directs) {
			if (b==bille1){
				voisins_directs.remove(b);
			}
			else if (b==bille2){
				voisins_directs.remove(b);
			}
		//for (Bille b : voisins_direct){
			//if(testAlignement(b, bille1, bille2)==true){
				//alignes.add(b)
		return alignes
		
	}	

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
