

public class Q_02 {
    public static void main(String args[]){


        //Q.No. 1929. Concatenation of Array


        int[] nums = {1, 2, 1};
        int[] ans = new int[2 * nums.length];

        for(int i = 0; i < ans.length; i++){

            if (i < nums.length) {
                ans[i] = nums[i];
            }else {
                ans[i] = nums[i - nums.length];
            }
        }

        for (int val : ans){
            System.out.print(val + " ");
        }

    }
}
