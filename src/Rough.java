import java.util.ArrayList;

public class Rough {

    public static void main(String[] args) {


        int [][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<Integer> res = new ArrayList<>();

        int startCol = 0;
        int startRow = 0;
        int endCol = mat[0].length-1;
        int endRow = mat.length-1;

        while(startCol <= endCol && startRow <= endRow){

            for(int i = startCol; i <= endCol; i++){
                res.add(mat[startRow][i]);
            }

            for(int i = startRow + 1 ; i <= endRow; i++){
                res.add(mat[i][endCol]);
            }

            for(int  i = endCol - 1; i >= startCol; i--){

                if(startRow == endRow){
                    break;
                }
                res.add(mat[endRow][i]);
            }

            for(int i = endRow - 1; i > startRow; i--){

                if(startCol == endCol){
                    break;
                }
                res.add(mat[i][startCol]);
            }
            startCol++;
            startRow++;
            endRow--;
            endCol--;
        }

        System.out.println(res);
    }
}
