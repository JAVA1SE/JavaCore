import java.util.Scanner;

class JavaPackage {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.print("Enter username: ");

    String userName = myObj.nextLine(); 
    System.out.println("Username is: " + userName); 
  }
}