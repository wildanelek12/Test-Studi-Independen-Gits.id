public class MyClass {
    public static void main(String args[]) {
      String email = "Aplikasi";

      System.out.println(reverse(email));
    }
    
    public static String reverse(String v) {
        return new StringBuilder(v).reverse().toString();
    }
}