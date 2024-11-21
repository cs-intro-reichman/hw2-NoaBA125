// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String s = args[0];
            int l = s.length();
            String n = "AaEeFfHhIiLlMmNnOoRrSsXx";
            
            int cheer = Integer.parseInt(args[1]);

            for (int i = 0; i < l; i++) {
                char m = s.charAt(i);
                if (n.indexOf(m) != -1) {
                char M = Character.toUpperCase (m);
                
                        System.out.println("Give me an " + M + ": " + M + "!");
                } else {
                        char M = Character.toUpperCase (m);
                        System.out.println("Give me a  " + M + ": " + M + "!");
                }
 
            }
            System.out.println("What does that spell?");

            for (int c = 0; c < cheer; c++) {
                String S = s.toUpperCase();
                System.out.println(S + "!!!");
            }
        }
}
