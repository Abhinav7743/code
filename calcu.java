import java.util.Scanner;

public class calcu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ans = 0;
        while (true) {
        System.out.print("Enter the operater : ");

            char op = in.next().trim().charAt(0);
        
            if (op =='+' || op =='-' || op =='*' || op =='/' || op =='%') {
                
                System.out.print("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt(); 
               System.out.println();
                if (op =='+') {
                    ans = num1 + num2;
                }
                if (op =='-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
                else if (op =='x'|| op =='x'){
                    break;

                }
                else {
                    System.out.println("invalid opertion !!");
                }
                System.out.println(ans);
            }


            
        }
       
        
    }


}
