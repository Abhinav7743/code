import java.util.Scanner;
public class question {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      
    //    int n = in.nextInt();
    //    boolean ans =isprime(n);
      //  System.out.println(ans);
      for (int i =100; i <100000; i++) {
        if (isArmstrong(i)) {
            System.out.println(i + " ");
        }
      }
    }

    // print all three digits armstrong 
      static boolean isArmstrong(int n) {
        int orig =n;
        int sum=0;

        while(n>0) {
         int rem =n % 10;
         n = n/ 10;
          sum = sum + rem*rem*rem;
        }
        if(sum == orig){
            return true;
        }
        return false;
      }
     static boolean isprime(int n) {
        if (n <= 1){
            return false;
        }
        int c =2;
        while (c*c <=n){
            if (n%c ==0){
                return false;
            }
            c++;
        }
        if (c*c> n){
            return true;
        }
        return false;
    }
}
