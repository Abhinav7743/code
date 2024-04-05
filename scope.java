
public class scope {
    public static void main(String[] args) {
        int a = 39;
        int b = 49;
        
        {
            a = 100; // ressign the origin ref variable to some other value
            System.out.println(a);
             
             int c = 99;
        }
        System.out.println(a);

    }
    static void random(int marks) {
int num = 67;
System.out.println(num);
System.out.println(marks);
    }
    
}
