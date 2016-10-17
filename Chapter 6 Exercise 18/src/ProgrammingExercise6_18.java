import java.util.Scanner;
 
public class ProgrammingExercise6_18 {
 
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter a password: ");
  String s = input.nextLine();
 
  if (chkPswd(s)) {
   System.out.println("Valid Password");
  } else {
   System.out.println("Invalid Password");
  }
 
 }
 
 public static boolean chkPswd(String password) {
  boolean chkPswd = true;
 
  // ■ A password must have at least eight characters.
  if (password.length() < 8) {
   chkPswd = false;
  } else { // ■ A password consists of only letters and digits.
   int numberOfDigit = 0;
   for (int i = 0; i < password.length(); i++) {
    if (isDigit(password.charAt(i)) || isLetter(password.charAt(i))) {
     if (isDigit(password.charAt(i))) {
      numberOfDigit++;
     }
 
    } else { // if a char in the password is not a letter or a
       // digit, set chkPswd to false and break of for loop
     chkPswd = false;
     break;
    }
   }
 
   if (numberOfDigit < 2) { // ■ A password must contain at least two
          // digits.
    chkPswd = false;
   }
 
  }
 
  return chkPswd;
 
 }
 
 public static boolean isLetter(char ch) {
 
  return ((ch <= 'z' && ch >= 'a') || (ch <= 'Z' && ch >= 'A'));
 
 }
 
 public static boolean isDigit(char ch) {
  return (ch <= '9' && ch >= '0');
 }
 
}