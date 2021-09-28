import java.util.Scanner;

public class ConvertTime{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    System.out.print("Type the number of seconds you would like to convert: ");
    int seconds = in.nextInt();
    int hours = seconds/3600;
    int minutes = (seconds%3600)/60;
    int newSeconds = seconds%60;
    System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds \n", seconds, hours, minutes, newSeconds);
  }
}
