import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_06 {
    public static void main(String[] args) {


        //Q.No. 1431. Kids With the Greatest Number of Candies



        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> result = new ArrayList<>();

        int maxCndy = Arrays.stream(candies).max().getAsInt();

        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCndy);
        }

        System.out.println(result);
    }
}
