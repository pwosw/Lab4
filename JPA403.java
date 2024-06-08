
public class JPA403 {
    public static void main(String[] args) {
        int A[][] = {{1, 2, 3}, {4, 5, 6}};
        int B[][] = {{7, 8, 9}, {10, 11, 12}};
        
        System.out.println("陣列A的內容為(3x3):");
        printMatrix(A);
        
        System.out.println("陣列B的內容為(3x3):");
        printMatrix(B);
        
        int[][] C = addMatrices(A, B);
        
        System.out.println("陣列A+B=C,陣列C的內容為(3x3):");
        printMatrix(C);
    }
    
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        
        int[][] C = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        
        return C;
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(String.format("%3d", matrix[i][j])); 
            }
            System.out.println();
        }
        System.out.println();
    }
}
