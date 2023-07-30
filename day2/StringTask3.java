import java.lang.*;
// input : A%C!B@12o(@E)!!232#$tr%232!!!#$$%%&^&&(*(*))
// output: ACB12oE232tr232

public class StringTask3 {
    public static void main(String[] args) {
        String str= "A%C!B@12o(@E)!!232#$tr%232!!!#$$%%&^&&(*(*))";

        System.out.println(str.replaceAll("[^0-9 A-Z a-z ]*", ""));
    }
}
