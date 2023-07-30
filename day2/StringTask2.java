import java.lang.*;

public class StringTask2 {
    public static void main(String[] args) {
        int b=101101;
        String str= b+ "";  //convert number to string
        String s1="1011AB1";
        String date= "23/08/2012";
        // System.out.println( str);
       
        
        System.out.println(str.matches("[01]*"));  //logic for checking binary digit or not 
        System.out.println(s1.matches("[0-9 A-Z]*"));  //logic for checking hexadecimal format
        System.out.println(date.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}*"));  //logic for checkiing the dd/mm/yyyy format
       
    }

   
}
