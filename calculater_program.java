import java.util.Scanner;

public class calculater_program {
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
       int a = in.nextInt(); 
       int b = in.nextInt(); 
       int c = in.nextInt();
       
       int max = 0;
       max = Math.max(c, Math.max(a,b));
       
       System.out.println(max);
         }
}
       

