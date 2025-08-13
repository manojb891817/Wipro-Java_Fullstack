import java.util.*;

public class Prime {
  public static void isPrime(int n){
    int div = 2;
    while (div<n){
      if (n%div == 0){
        System.out.println("Not Prime");
      }
      else{
        div += 1;
      }
    }
    System.out.println("Prime");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number : ");
    int n = sc.nextInt();

    isPrime(n);

    sc.close();
  }
}