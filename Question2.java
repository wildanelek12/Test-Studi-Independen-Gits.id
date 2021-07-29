public class MyClass {
    public static void main(String args[]) {
      String email = "fahrizasirojudin@gmail.com";

      System.out.println(check(email));
    }
    
    public static boolean check(String v) {
        boolean isValid = true;
        String[] tmp;
        
        if (v.contains("@")) {
            tmp = v.split("@");
            
            if (!(tmp[0].length() <= 20)) isValid = false;
            if (!(tmp[1].contains(".com") || tmp[1].contains(".co.id"))) isValid = false;
        } else {
            isValid = false;
        }
        
        return isValid;
    }
}