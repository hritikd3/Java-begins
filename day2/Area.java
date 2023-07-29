import java.lang.*;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        float height, base, area;
        System.out.println("Enter the height" );
       
        Scanner sc= new Scanner(System.in);
        height= sc.nextFloat();

        System.out.println("Enter the base" );
        base= sc.nextFloat();

        area= 0.5f* base * height;

        System.out.println("The area of Traingle is " + area);

    }
}
