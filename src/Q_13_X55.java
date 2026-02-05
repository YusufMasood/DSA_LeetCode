public class Q_13_X55 {


    // Q.No. 41. First Missing Positive
    public static void main(String[] args) {


        int[] nums = {1, 2, 0};

        int snum = Integer.MAX_VALUE;

        for(int i = 0; i  < nums.length; i++){
            if(nums[i] < snum && nums[i] > 0){
                snum = nums[i];
            }
        }

        System.out.println(snum);

    }
}
