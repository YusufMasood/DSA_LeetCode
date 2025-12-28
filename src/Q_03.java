public class Q_03 {
    public static void main(String aurg[]){


        //Q.No. 1480. Running Sum of 1d Array


        int [] nums = {1, 2, 3, 4};
        int[] runningSum = new int[nums.length];

        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            runningSum[i] = sum;
        }

        for(int val :  runningSum){
            System.out.print(val + " ");
        }
    }
}
