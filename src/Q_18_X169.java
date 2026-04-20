
public class Q_18_X169 {
    public static void main(String[] args) {

        int[] nums = {2,2,4,4,2};

        int candidate = 0;
        int count = 0;

        for(int val : nums){
            if(count == 0){
                candidate = val;
            }

            if(val == candidate){
                count ++;
            }else{
                count --;
            }
        }

        int freq = 0;
        for(int val : nums){
            if(val == candidate){
                freq++;
            }
        }

        if(freq > nums.length / 2){
            System.out.println(candidate);
        } else {
            System.out.println("No majority element");
        }
    }
}
