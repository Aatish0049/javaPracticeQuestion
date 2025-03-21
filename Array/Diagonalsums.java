public class Diagonalsums {
    public static int Diagonalsums(int matrix[][]){
        int sum = 0;
     /*    for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(i == j){
                    sum += matrix[i][j];
                }
                else if(i+j==matrix.length){
                    sum += matrix[i][j];
                }
            }
        }*/
        for(int i=0; i<matrix.length; i++){
            sum+=matrix[i][i];
            if(i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i];
    
        }}
        return sum;
    }
    public static void main(String[] args) {
        int matrix [][]={{0,1,2},
    {0,1,2},
{1,2,3}};
        System.out.println(" sum of diagonal elements: " + Diagonalsums(matrix));
    }
    
}
