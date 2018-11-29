package Vue;

import javax.swing.JFrame;
import Vue.Panneau;
import Controleur.Engine;

public class Fenetre extends JFrame{
	
	private Panneau pane;
	private Engine engine;
	
	public Fenetre(Panneau pane,Engine engine) {
		super();
		this.engine=engine;
		this.pane=pane;
		this.setTitle("Abalone");
		this.setSize(1000,1000);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(pane);
		this.setVisible(true);
	}
}
