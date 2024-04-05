import java.util.Scanner;

public class nested_switch {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int empID = in.nextInt();
    String department = in.next();

    switch (empID) {
     case 1:
     System.out.println("Abhinav Singh");
     break;
 case 2:
     System.out.println("Ayush");
     break;
 case 3:
     System.out.println("Emp Number 3");
      switch (department) {
        case "IT":
        System.out.println("IT Departnment");
      break;
    case "Management":
        System.out.println("Management Departnment");
        break;
 default:
      System.out.println("No Departnment");
      }
      break;
 default:
    System.out.println("Enter correct EmpID");

    }
       
  }  
}
