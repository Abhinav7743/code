import java.util.Arrays;
public class var_args {
    public static void main(String[] args) {
  //   fun();
   //  multiple (2,3, "Abhinav","Rausan","Vikram");
     demo("Abhinav","Rausan");   
    }

     static void demo(int...v) {
System.out.println(Arrays.toString(v));
     }
    static void demo(String ...v)   {
        System.out.println(Arrays.toString(v));
    }
}
