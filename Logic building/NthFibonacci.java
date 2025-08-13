import java.util.*;

public class NthFibonacci {
  public static long nFibonacci(long n){
    if(n==1){
      return 0; 
    }
    else if(n==2){
      return 1;
    }

    long a=0, b=1, c=0;
    for (int i=3; i<=n; i++){
      c=a+b;
      a=b;
      b=c;
    }

    return b;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number");
    long n = sc.nextInt();

    System.out.println(nFibonacci(n));

    sc.close();
  }
}