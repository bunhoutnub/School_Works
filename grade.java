import java.util.Scanner;
/**
 * Computer Science II
 * @author Bunhout Nub.
 * @version 0.1 (Feb 2, 2024)
 */

public class grade {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please enter your overall grade: ");
    double grade = scanner.nextDouble();
    if (grade >= 90){
      System.out.print("A");
    } else if(grade < 90 && grade >= 80 ){
      System.out.print("B");
    } else if (grade < 80 && grade >=70){
      System.out.print("C");
    } else if (grade < 70 && grade >= 60){
      System.out.print("D");
    } else{
      System.out.print("F");
    }

    scanner.close();
  }
}
