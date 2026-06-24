package Rough;

public class Q_22_X136 {

    public static void main(String[] args) {


        //Q.No. 136. Single Number

        int[] nums = {4, 1, 2, 1, 2};

        int un = 0;
        for(int val : nums){
            un = un^val;
        }

        System.out.println(un);
    }
}
