
import java.util.Scanner;

class Opration {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Main String for Opration's : ");
        String s = in.nextLine();
        // System.out.println("Your Enter String : " + s);
        // System.out.println("Length of the String is : "+ s.length());
        // String s1 = s.trim();
        // System.out.println("After trim Function : " + s1 + ", Length is : " + s1.length());
        // System.out.println("Enter Replace Word in String 1st(original) & 2nd(Replace) : ");
        // String original = in.next();
        // String replace = in.next();
        // System.out.println("After the Replace the String form : "+ s +" To "+ s.replace(original, replace));
        // System.out.println("Enter Char for Find : ");
        // String index = in.next();
        // System.out.println("Char at index : " + s.indexOf(index));
        boolean c =true;
        while(c)
        {
            System.out.println("");
            System.out.println("------- Enter Apropriate Choice As per Your Requrement -------");
            System.out.println("1) Trim Your String.");
            System.out.println("2) Length of your String.");
            System.out.println("3) Replace your String.");
            System.out.println("4) Find Index of the First Char in String.");
            System.out.println("5) Compare two String.");
            System.out.println("6) String Contain Other String.");
            System.out.println("7) String is Empty our not.");
            System.out.println("8) Replace All word in String.");
            System.out.println("9) Convert into Lower Case String.");
            System.out.println("10) Convert into Upper Case String.");
            System.out.println("11) Inappropriate Words in String.");
            System.out.println("12) Exit.");
            System.out.println("--------------------------------------------------------------");
            System.out.print("Enter Your Choice Number : ");
            int choice = in.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Your Trim String is : "+ s.trim() + ", Length of That String is : "+ s.trim().length());
                    break;
                case 2:
                    System.out.println("Length of that string is : "+ s.length());
                    break;
                case 3 :
                    System.out.print("Enter Original World : ");
                    String s1 = in.next();
                    System.out.print("Enter Replace String : ");
                    String s2 = in.next();
                    System.out.println("Your Updated String is : "+ s.replace(s1, s2));
                    break;
                case 4:
                    System.out.print("Enter String for Find First index of that Element : ");
                    String s3 = in.next();
                    System.out.println("String at Index : "+ s.indexOf(s3));
                    break;
                case 5:
                    System.out.print("Enter Second String for compare : ");
                    String s4 = in.next();
                    System.out.println("Compare of that Two string is : " + s.compareTo(s4));
                    break;
                case 6:
                    System.out.println("Enter Contain World For check : ");
                    String s5 = in.next();
                    System.out.println("Main String " + s + "Contains status is : " +s.contains(s5));
                    break;
                
                case 11:
                    System.out.print("Enter Inappropriate Word that you Cound't show in your string : ");
                    String Inappropriate = in.next();
                    System.out.println("Changed String is : "+ s.replace(Inappropriate, "***"));
                    break;
                case 12:
                    c=false;
                    break;
                default:
                    System.out.println("Enter 1 to 11 choice number.");
            }
        }
    }
}