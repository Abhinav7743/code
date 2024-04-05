package Arrays;
import java.util.*;

public class array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 238;
        arr[2] = 549;
        arr[3] = 26;
        arr[4] = 254;
         System.out.println(arr[3]);
        

         // input using for loops.
 //      for (int i = 0; i < arr.length; i++) {
 //           arr[i] = in.nextInt();
   //      }

    //a    System.out.println(Arrays.toString(arr));

  //       for (int i = 0; i < arr.length; i++) {
    //       System.out.println(arr[i] +"");
   // }
 
 ///       for (int num : arr) {
 //       System.out.println(num + "");
 //       }
    
  //   System.out.println(arr[]);


  // Array of objects
    String[] str = new String[4];
    for (int i = 0; i < str.length; i++) {
        str[i] = in.nextLine();

    } 
    System.out.println(Arrays.toString(str));

   // modify

      str[1] = "Abhinav Singh";
      System.out.println(Arrays.toString(str));
    }
}