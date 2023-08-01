import java.lang.*;
import java.util.Scanner;


public class IsYoung {
    public static void main(String[] args) {
        int age ;
        Scanner sc=new Scanner(System.in);
 System.out.println("Enter the value of a: " );
  age= sc.nextInt();

  if( age>=15 && age<=45){
    System.out.println(" you are young");
  }else if(age>= 46){
    System.out.println(" you are enough mature ");
  }else{
    System.out.println("you are still underage ");
  }


    }
}
