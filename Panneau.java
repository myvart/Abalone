package Vue;

import javax.swing.JPanel;
import java.math.*;
import java.awt.Color;
import java.awt.Graphics;
import Controleur.Engine;

public class Panneau extends JPanel {
	
	private int[][] M= new int[][] {new int[] {1,1,1,1,1}, new int[] {1,1,1,1,1,1}, new int[] {0,0,1,1,1,0,0}, new int[] {0,0,0,0,0,0,0,0}, new int[] {0,0,0,0,0,0,0,0,0}, new int[] {0,0,0,0,0,0,0,0}, new int[] {0,0,2,2,2,0,0}, new int[] {2,2,2,2,2,2}, new int[] {2,2,2,2,2}};
	private Engine engine;
	
	//public Panneau(Engine engine) {
//		this.engine=engine;
//	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.ORANGE);
		int h=this.getHeight();
		int e=20;
		int h_prim=h-2*e;
		double b=(4-Math.sqrt(7))*h_prim/6;
		double v=h_prim-2*b;
		double a=h_prim/(11-10*((4-Math.sqrt(7))/6));
		double c=(4-Math.sqrt(7))*a/6;
		double w=a-2*c;
		
//		int[] x1= {(int)b+e,(int)(b+v)+e,h_prim+e,(int)(b+v)+e,(int)b+e,e};
//		int[] y1= {e,e,(int)(h_prim/2)+e,h_prim+e,h_prim+e,(int)(h_prim/2)+e};
//		g.fillPolygon(x1,y1,6);
		
		g.setColor(Color.GRAY);
		int[] x2=new int[6];
		int[] y2=new int[6];
		int y_i;
		int x_i;
		int x_ij;
		for(int i=1;i<6;i++) {
			y_i=(int)(i*(a-c))+e;
			x_i=(int)(((h_prim/2)-i*a-c-e)/(h_prim/(2*b)));
			for(int j=1;j<5+i;j++) {
				x_ij=(int)(x_i+j*a);
				x2[0]=x_ij;
				x2[1]=x_ij;
				x2[2]=(int)(x_ij+(a/2));
				x2[3]=(int)(x_ij+a);
				x2[4]=(int)(x_ij+a);
				x2[5]=(int)(x_ij+(a/2));
				y2[0]=(int)(y_i+c);
				y2[1]=(int)(y_i+c+w);
				y2[2]=(int)(y_i+a);
				y2[3]=(int)(y_i+c+w);
				y2[4]=(int)(y_i+c);
				y2[5]=y_i;
				g.drawPolygon(x2,y2,6);
			}
		}
		for(int i=6;i<10;i++) {
			y_i=(int)(i*(a-c))+e;
			x_i=(int)((i*a+c+w-(h_prim/2))/(h_prim/(2*b)));
			for(int j=1;j<10-(i-5);j++) {
				x_ij=(int)(x_i+(j-1)*a);
				x2[0]=x_ij;
				x2[1]=x_ij;
				x2[2]=(int)(x_ij+(a/2));
				x2[3]=(int)(x_ij+a);
				x2[4]=(int)(x_ij+a);
				x2[5]=(int)(x_ij+(a/2));
				y2[0]=(int)(y_i+c);
				y2[1]=(int)(y_i+c+w);
				y2[2]=(int)(y_i+a);
				y2[3]=(int)(y_i+c+w);
				y2[4]=(int)(y_i+c);
				y2[5]=y_i;
				g.drawPolygon(x2,y2,6);
			}
		}
//		g.setColor(Color.black);
//		for(int i=1; i<3; i++) {
//			y_i=(int)(i*(a-c))+e;
//			x_i=(int)(((h_prim/2)-i*a-c-e)/(h_prim/(2*b)));
//			for(int j=1;j<5+i;j++) {
//				x_ij=(int)(x_i+j*a);
//				g.fillOval((int)(x_i+j*a)+e,(int)(y_i+c), (int)w, (int)w);
//			}
//		}
		paintBilles(g);
	}
	
	
	
//	private void paintBilles(Graphics g) {
//		int i;
//		int j;
//		
//		int x_i;
//		int y_i;
//		int x_ij;
//		int h=this.getHeight();
//		int e=20;
//		int h_prim=h-2*e;
//		double b=(4-Math.sqrt(7))*h_prim/6;
//		double v=h_prim-2*b;
//		double a=h_prim/(11-10*((4-Math.sqrt(7))/6));
//		double c=(4-Math.sqrt(7))*a/6;
//		double w=a-2*c;
//		
//		g.setColor(Color.white);
//
//		for(Modele.Bille bille: engine.getPlate().getBillesB()) {
//			i=bille.getLocation()[0];
//			j=bille.getLocation()[1];
//			if (i<5) {
//				y_i=(int)((i+1)*(a-c))+e;
//				x_i=(int)(((h_prim/2)-(i+1)*a-c-e)/(h_prim/(2*b)));
//				x_ij=(int)(x_i+(j+1)*a);
//				g.fillOval((int)(x_i+(j+1)*a)+e,(int)(y_i+c), (int)w, (int)w);
//			}
//			else {
//				y_i=(int)((i+1)*(a-c))+e;
//				x_i=(int)(((i+1)*a+c+w-(h_prim/2))/(h_prim/(2*b)));
//				x_ij=(int)(x_i+j*a);
//				g.fillOval((int)(x_ij+e),(int)(y_i+c), (int)w, (int)w);
//			}
//		}
//		
//		g.setColor(Color.black);
//
//		for(Modele.Bille bille: engine.getPlate().getBillesN()) {
//			i=bille.getLocation()[0];
//			j=bille.getLocation()[1];
//			if (i<5) {
//				y_i=(int)((i+1)*(a-c))+e;
//				x_i=(int)(((h_prim/2)-(i+1)*a-c-e)/(h_prim/(2*b)));
//				x_ij=(int)(x_i+(j+1)*a);
//				g.fillOval((int)(x_i+(j+1)*a)+e,(int)(y_i+c), (int)w, (int)w);
//			}
//			else {
//				y_i=(int)((i+1)*(a-c))+e;
//				x_i=(int)(((i+1)*a+c+w-(h_prim/2))/(h_prim/(2*b)));
//				x_ij=(int)(x_i+j*a);
//				g.fillOval((int)(x_ij+e),(int)(y_i+c), (int)w, (int)w);
//			}
//		}
//			
//	}
	
	
	private void paintBilles(Graphics g) {
		int h=this.getHeight();
		int e=20;
		int h_prim=h-2*e;
		double b=(4-Math.sqrt(7))*h_prim/6;
		double v=h_prim-2*b;
		double a=h_prim/(11-10*((4-Math.sqrt(7))/6));
		double c=(4-Math.sqrt(7))*a/6;
		double w=a-2*c;
		int y_i;
		int x_i;
		int x_ij;
		for(int i=0; i<5; i++) {
			y_i=(int)((i+1)*(a-c))+e;
			x_i=(int)(((h_prim/2)-(i+1)*a-c-e)/(h_prim/(2*b)));
			for(int j=0; j<this.M[i].length; j++) {
				if(this.M[i][j]==1) {
					g.setColor(Color.white);
					x_ij=(int)(x_i+(j+1)*a);
					g.fillOval((int)(x_i+(j+1)*a)+e,(int)(y_i+c), (int)w, (int)w);
				}
				if(this.M[i][j]==2) {
					g.setColor(Color.black);
					x_ij=(int)(x_i+(j+1)*a);
					g.fillOval((int)(x_i+(j+1)*a)+e,(int)(y_i+c), (int)w, (int)w);
				}
			}
		}
		for(int i=5; i<this.M.length; i++) {
			y_i=(int)((i+1)*(a-c))+e;
			x_i=(int)(((i+1)*a+c+w-(h_prim/2))/(h_prim/(2*b)));
			for(int j=0; j<this.M[i].length; j++) {
				if(this.M[i][j]==1) {
					g.setColor(Color.white);
					x_ij=(int)(x_i+j*a);
					g.fillOval((int)(x_ij+e),(int)(y_i+c), (int)w, (int)w);
				}
				if(this.M[i][j]==2) {
					g.setColor(Color.black);
					x_ij=(int)(x_i+j*a);
					g.fillOval((int)(x_ij+e),(int)(y_i+c), (int)w, (int)w);
				}
			}
		}
	}

}
