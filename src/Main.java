
public class Main {
	
	public static void main(String[] args) {
		
		
		Function fOriginal = new Function() {
			@Override
			public double run(double x) {
				return 4 * Math.pow(x, 5) + x - 6;
			}
		};
		Function fDerivative = new Function() {
			@Override
			public double run(double x) {
				return 20 * Math.pow(x, 5) + x - 6;
			}
		};
		double x0 = 1.1;
		
		
		Newton.run(x0, fOriginal, fDerivative);
		
		
	}
	
	

}
