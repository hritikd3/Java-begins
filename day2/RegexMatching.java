import java.lang.*;

class RegexMatching {
    public static void main(String[] a){
        String str1= "Hritik@gmail.com";
        String str2= "acc";

        System.out.println(str1.matches("."));  // check single character so false
        System.out.println(str1.matches(".*"));  //after adding *(quantifier)  so true 
        System.out.println(str1.matches("\\d"));  // false as not a digit
        System.out.println(str1.matches("[a-z]"));  // false as it contain special symbol and capital too


        System.out.println(str2.matches("[abc]{3}"));  //true it checks length is 3 and contain anything from [abc] or not 
        System.out.println(str1.matches(".*gmail.*")); //true it checks that str1 contain gmail in it or not
        
        System.out.println(str1.matches("\\w.*gmail(.*)")); //true it checks that the starating sequence must be aplhabets or number and contain gmail

    }
}