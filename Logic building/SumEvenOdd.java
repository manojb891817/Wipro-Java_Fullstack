import java.util.*;

public class SumEvenOdd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number : ");
    int num1 = sc.nextInt();

    System.out.print("Enter a number : ");
    int num2 = sc.nextInt();

    int sum = num1 + num2;

    if(sum % 2 == 0){
      System.out.println(sum + " Is Even");
    }
    else{
      System.out.println(sum + " Is Odd");
    }
    sc.close();
  }
}