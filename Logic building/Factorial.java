import java.util.*;

public class Factorial {
  public static int isFact(int n){
    if(n == 0){
      return 0;
    }
    else if(n == 1){
      return 1;
    }
    else{
    return n * isFact(n-1);
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number");
    int n = sc.nextInt();

    System.out.println(isFact(n));

    sc.close();
  }
}