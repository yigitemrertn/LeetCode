class tripletSolution{
    public boolean findTriplet(int[] nums){
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= first) {
                first = n;
            } else if (n <= second) {
                second = n;
            } else {
                return true;
            }
        }
        return false;
    }
    
}

public class findTriplet {

    public static void main(String[] args) {
        tripletSolution ts = new tripletSolution();
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(ts.findTriplet(nums));
    }
} 
    

