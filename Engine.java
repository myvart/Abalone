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
	
	public ArrayList<Bille> getVoisins(Bille bille) {
		int color = bille.getColor();
		int i =bille.getLocation()[0];
		int j =bille.getLocation()[1];
		ArrayList<Bille> billes_meme_couleur = new ArrayList<Bille>();
		ArrayList<Bille> voisins = new ArrayList<Bille>();
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
		for (ArrayList<int> location : voisins_possibles) {
			for (Bille b : bille_meme_couleur) {
				if ( location == getLocation(b)) {
					voisins.add(b);
				}
			}
		}
		return voisins;
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
		for (Bille b : voisins_direct){
			if(estAligne(b, bille1, bille2)==true){
				alignes.add(b)
		return alignes;
		
	}
	public boolean estSelectionnable(ArrayList<Bille> billes_selectionnes, Bille b)
		if (billes_selectionnes.size()==0){
			return true
		}
		else if (billes_selectionnes.size()==1){
			ArrayList<Bille> voisins = getVoisins(bille_selectionnes[0]);
			for (Bille bille : voisins){
				if (b==bille){
					return true;
				}
			return false;
			}
		else if (billes_selectionnes.size()==2){
			ArrayList<Bille> voisins = getAlignes(bille_selectionnes[0]);
			for (Bille bille : voisins){
				if (b==bille){
					return true;
				}
			return false;
			}
		else {			//cas d'une tentative de selection d'une 4e bille
			return false;
		}
	}
			
	public boolean surLePlateau(int[] location) {	//coordonnées (i,j)
		int i = location[0];
		int j = location[1];
		if (j<0) {
			return false;
		}
		else if (j>8) {
			return false;
		}
		eles if (i<0) {
			return false;
		}
		else if (i<=4 && i>j+4) {
			return false;
		}
		else if (i<4 && i>12-j) {
			return false;
		}
		return true;
	}
			
		public int[] conversion1 (int[] location) {		//des coordonnées matriciels (i,j) vers les coordonnées d'affichage (x,y)
		int i = location[0];
		int j = location[1];
		int x = new int;
		int y = new int;
		int a = 100;
		int b = 100;
		int c = 20;
		if(i<=4) {
			x=(4-i)*b/2+j*b;
			y=i*(a-c)+c;
		}
		else if (i>4) {
			x=(i-4)*b/2+j*b;
			y=i*(a-c)+c;
		}
		return (new int[] {x,y});
	}
	
	public int[] conversion2 (int[] location) {		//des coordonnées d'affichage(x,y) vers les coordonnées matriciels (i,j)
		int x = location[0];
		int y = location[1];
		int i = new int;
		int j = new int;
		int a = 100;
		int b = 100;
		int c = 20;
		i=(y-c)/(a-c);
		if (i<=4) {
			j=x/b-2+i/2;
		}
		else if (i>4) {
			j=x/b-i/2+2;
		}
		return (new int[] {i,j});
	}
			
	public boolean estAligne (Bille bille1,Bille bille2,Bille bille3) {
		int[] loc1 = getLocation(bille1);
		int[] loc2 = getLocation(bille2);
		int[] loc3 = getLocation(bille3);
		int[] coord1 = conversion1(loc1);
		int[] coord2 = conversion1(loc2);
		int[] coord3 = conversion1(loc3);
		int x1 = coord1[0];
		int y1 = coord1[1];
		int x2 = coord2[0];
		int y2 = coord2[1];
		int x3 = coord3[0];
		int y3 = coord3[1];
		if ((x2-x1)*(y3-y1)-(x3-x1)*(y2-y1)==0) {
			return true;
		}
		return false;
	}
			
	public int typeMouv (Bille bille1, Bille bille2, int[] locCaseArivee) {		//distinction mouvement poussee et en fleche
		int[] loc1 = getLocation(bille1);
		int[] loc2 = getLocation(bille2);
		if (estAligne(loc1, loc2, locCaseArrivee) == true) {
			return (int 1);
					//mouvement de poussée -> 1
		}
		else {
			return (int 2);
					//mouvement en fleche -> 2
		}
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
