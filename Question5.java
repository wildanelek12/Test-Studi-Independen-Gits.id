public class MyClass {
    public static void main(String args[]) {
      System.out.println(polindrom("katak"));
    }
    
    public static boolean polindrom(String v) {
        return new StringBuilder(v).reverse().toString().equals(v);
    }
}