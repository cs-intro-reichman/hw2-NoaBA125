// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	int n = Integer.parseInt(args[0]);
	int m = 1;
	double s = 1;

	for (int i = 1; i < n ; i++) {
		m = m + 2;
		double m1 = (double) 1/m;
		if (i%2!=0) {
			s = (s - m1);
		} else {
			s = (s + m1);
		}
	}

		System.out.println(" pi acccording to Java: " + Math.PI);
		System.out.println("pi, approximated: " + (s*4));

	
	}
}
