import java.util.Scanner;
class Main {
  
  public static String upCaseTwo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 
  public static void main(String[] args) 
  {
     Scanner kbReader = new Scanner(System.in);
    
    boolean notExit = true;
    while (notExit = true) 
    {
        String message = "";
      
      System.out.println("Enter message: ");
      message = kbReader.nextLine();
      String noLower = "";
  
      for (int i = 0; i < message.length(); i++) {
        char j = message.charAt(i);
        if (Character.isUpperCase(j)) {
          noLower += j;
        }
        
      }
      //System.out.println(noLower); works fine!
      String translation = "";
      for (int i = 0; i < noLower.length(); i++) {
        char k = noLower.charAt(i);
        int m = upCaseTwo.indexOf(k);
        //System.out.println(m);
        if (m == 0) {m = 25;} else {m = m-1;}
        char o = upCaseTwo.charAt(m);
        translation += o;
      }
      System.out.println(translation);
  
    }
    
    
  
  }
  
}