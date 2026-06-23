public class Q_21_X88 {
    public static void main(String[] args) {

        // Q.No. 88. Merge sorted array

        int[] num1 = {7,5,8,6,0,0,0,0};
        int[] num2 = {3,4,1,2};
        int m = num1.length;
        int n = num2.length;

        for (int i = 0; i < n; i++) {
            num1[n+i] = num2[i];
        }

        quickSort(num1,0,m-1);

        for(int val : num1){
            System.out.print(val + " ");
        }


    }

    static void quickSort(int[] num1, int str, int end){
        if (str < end){
            int pIndex = partition(num1, str, end);
            quickSort(num1, str, pIndex-1);
            quickSort(num1, pIndex+1, end);
        }
    }

    static int partition(int[] num1, int str, int end ){
        int index = str-1;
        int pindex = end;

        for (int i = str; i < end; i++) {
            if(num1[i] <= num1[pindex]){
                index ++;
                int temp = num1[i];
                num1[i] = num1[index];
                num1[index] = temp;
            }
        }
        index++;
        int temp = num1[pindex];
        num1[pindex] = num1[index];
        num1[index] = temp;

        return index;
    }

}
