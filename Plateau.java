package Modele;

import java.util.ArrayList;

public class Plateau {
	
	private ArrayList<Bille> billesB;
	private ArrayList<Bille> billesN;
	
	public Plateau() {
		billesB=new ArrayList<Bille>();
		billesB=new ArrayList<Bille>();
	}
	
	public Plateau(ArrayList<Bille> billesB, ArrayList<Bille> billesN) {
		this.billesB=billesB;
		this.billesN=billesN;
	}

	public ArrayList<Bille> getBillesB() {
		return billesB;
	}

	public void setBillesB(ArrayList<Bille> billesB) {
		this.billesB = billesB;
	}

	public ArrayList<Bille> getBillesN() {
		return billesN;
	}

	public void setBillesN(ArrayList<Bille> billesN) {
		this.billesN = billesN;
	}
	
	public boolean selectionable(Bille b) {
	}
	
	public void selectBille(Bille b) {
		if(selectionable(b)) {
			b.setSelected(true);
		}
	}
}
	
