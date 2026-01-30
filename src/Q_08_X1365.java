public class Q_08_X1365 {
    public static void main(String[] args) {


        //Q.No. 1365. How Many Numbers Are Smaller Than the Current Number



        int[] nums ={8,1,2,2,3};
        int[] smallerNums  = new int[nums.length];

        for(int i=0;i<smallerNums.length;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[i] > nums[j] && i != j){
                    count++;
                }
            }

            smallerNums[i] = count;
        }

        for(int value:smallerNums){
            System.out.print(value + " ");
        }

    }
}
