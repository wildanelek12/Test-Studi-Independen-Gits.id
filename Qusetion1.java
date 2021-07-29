public class MyClass {
    public static void main(String args[]) {
      System.out.println(hello(21));
    }
    
    public static String hello(int v) {
        return (v % 3 == 0) && (v % 5 == 0) ? "Hello World" : (v % 3 == 0) ? "Hello" : (v % 5 == 0) ? "World" : "";
    }
}