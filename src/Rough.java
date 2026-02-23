import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Collections.swap;

public class Rough {

    public static void main(String[] args) {


        int[] num = {0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1 };



        ArrayList<Integer> numtemp = new ArrayList<>();

        for (int i = 0; i < num.length; i++) {
            numtemp.add(num[i]);
        }

        System.out.println(numtemp);

        moveZeros(numtemp);

        System.out.println(numtemp);


        for(int i = 0; i < num.length; i++){
            if(numtemp.get(i) == 0){
                int temp = numtemp.get(i);
                numtemp.remove(i);
                numtemp.add(numtemp.size(),temp);
            }
        }

        System.out.println(numtemp);

    }



    static void  moveZeros(ArrayList<Integer> num){

        int count = 0;
        for(int i = 0; i < num.size(); i++){
            if(num.get(i) == 0){
                count++;
            }
        }

        for (int i = 0; i < num.size() - count; i++){

            num.set(i, 1);

        }

        for (int i = num.size() - count; i < num.size(); i++){
            num.set(i, num.get(i) * 0);
        }

        System.out.println(num);
    }


}
