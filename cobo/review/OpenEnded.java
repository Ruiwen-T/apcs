/* 
Team Avocado: Brianna Tieu, Raven (Ruiwen) Tang
APCS
Lab06 -- Read/Review/Expand - cobo review lab
2022-02-13
time spent: 2.0
*/
import java.util.Scanner;

public class OpenEnded {

  public static void welcome() {
    System.out.println("Welcome to the valid password checker!\n A password is determined to be valid as long as it contains the following:");
    System.out.println("\n  -at least one capital letter \n  -at least one lowercase letter \n  -at least one special character \n  -at least one number");
    System.out.println("\nEnter a password to determine whether it is valid or not!");
    System.out.println("\nUser's Password:");
  }

  public static String check(String password) {
    String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String lower = "abcdefghijklmnopqrstuvwxyz";
    String numbers = "0123456789";
    String symbols = "!@#$%^&*?~`()_-+={}[]|:'<>?/";
    int upperCount = 0;
    int lowerCount = 0;
    int numberCount = 0;
    int symbolCount = 0;
    password = password.trim();
    for (int i = 0; i < upper.length(); i++) {
        if (password.indexOf(upper.substring(i, i+1)) > -1) {
          upperCount++;
          if(upperCount > 0){
              break;
          }
        }
    }
    for (int i = 0; i < lower.length(); i++) {
        if (password.indexOf(lower.substring(i, i+1)) > -1) {
          lowerCount++;
          if(lowerCount > 0){
              break;
          }
        }
    }
    for (int i = 0; i < numbers.length(); i++) {
        if (password.indexOf(numbers.substring(i, i+1)) > -1) {
          numberCount++;
          if(numberCount > 0){
              break;
          }
        }
    }
    for (int i = 0; i < symbols.length(); i++) {
        if (password.indexOf(symbols.substring(i, i+1)) > -1) {
          symbolCount++;
          if(symbolCount > 0){
              break;
          }
        }
        if(password.indexOf('"') > -1){
            symbolCount++;
        }
    }
    String s = "Your password is invalid!";
    if (upperCount > 0 && lowerCount > 0 && numberCount > 0 && symbolCount > 0) {
      return "Your password is valid!";
    } 
    else {
      if(upperCount == 0){
          s += "\n It is missing an uppercase letter.";
      }
      if(lowerCount == 0){
        s += "\n It is missing a lowercase letter.";
      }
      if(numberCount == 0){
        s += "\n It is missing a number.";
      }
      if(symbolCount == 0){
        s += "\n It is missing a special character.";
     }
      return s;
    }
  }

public static void main(String[] args) {
  welcome();
  Scanner s = new Scanner(System.in);
  String pass = s.next();
  System.out.println(check(pass));
}

}//end OpenEnded