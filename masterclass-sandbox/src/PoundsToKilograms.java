import java.util.Scanner;

public class PoundsToKilograms {
  public static void main(String[] args) {
    System.out.println("Weight in kilograms: ");
    Scanner s = new Scanner(System.in);
    double kgWeight = Double.parseDouble(s.nextLine());

    System.out.println("Weight in pounds: " + String.format("%.3f",(kgWeight / 0.45359237)).replace(",","."));
  }
}
