 
import java.util.ArrayList;

class vowelSolution {
    public String reverseVowels(String s) {
          String sLow = s.toLowerCase();
            int count = 0;
            ArrayList<Character> reversed = new ArrayList<>();
            ArrayList<Character> vowels = new ArrayList<>();
            String tempS = "";
         if (1 > s.length()) {
            System.out.println(s);
         }
         else{
          
            for (int i = 0; i < s.length(); i++) {
                if (sLow.charAt(i) == 'a' || sLow.charAt(i) == 'e' || sLow.charAt(i) == 'i' || sLow.charAt(i) == 'ı' || sLow.charAt(i) == 'o' || sLow.charAt(i) == 'u') {
                    vowels.add(s.charAt(i));
                    reversed.add(s.charAt(i));
                }
                else{
                    vowels.add('ğ');
                }
            }
            if (reversed.isEmpty()) {
                
            }
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == vowels.get(i)) {
                    tempS += reversed.reversed().get(count);
                    count++;
                }
                else{
                    tempS += s.charAt(i);
                }
            }
            
    
    
         }
      return tempS;
    }
}

public class reverseVowels {

    public static void main(String[] args) {
        vowelSolution s = new vowelSolution();
        System.out.println(s.reverseVowels("hello"));
    }

} 
