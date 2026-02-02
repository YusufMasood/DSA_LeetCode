import java.util.ArrayList;

public class Q_12_X54 {
    public static void main(String[] args) {




        //Q.No. 54. Spiral Matrix



        int [][] matrix = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};


        ArrayList<Integer> res = new ArrayList<>();

        int sColumn = 0;
        int sRow = 0;
        int eColumn = matrix.length-1;
        int eRow = matrix.length-1;


        while (sColumn <= eColumn && sRow <= eRow) {

            for(int i = sColumn; i <= eColumn; i++){
                res.add(matrix[sRow][i]);
            }
            sRow++;

            for(int i = sRow; i <= eRow; i++){
                res.add(matrix[i][eColumn]);
            }
            eColumn--;

            if(sRow <= eRow) {

                for (int i = eColumn; i >= 0; i--) {
                    res.add(matrix[eRow][i]);
                }
                eRow--;
            }

            if(sColumn <= eColumn) {

                for (int i = eRow; i > 0; i--) {
                    res.add(matrix[i][sColumn]);
                }
                sColumn++;
            }

        }


        System.out.println(res);
    }
}
