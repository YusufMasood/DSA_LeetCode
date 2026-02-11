import java.util.Arrays;

public class Q_14_X34 {
    public static void main(String[] args) {


        //Q.No. 34. Find First and Last Position of Element in Sorted Array


        int[] arr = {5,7,7,8,8,10};
        int target = 8;

        int[] res =  new int[2];

        res[0] = firstAppearence(arr,target);
        res[1] = lastAppearence(arr,target);

        System.out.println(Arrays.toString(res));
    }


    //Fun  for the first appearnce
    private static int firstAppearence(int[] arr, int target){
        int ans  = -1;
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(arr[mid] == target){
                ans = mid;
                end = mid-1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }

        return ans;
    }


    //Fun for the last appearence

    private static int lastAppearence(int[] arr, int target){
        int ans  = -1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid  = start + (end - start)/2;

            if(arr[mid] == target){
                ans = mid;
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }

        }


        return ans;
    }
}
