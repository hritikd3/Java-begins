import java.lang.*;


class StringTask1{
    public static void main(String[] args) {
        String str= "programmer@gmail.com";

        int i=str.indexOf("@");
       String userName=str.substring(0, i);
        
        String domain= str.substring(i+1,str.length());
        System.out.println("username is: " + userName);
        System.out.println("domain is: " + domain);

        if( domain.startsWith("gmail")){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
}
