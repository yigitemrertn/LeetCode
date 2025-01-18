import java.util.Arrays;

class compressSolution{
    public int compressString(char[] chars){
        int c = 1;
        String compress = "";
        if (chars.length == 1) {
            compress+=chars[0];
            return 1;
        }
        char temp = chars[0];
        for (int i = 1; i < chars.length; i++) {
            if (i == chars.length-1) {
                compress+=temp;
                if (c > 1) {
                    compress+=c+1;
                }
                temp = chars[i];
                
            }
            if (temp == chars[i]) {
                c++;
            } else {
                compress+=temp;
                if (c > 1) {
                    compress+=c;
                }
                c = 1;
                
                
            }
            temp = chars[i];
        }
        System.out.println(compress);
        System.out.println(Arrays.toString(chars));
        System.out.println(Arrays.toString(compress.toCharArray()));
        return compress.length();
    }
}

public class stringCompress {
    public static void main(String[] args) {
        compressSolution compress = new compressSolution();
        char[] chars = {'a','a','b','b','c','c','c'}; // a2b2c3
        System.out.println(compress.compressString(chars));
    }
}
