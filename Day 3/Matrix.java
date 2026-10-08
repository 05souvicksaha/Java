import java.util.Scanner;

class Matrix {
   
 
    int[][] m;
    int rows, cols;

    Matrix(int r, int c) {
        rows = r;
        cols = c;
        m = new int[r][c];
    }
    
    void generateMatrix(Scanner sc) {
        System.out.println("Enter elements of the matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                m[i][j] = sc.nextInt();
            }
        }
    }

    void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    Matrix multiply(Matrix b) {

        if (this.cols != b.rows) {
            System.out.println("Matrix multiplication is not possible.");
            return null;
        }

        Matrix temp = new Matrix(this.rows, b.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < b.cols; j++) {
                for (int k = 0; k < this.cols; k++) {
                    temp.m[i][j] += this.m[i][k] * b.m[k][j];
                }
            }
        }

        return temp;
    }
}


class Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows of Matrix A: ");
        int r1 = sc.nextInt();

        System.out.print("Enter columns of Matrix A: ");
        int c1 = sc.nextInt();

        Matrix A = new Matrix(r1, c1);

        A.generateMatrix(sc);

        System.out.print("Enter rows of Matrix B: ");
        int r2 = sc.nextInt();

        System.out.print("Enter columns of Matrix B: ");
        int c2 = sc.nextInt();

        Matrix B = new Matrix(r2, c2);

        B.generateMatrix(sc);

        System.out.println("\nMatrix A:");
        A.display();

        System.out.println("\nMatrix B:");
        B.display();

        Matrix result = A.multiply(B);

        if (result != null) {
            System.out.println("\nResult of A × B:");
            result.display();
        }

        sc.close();
    }
}