import java.lang.*;

public class IncreamentOperator {
    public static void main(String[] args) {
        
        
        // int x=5;
        // x++;  //++x
        // System.out.println(x);
        
        // int x=5,y;
        // y=x++; //++x
        // System.out.println(x+" "+y);  // 5  6
        
        int x=5,y=4,z;
        z=2 * x++ + 3 * ++y;
        System.out.println(z);  //25

    }
    
}
