import java.util.Scanner;
 class Main {

    public static void main(String[] args) {
        int row = 2, column = 3,i,j;
        int[][] matrix = { {2, 3, 4}, {5, 6, 4} };
      int trans[][]=new int[column][row];
      for(i=0;i<row;i++)
      {
        for(j=0;j<column;j++)
        {
          trans[j][i]=matrix[i][j];
        }
      }
      display(trans);
		//Try out your code here
        
    }
  
    public static void display(int[][] matrix) {
        for(int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
    
   