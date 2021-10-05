import java.util.*;
public class MyClass {
    
    public static void main(String args[]) {
      Scanner X = new Scanner(System.in);
      System.out.print("Masukkan nomor ke : ");
      int number = X.nextInt();
        int n1=0,n2=1,pengganti;

       System.out.println("Fibonacci Series:");

        for (int i=1; i<=number; i++) {
          System.out.print(n1);
          pengganti=n1+n2;
          n1=n2;
          n2=pengganti;
        }
    }
}
