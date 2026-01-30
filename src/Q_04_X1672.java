public class Q_04_X1672 {
    public static void main(String[] args) {


        //Q.No. 1672. Richest Customer Wealth


        int[][] account = {{1,2,3},{3,2,1}};

        int welath = 0;

        for(int i = 0; i < account.length; i++){
            int money = 0;
            for(int j = 0; j < account[i].length; j++){
                money += account[i][j];
            }

            if(money > welath){
                welath = money;
            }
        }

        System.out.println(welath);
    }
}
