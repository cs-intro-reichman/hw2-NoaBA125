// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String s = args[0];
            int l = s.length();
            String n = "AEFHILMNORSX";
            int cheer = Integer.parseInt(args[1]);

            for (int i = 0; i < l; i++) {
                char m = s.charAt(i);
                if (n.indexOf(m) != -1) {
                        System.out.println("Give me an " + m + ": " + m + "!");
                } else {
                        System.out.println("Give me a " + m + ": " + "!");
                }
 
            }
            System.out.println("What does that spell?");

            for (int c = 0; c < cheer; c++) {
                System.out.println(s + "!!!");
            }
        }
}
