import java.util.Arrays;


public class Q_16_X189 {
    public static void main(String[] args) {



        // Q.No. 189. Rotate Array


        int[] num = {1,2,3,4,5,6,7,8};
        int k = 3;

        ReverseArray(num,0,k -1 );
        ReverseArray(num,k , num.length -1);
        ReverseArray(num,0,num.length-1);
    }

    private static void ReverseArray(int[] num, int left, int right) {


        while (left < right) {
            num[left] =num[left] + num[right];
            num[right] = num[left] - num[right];
            num[left] = num[left] - num[right];
            left++;
            right--;
        }
        System.out.println(Arrays.toString(num));
    }
}
