package Exercise2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JFrame;

public class GraphView extends JFrame {
	int n1;
	int n2;
	int n3;
	
	public GraphView(int n1, int n2, int n3) {
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		setTitle("Graphs");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setSize(400, 400);
		setResizable(false);
		setVisible(true);
	}
	
	public void updateGraph(int n1, int n2, int n3) {
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		repaint();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		
		int y1 = getHeight() - n1 - 10;
		
		g2.setColor(Color.RED);
		Rectangle r1 = new Rectangle(50, y1,60, n1);
		g2.draw(r1);
		g2.fill(r1);
		
		int y2 = getHeight() - n2 - 10;
		
		g2.setColor(Color.BLUE);
		Rectangle r2 = new Rectangle(160, y2, 60, n2);
		g2.draw(r2);
		g2.fill(r2);
		
		int y3 = getHeight() - n3 - 10;
		
		g2.setColor(Color.GREEN);
		Rectangle r3 = new Rectangle(270, y3, 60, n3);
		g2.draw(r3);
		g2.fill(r3);
		
		
	}
}
