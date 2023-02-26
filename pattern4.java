import java.util.Scanner;

public class pattern4 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of rows in the triangle: ");
      int numRows = sc.nextInt();
      for (int i = 1; i <= numRows; i++) {
         for (int j = 1; j <= numRows - i; j++) {
            System.out.print(" ");
         }
         for (int k = 1; k <= i * 2 - 1; k++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }
}

