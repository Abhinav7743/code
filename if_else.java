package Arrays;
import java.util.*;
public class if_else {
    public static void main(String[] args) {
       int age;
       System.out.println(" Enter Your age");
       Scanner in = new Scanner(System.in);
       age = in.nextInt();

       switch (age) {
        case 18:
        System.out.println("You are going to become an adult!");
        break;
         case 23:
         System.out.println("You are going to retire!");
         break;
         default:
         System.err.println("Enjoy your life!");
       }
       System.out.println("Thanks for using java code!");


        /* 
       if (age>56) {
    System.out.println("You are experienced!");
       } 
       else if(age>46) {
        System.out.println("You are semi-experienced!");
       }
       else if(age>36) {
        System.out.println("YOu aer semi-semi-experienced!");
       }
       else {
        System.out.println("You are not experienced!");
       }
       if(age>2) {
        System.out.println("You are not a baby!");
       }
       */
    }
}
