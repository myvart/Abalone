package Modele;

public class Bille {
	private int color;
	private int[] location;
	static int comptB=0;
	static int comptN=0;
	private int index;
	private boolean selected;
	
	public Bille(int color, int[] location) {
		this.color=color;
		this.location=location;
		this.selected=false;
		if(color==1) {
			comptB+=1;
			index=comptB;
		}
		else if(color==2) {
			comptN+=1;
			index=comptN;
		}
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int[] getLocation() {
		return location;
	}

	public void setLocation(int[] location) {
		this.location = location;
	}

	public int getIndex() {
		return index;
	}

	public boolean isSelected() {
		return selected;
	}

	protected void setSelected(boolean selected) {
		this.selected = selected;
	}

}

