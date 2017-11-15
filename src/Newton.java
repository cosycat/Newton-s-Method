public class Newton {
	
	/**
	 * @param x0 Starting x. Has to be defined according to:
	 *           1. f(a) < 0 < f(x0) and
	 *           2. f''(x) > 0 forall x element of [a, x0]
	 * @param fOriginal The original function f(x).
	 * @param fDerivative The derivative of fOriginal f'(x).
	 * @return The x most close to f(x)=0.
	 */
	public static double run(double x0, Function fOriginal, Function fDerivative) {
		for (int i = 0; i < 10000; i++) {
			double x1 = x0 - (fOriginal.run(x0) / fDerivative.run(x0));
			System.out.println("x" + i + "=" + x1);
			if (x1 == x0) {
				System.out.println("\nMost exact x found after " + i + " steps!");
				System.out.println("Result: " + x0);
				break;
			}
			x0 = x1;
		}
		return x0;
	}
	
}
