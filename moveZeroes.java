import java.util.Arrays;

class zeroSolution{
    public void moveZeroes(int[] nums) { 
       int l = 0;
       for (int r = 1; r < nums.length; r++) {
            if (nums[l] == 0 && nums[r] != 0) {
                nums[l] = nums[r];
                nums[r] = 0;
                l++;
            } else if (nums[l] != 0) {
                l++;
                
            }
       }
    }
}

public class moveZeroes {
    public static void main(String[] args) {
        zeroSolution zero = new zeroSolution();
        int[] nums = {0,1,0,3,12}; // 1,3,12,0,0
        zero.moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
