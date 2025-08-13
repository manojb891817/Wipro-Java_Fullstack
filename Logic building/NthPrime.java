import java.util.*;

public class NthPrime {
  public static int nthPrime(int n){
    if (n<=0){
      throw new IllegalArgumentException("Enter a positive number");
    }

    int count = 0;
    int num = 1;

    while(count < n){
      num++;
      if (isPrime(num)){
        count++;
      }
    }
    return num;
  }
  private static boolean isPrime(int num){
    if(num<2) return false;
    if(num == 2) return true;
    if(num % 2 == 0) return false;
    for (int i=3; i*i<=num; i+=2){
      if(num % i == 0) return false;
    }
    return true;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number : ");
    int n = sc.nextInt();

    System.out.println(nthPrime(n));

    sc.close();
  }
}