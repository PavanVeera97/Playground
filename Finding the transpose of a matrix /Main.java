import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    Scanner sc = new Scanner(System.in);
    int row_size = sc.nextInt();
    int column_size = sc.nextInt();
    int matrix1[][] = new int[row_size][column_size];
    for(int i = 0; i < row_size; i++){
      for(int j = 0; j < column_size; j++)
      {
        matrix1[i][j] = sc.nextInt();
      }
    }
    int matrix2[][] = new int[row_size][column_size];
    for(int i = 0; i < row_size; i++){
      for(int j = 0; j < column_size; j++)
      {
        matrix2[i][j] = matrix1[j][i];
      }
    }
       for(int i = 0; i < row_size; i++){
      for(int j = 0; j < column_size; j++)
      {
        System.out.print(matrix2[i][j]+" ");
      }
         System.out.println();
       }
    }
}