import java.util.Arrays;

public class Q_17_X283 {
    public static void main(String[] args) {


        // Q.No. 283. Move Zeroes



        int[] nums = {0,1,0,3,12,23,0,0,0,76,0};

        int inposition = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[inposition] = nums[i];
                inposition++;
            }
        }

        while(inposition < nums.length){
            nums[inposition] = 0;
            inposition++;
        }

        System.out.println(Arrays.toString(nums));

    }
}
