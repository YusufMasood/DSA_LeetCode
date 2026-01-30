import java.util.ArrayList;
import java.util.List;

public class Q_09_X1389 {
    public static void main(String[] args) {


        //Q.No. 1389. Create Target Array in the Given Order


        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        List<Integer> target = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            target.add(index[i],nums[i]);
        }

        System.out.print(target +" ");
    }
}
