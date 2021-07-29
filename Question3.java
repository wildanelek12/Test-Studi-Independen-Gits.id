public class MyClass {
    public static void main(String args[]) {
        System.out.println(timeConversion("08:10:12 PM"));

    }
    static String timeConversion(String s){
        String[] s1=s.split(":");
        int milipmHrs=0;
        char[] arr=s1[2].toCharArray();
        boolean isFound=s1[2].contains("PM");
        if(isFound){
            int pmHrs=Integer.parseInt(s1[0]);
            milipmHrs=pmHrs+12;
            return(milipmHrs+":"+s1[1]+":"+arr[0]+arr[1]);
        }
        else{
    
            return(s1[0]+":"+s1[1]+":"+arr[0]+arr[1]);
        }
    }
}
