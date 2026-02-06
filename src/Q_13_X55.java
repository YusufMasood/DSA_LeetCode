import java.util.HashSet;

public class Q_13_X55 {


    // Q.No. 41. First Missing Positive
    public static void main(String[] args) {


        int[] nums = {1, 2, 3};

        HashSet<Integer> numset = new HashSet<>(nums.length);

        for (int n : nums) {
            if(n > 0) {
                numset.add(n);
            }

        }

        int snum = 1;


        while (numset.contains(snum)){
            snum++;
        }

        System.out.println(snum);

    }
}
