import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[][] myMatrix = {
                {10, 20, 10},
                {4, 5, 6},
                {2, 3, 5}
        };

        int[][] myOtherMatrix = {
                {3, 2, 4},
                {3, 3, 9},
                {4, 4, 2}
        };

        int[][] multiplicationResult = {
                {130, 120, 240},
                {51, 47, 73},
                {35, 33, 45}
        };

        MatrixOperations matrixAddition = new MatrixOperations(myMatrix, myOtherMatrix);
        matrixAddition.printFirstMatrix_WithPositions();
        matrixAddition.printSecondMatrix();

    }
}