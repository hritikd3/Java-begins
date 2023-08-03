import java.util.*;

public class ForLoop {
    public static void main(String args[]) {
        
        for(int i=2;i<10;i++){
            
            System.out.println(i);
        }
        System.out.println("------------------");
        
        // brain storming
        int  p=0;
        for(;p<=10 ;p++)
        System.out.println(p); 
        p++;  //valid 


        // nice one 
        int s=1;
        for( System.out.println("yes it can run") ;s<=10; s++ ){
            System.out.println(s); //valid it will println the sop and 1-10
        }
    
         int r=2;  
         for( ; ; ){     // this is valid but it will run to infinite loop 
            System.out.println(r);
         }

        
    }
}
