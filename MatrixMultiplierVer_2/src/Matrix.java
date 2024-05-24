import java.util.Scanner;

public class Matrix {

    private int rows;
    private int columns;

    int[][] matrix;

    // constructors-------------------------------------------:

    // This constructor is for manually inputting the 2D array
    public Matrix(int rows, int columns) {
        this.matrix = new int[rows][columns];
        this.rows = rows;
        this.columns = columns;
        setMatrixManually();
    }

    public Matrix() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number of rows:");
        this.rows = scan.nextInt();
        System.out.println("Please enter number of columns:");
        this.columns = scan.nextInt();
        this.matrix = new int[this.rows][this.columns];
        setMatrixManually();
    }

    // This constructor is for when you have all 3 bits of info
    public Matrix(int rows, int columns, int[][] matrix) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = matrix;
    }

    // This constructor is for when you only have the array but don't know rows and columns
    public Matrix(int[][] matrix) {
        this.matrix = matrix;
        this.rows = matrix.length;
        this.columns = matrix[0].length;
    }

    // Getters and setters-------------------------------------:

    // default setters
    public void setRows(int numberOfRows) {
        this.rows = numberOfRows;
    }

    public void setColumns(int numberOfColumns) {
        this.columns = numberOfColumns;
    }

    // default getters
    public int getRows() {
        return this.rows;
    }

    public int getColumns() {
        return this.columns;
    }

    public int[][] getMatrix() {
        return this.matrix;
    }

    // custom methods
    public void printMatrix() {
        System.out.println("printing matrix");
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                System.out.print(matrix[i][j]);
                if (j < this.columns - 1) {
                    System.out.print(" _ ");
                } else {
                    System.out.print("\n");
                }
            }
        }
        System.out.print("\n");
    }

    public void printMatrixWithPositions() {
        System.out.println("Printing with (i,j) positions:");
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                System.out.print("i=" + i + ",j=" + j + " = " +matrix[i][j]);
                if (j < this.columns - 1) {
                    System.out.print(" _ ");
                } else {
                    System.out.print("\n");
                }
            }
        }
        System.out.print("\n");
    }

    public void setMatrixManually() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                System.out.println("Input value at i:" + i + ", j:" + j + " = ");
                this.matrix[i][j] = scan.nextInt();
            }
        }
    }

}

