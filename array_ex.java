package Arrays;
import java.util.*;
public class array_ex {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);   
        // Syntax
        ArrayList<Integer> List = new ArrayList<>(10);

//        List.add(67);
//        List.add(67);
    //    List.add(674);
   //      List.add(676654);
 //        List.add(6744554);
///         List.add(6743334);
   //       List.add(6333327);
  //        List.add(63337);

     //   System.out.println(List.contains(7659434));

  //   System.out.println(List);
   //    List.set(0, 99);

    //   List.remove(4);

    //    System.out.println(List);

 // input
      for (int i = 0; i < 5; i++) {
        List.add(in.nextInt());
       }

       for (int i = 0; i < 5; i++) {
       System.out.println(List.get(i));
    }
    System.out.println(List);
}

    
   
    }
