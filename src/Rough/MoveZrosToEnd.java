package Rough;

import java.util.ArrayList;

public class MoveZrosToEnd {

    public static void main(String[] args) {

        int[] num = {0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1 };



        ArrayList<Integer> numtemp = new ArrayList<>();

        for (int i = 0; i < num.length; i++) {
            numtemp.add(num[i]);
        }

        System.out.println(numtemp);

        moveZeros(numtemp);



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

        int insPosition = 0;
        for(int i = 0; i < num.size(); i++){
            if(num.get(i) != 0){
                num.set(insPosition,num.get(i));
                insPosition++;
            }
        }

        while(insPosition < num.size()){
            num.set(insPosition,0);
            insPosition++;
        }

        System.out.println(num);
    }

}
