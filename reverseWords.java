
class wordsSolution {
    public String reverseWords(String s) {
        String temp = "";
        if (s == " ") {
            System.out.println(" ");
        } else {
            s = s.strip();
            String[] array = s.split(" ", -1);
            for (int i = array.length-1; i >= 0; i--) {
                if (array[i].isEmpty() == false) {
                    temp+= array[i] + " ";
                }                
            }
            
           
        }
         return temp.strip();
    }
}

public class reverseWords {
    public static void main(String[] args) {
        wordsSolution s = new wordsSolution();
        System.out.println(s.reverseWords("  hello world  "));
    }
} 
