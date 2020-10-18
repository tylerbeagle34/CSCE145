/**
 * Written by Warren Beagle & Tucker Bytnar
 */
import java.util.Scanner;
public class MatrixSubtraction {
  
  public static void main(String[] args) { 
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Welcome to the matrix subtracting program");
    
    System.out.println("Please enter the length of the first matrix");
    int length1 = keyboard.nextInt();
    System.out.println("Please enter the height of the first matrix");
    int height1 = keyboard.nextInt();
    System.out.println("Please enter the length of the second matrix");
    int length2 = keyboard.nextInt();
    System.out.println("Please enter the length of the second matrix");
    int height2 = keyboard.nextInt();
    
    if(length1 == length2 && height1 == height2)
    {
      int[][] matrix1 = new int[length1][height1];
      for(int i = 0; i < length1; i++)
      {
        for(int j = 0; j < height1; j++)
        {
          System.out.println("Please enter a value for matrix 1 space "+(i+1)+", "+(j+1));
          int input = keyboard.nextInt();
          matrix1[i][j] = input;
        }
      }
      int[][] matrix2 = new int[length2][height2];
      for(int i = 0; i < length2; i++)
      {
        for(int j = 0; j < height2; j++)
        {
          System.out.println("Please enter a value for matrix 2 space "+(i+1)+", "+(j+1));
          int input = keyboard.nextInt();
          matrix2[i][j] = input;
        }
      }
      int[][] newMatrix = new int[length1][height1];
      for(int i = 0; i < length1; i++)
      {
        for(int j = 0; j < height1; j++)
        {
          newMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
        }
      }
      for(int i = 0; i < length1; i++)
      {
        for(int j = 0; j < height1; j++)
        {
          System.out.print(matrix1[i][j]+" ");
        }
        System.out.println();
      }
      System.out.println("-");
      for(int i = 0; i < length1; i++)
      {
        for(int j = 0; j < height1; j++)
        {
          System.out.print(matrix2[i][j]+" ");
        }
        System.out.println();
      }
      System.out.println("=");
      for(int i = 0; i < length1; i++)
      {
        for(int j = 0; j < height1; j++)
        {
          System.out.print(newMatrix[i][j]+" ");
        }
        System.out.println();
      }
      System.out.println("DONE!");
    }
    else
    {
      System.out.println("Matrix dimensions don't match");
      System.exit(0);
    }
  }
  
  /* ADD YOUR CODE HERE */
  
}
