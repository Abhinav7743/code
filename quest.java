package Arrays;

public class quest {
    public static void main(String[] args) {
     
       // problem 1

       String name = "Abhinav";
      // name = name.toLowerCase();
       name = name.toUpperCase();
       System.out.println(name);

      // problem 2

      String text  = "To Lower Case";
      text = text.replace("", "_");
       System.out.println(text);

       // problem 3

       String letter = "Dear |<name|>, Thanks a lot!";
       letter=letter.replace("|<name|>", "Abhinav");
       System.out.println(letter);

       // problem 4

       String myString = "This string contain    double and triple spce";
       System.out.println(myString.indexOf("  ") );
       System.out.println(myString.indexOf("  "));

       // Problem 5
       String myLetter = "Dear Abhinav, \n\tThis java course is nice. \n\tThanks";
       System.out.println(myLetter);
    }
}
