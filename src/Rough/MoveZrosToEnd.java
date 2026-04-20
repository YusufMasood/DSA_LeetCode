package Rough;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class MoveZrosToEnd {

    public static void main(String[] args) {

        int[] num = {1};



        ArrayList<Integer> numtemp = new ArrayList<>();

        for (int i = 0; i < num.length; i++) {
            numtemp.add(num[i]);
        }

        System.out.println(numtemp);

        moveZeros(numtemp);

    }



    static void  moveZeros(ArrayList<Integer> num){

        int zeroPos = 0;

        for(int i = 0; i < num.size(); i++){

            if(num.get(i)!=0){
                int temp = num.get(i);
                num.set(i, num.get(zeroPos));
                num.set(zeroPos,temp);
                zeroPos++;
            }

        }



        System.out.println(num);
    }

}
