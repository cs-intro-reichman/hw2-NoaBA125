public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int add = Integer.parseInt(args[1]);
        int totalminutes = ((hours*60) + minutes + add) ;
        int totalhours = (totalminutes/60) ;
        int newhours = (totalhours%24);
        int newminutes = (totalminutes-(totalhours*60));

        if (newhours<10) {
            System.out.print("0");
        }
        System.out.print(newhours + ":");
    
        if (newminutes<10) {
            System.out.print("0");
        }
        System.out.print(newminutes);
        

    }
}
