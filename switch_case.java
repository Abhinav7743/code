import java.util.Scanner;

public class switch_case {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.nextLine();

        switch (fruit) {
            case "Mango":
            System.out.println("King of fruit");
        break;
    
        case "Apple":
         System.out.println("A Sweet red fruit");
         break;
    
         case "Orange":
         System.out.println("Round fruit");
         break;
    
         case "grapes":
         System.out.println("Green fruit");
         break;

        default:
        System.out.println("please enter a valid fruit");
        
        
        }
    }

}