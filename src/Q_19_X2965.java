import java.util.HashSet;
import java.util.Set;

public class Q_19_X2965 {
    public static void main(String[] args) {


        int[][] nums = {{1, 2},{1,3}};

        int [] ans = {0,0};
        int count = 0;

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (set.contains(nums[i][j])) {
                    ans[0] = nums[i][j];
                }else {
                    set.add(nums[i][j]);
                }
            }
        }

        System.out.println(set);

        for (int i = 1; i <= nums.length * nums.length; i++){
            if(!set.contains(i)){
                ans[1] = i;
            }
        }

        for(int val : ans){
            System.out.print(val);
        }

    }
}
