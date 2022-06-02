package pessoas;

public class Teste {

	public static void main(String[] args) {
		double[] x1 = {1.0, -2.5, 2.5};
		double[] x2 = {7.0, 0.4, -0.4};
		double[] y1 = {5.0, 12.1, -12.2};
		double[] y2 = {9.0, 7.3, 7.0};
		
		for(int i = 0; i < x1.length; i++) {
			  double distanciaA = Math.pow(x1[i] - y1[i], 2);
			  double distanciaB = Math.pow(x2[i] - y2[i], 2);
			  double resultado = Math.sqrt(distanciaA + distanciaB);
			System.out.printf("\n%.4f",resultado);
		}
	}
}
