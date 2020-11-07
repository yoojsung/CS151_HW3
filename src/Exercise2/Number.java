package Exercise2;

public class Number {
	int redN;
	int blueN;
	int greenN;
	
	GraphView gView;
	
	public Number(int n1, int n2, int n3) {
		this.redN = n1;
		this.blueN = n2;
		this.greenN = n3;
	}
	
	public void attach(GraphView gView) {
		this.gView = gView;
	}
	
	public void updateValues(int n1, int n2, int n3) {
		this.redN = n1;
		this.blueN = n2;
		this.greenN = n3;
		gView.updateGraph(redN, blueN, greenN);
	}
}
