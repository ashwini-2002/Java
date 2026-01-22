
//Double dimension [2*2] matrix
package Ashwini;

public class Matrix {

//public static void main(String[] args) 
//{
//	int [] [] matrix = {
//			{1,2},{3,4}
//	};
//	System.out.println("2*2 matrix:");
//	for(int i=0; i<2; i++){
//		for(int j=0;j<2;j++) {
//			System.out.print(matrix[i][j]+ " ");
//	
//		}	  System.out.println("");
//
//	}		
//}
//}



//3*3 matrix

  public static void main(String[] args) {

      int[][] matrix = {
          {1, 2, 3},
          {4, 5, 6},
          {7, 8, 9}
      };

      System.out.println("3*3 matrix:");

      for (int i = 0; i < 3; i++) {          
          for (int j = 0; j < 3; j++) {      
              System.out.print(matrix[i][j] + " ");
          }
          System.out.println();         
      }
  }
}



