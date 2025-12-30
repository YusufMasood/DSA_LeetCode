import java.util.HashMap;
import java.util.Map;

public class Q_07 {
    public static void main(String[] args) {

        //Q.No. 1512. Number of Good Pairs

        int[] nums = {1,2,3,1,1,3};

        Map<Integer, Integer> freq = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            count += freq.getOrDefault(num, 0);
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        System.out.println(count);
    }
}
