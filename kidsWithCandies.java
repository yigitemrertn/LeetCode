
import java.util.ArrayList;
import java.util.List;
class candiesSolution {
    public  List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
     List<Boolean> list = new ArrayList<>(); 

        for (int i = 0; i < candies.length; i++) {
            int count = 0;
            for (int j = 0; j < candies.length; j++) {
                if (candies[i] + extraCandies >= candies[j]) {
                    count++;
                }
            }
            if (count == candies.length) {
                list.add(true);
            }
            else list.add(false);
        }

        return list;
    }
}

public class kidsWithCandies {

    public static void main(String[] args) {
        candiesSolution s = new candiesSolution();
        int[] l = {2,3,5,1,3};
        System.out.println(s.kidsWithCandies(l, 1));
    }
}