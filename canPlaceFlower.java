
 class flowerSolution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int count = 0;
        if (len == 1) {
            if (flowerbed[0] == 0) {
                count++;
            }
        }
        for (int i = 0; i < len; i++) {

            try {
                if (i == 0 && flowerbed[0] == 0 && flowerbed[1] == 0) {
                    flowerbed[0] = 1;
                    count++;

                } else if (i == len - 1 && flowerbed[len - 1] == 0 && flowerbed[len - 2] == 0) {
                    flowerbed[len - 1] = 1;
                    count++;

                } else if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    count++;

                }
            } catch (Exception e) {
                // TODO: handle exception
            }

        }
        return (count >= n);
    }
}
public class canPlaceFlower {
    public static void main(String[] args) {
        flowerSolution s = new flowerSolution();
        int[] l = {1,0,0,0,1};
        System.out.println(s.canPlaceFlowers(l, 1));
    }
}