import java.lang.*;

// input: "abc             fgh       rer   dsds "
// output: "abc fgh rer dsds"

public class RemoveExtraSpace {
    public static void main(String[] args) {
        String str= "    abc             fgh       rer   dsds";

        System.out.println(str.replaceAll("\\s+", " ").trim()); // this trim to remove front space __abc

     
    }
}
