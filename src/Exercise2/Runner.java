package Exercise2;

public class Runner {
	public static void main(String[] args) {
		int n1 = 50;
		int n2 = 100;
		int n3 = 70;
		GraphView gView= new GraphView(n1, n2, n3);
		Number model = new Number(n1, n2, n3);
		model.attach(gView);
		NumberView nView = new NumberView(n1, n2, n3, model);
		
	}
}
