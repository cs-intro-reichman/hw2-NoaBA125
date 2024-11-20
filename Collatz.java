// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seed = Integer.parseInt(args[0]);
		String vorc = args[1];
		String c = "c";
		char letter = vorc.charAt(0);

		if (c.indexOf(letter) != -1){
			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
		} else {
			
			for (int i = 1; i <= seed; i++) {
			System.out.print(i + " ");
			int n = i;
			int steps = 1;
			int target = 2;
			while (target > 1){
				
				if (n%2 == 0){
				n = n/2;
				target = n;
				System.out.print(n + " ");
			} else {
				n = n*3 + 1;
				target = n;
				System.out.print(n + " ");
			}
			steps ++;
			
			} System.out.println("(" + steps + ")");
			
		}
		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
	}
			
		

	}
}
