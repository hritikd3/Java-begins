import java.lang.*;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int num;
 System.out.println("Enter the num");
  num= sc.nextInt();

  if( num%2==0){
    System.out.println("It is a even no");
  }else{
    System.out.println("it is a odd number");
  }

    }
}
