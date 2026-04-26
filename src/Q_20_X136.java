public class Q_20_X136 {
    public static void main(String[] args) {


        //Q.no. 136. Single Number

        int[] nums = {2,2,1,2,2,1};
        int ans = 0;

        for(int i = 0; i < nums.length; i++){
            ans = ans ^ nums[i];
        }

        System.out.println(ans);
        
    }
}
