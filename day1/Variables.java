import java.lang.*;


class Variables{
    public static void main(String[] args) {
        byte b=4;
      System.out.println(b);
      b=10;
      System.out.println(b);

      //now it will throw error bca range of max byte can store is 127
      // b=129;
      System.out.println(b);

      int c=412;
      short d=300;
      float e= 3.28f;
      double g= 3.32328f;
      char f= 'A';
      long l= 111111111111112L;
      System.out.println(c);
      System.out.println(d);
      System.out.println(e);
      System.out.println(e);
      System.out.println(f);
      System.out.println(g);
      System.out.println(l);
      


    }
}