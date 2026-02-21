public class Q_15_X374 {
    public static void main(String[] args) {

        // Q.No. 374. Guess Number Higher or Lower

        System.out.println("Guessed right !! :- " + GuessGame(10,6));

    }

    static int GuessGame(int n, int pick){
        int start = 1;
        int end  = n;

        while(start <= end){

            int mid = start + (end - start)/2;

            if (mid == pick) {
                return mid;
            }else if(mid > pick){
                end = mid - 1;

            } else if (mid < pick) {
                start = mid + 1;
            }

        }

        return -1;
    }
}
