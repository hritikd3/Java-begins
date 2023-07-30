import java.lang.*;

public class StringTask3 {
    public static void main(String[] args) {
        String str= "A%C!B@12o(@E)!!232#$tr%232!!!#$$%%&^&&(*(*))";

        System.out.println(str.replaceAll("[^0-9 A-Z a-z ]*", ""));
    }
}
