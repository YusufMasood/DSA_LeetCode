
public class Q_01_X1920 {
    public static void main(String[] args) {


        // Q.No. 1920. Build Array from Permutation

        int[] num = {0,2,1,5,3,4};

        int[] ans = new int[num.length];

        for(int i = 0; i < ans.length; i++){
            ans[i] = num[num[i]];
        }

        for (int val : ans){
            System.out.print(val + " ");
        }

    }
}