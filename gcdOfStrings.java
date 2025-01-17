
class gcdSolution {
    public static int findGCD(int a, int b) {
       int min = Math.min(a, b); 
       int gcd = 1;
       for (int i = 1; i <= min; i++) { 
           if (a % i == 0 && b % i == 0) {
               gcd = i; 
           }
       }
       return gcd;
   }
   public String gcdOfStrings(String str1, String str2) {
       
        if ((str1+str2).equals(str2+str1)) {
         String gcd = str1.substring(0, findGCD(str1.length(), str2.length()));
         return gcd;
       }
       else{
           return "";
       }
   }
}

public class gcdOfStrings {
    public static void main(String[] args) {
        gcdSolution s = new gcdSolution();
        System.out.println(s.gcdOfStrings("ABCABC", "ABC"));
    }
}
