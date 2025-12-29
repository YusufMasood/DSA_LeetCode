public class Q_05 {
    public static void main(String[] args) {


        //Q.No. 1470. Shuffle the Array


        int n = 3;
        int[] nums = {2,5,1,3,4,7};
        int[] result  = new int[2*n];

        for(int i = 0; i < n; i++){
            result[i *2] = nums[i];
            result[i *2 + 1] = nums[i +n];
        }

        for (int val : result){
            System.out.print(val + " ");
        }
    }
}
