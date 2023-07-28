import java.lang.*;


class Variables{
    public static void main(String[] args) {
        byte b=4;
      System.out.println(b);
      b=10;
      System.out.println(b);

      //now it will throw error bca range of max byte can store is 127
      b=129;
      System.out.println(b);
    }
}