import java.lang.*;

class StringPractice{
 
    public static void main(String[] args) {
        String s1= new String("JAVA");
        System.out.println(s1);

        String s2= "Java Program";
        System.out.println(s2);

       char c[]= {'A','b','C'};
       String s3= new String(c);
        System.out.println(s3);

        byte b[]= {65,23,12};
        String s4= new String(b);
             System.out.println(s4);

             String str1= "hritik";
             String str2= "hritik";
             System.out.println(str1==str2); // it means both str are holding the same object and pointing to hritik on the same String pool 
    }
}