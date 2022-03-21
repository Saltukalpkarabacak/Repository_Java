
public class Rosenbrock {

	public double evaluate(double[]solution) {
		
		int numberOfVariables = solution.length;
		
		double[] x = new double [numberOfVariables];
		
		for (int i = 0; i < numberOfVariables; i++) {
			x[i] = solution[i];
		}
		
		double sum = 0.0;
		
		for (int i = 0; i < numberOfVariables-1; i++) {
			
			double t1 = (x[i]*x[i]*x[i])- x[i+1];
			
			double t2 = x[i]-1.0;
			 
			sum += (100.0 * t1 * t1) + (t2 * t2 );
		}
		
		return sum;
	}
	
	public static double [] movement(double[]arr) {
		
		double[] ret = new double[5];
		
		for (int j = 0; j < arr.length; j++) {
			
			ret[j] = arr[j];
			
		}
		
		int ind = (int)(Math.random() * arr.length);
		
		double val = (Math.random() * 6 ) -3 ;
		
		ret[ind] = ret[ind] + val ;
		
		return ret;
	}
	public static void main(String[] args) {
		
		Rosenbrock f =  new Rosenbrock();
		
		int dim = 5;
		
		double[] current = new double[5];
		
		for (int i = 0; i <100; i++) {
			
			double[] sNew = movement(current);
			
			if (f.evaluate(sNew) < f.evaluate(current)) {
				current = sNew;
			}
			
			System.out.println(f.evaluate(current));
		}
		

	}

}
