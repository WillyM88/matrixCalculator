public class MatrixOperations {

    // class fields----------------------------------------------------------:
    private int[][] firstMatrix;

    private int[][] secondMatrix;

    private int[][] resultMatrix;

    // class constructor-----------------------------------------------------------:
    public MatrixOperations(int[][] firstMatrix, int[][] secondMatrix) {
        this.firstMatrix = firstMatrix;
        this.secondMatrix = secondMatrix;
    }

    // class getters
    public int[][] getFirstMatrix() {
        return this.firstMatrix;
    }

    public int[][] getSecondMatrix() {
        return this.secondMatrix;
    }

    public int[][] getResultMatrix() {
        return this.resultMatrix;
    }

    // class setters
    public void setFirstMatrix(int[][] firstMatrix) {
        this.firstMatrix = firstMatrix;
    }

    public void setSecondMatrix(int[][] secondMatrix) {
        this.secondMatrix = secondMatrix;
    }

    public void setResultMatrix(int[][] resultMatrix) {
        this.resultMatrix = resultMatrix;
    }

    // methods for printing matrices------------------------------------------------:
    private void printMatrix(int[][] targetMatrix, boolean withPositions) {
        if (!withPositions) {
            for (int i = 0; i < targetMatrix.length; i++) {
                for (int j = 0; j < targetMatrix[0].length; j++) {
                    System.out.print(targetMatrix[i][j]);
                    if (j < targetMatrix[0].length - 1) {
                        System.out.print(" _ ");
                    } else if (j == targetMatrix[0].length - 1) {
                        System.out.print("\n");
                    }
                }
            }
        } else {
            for (int i = 0; i < targetMatrix.length; i++) {
                for (int j = 0; j < targetMatrix[0].length; j++) {
                    System.out.print("(i:" + i + ",j:" + j + ")=" + targetMatrix[i][j]);
                    if (j < targetMatrix[0].length - 1) {
                        System.out.print(" _ ");
                    } else if (j == targetMatrix[0].length - 1) {
                        System.out.print("\n");
                    }
                }
            }
        }
    }

    public void printFirstMatrix() {
        printMatrix(getFirstMatrix(), false);
    }

    public void printSecondMatrix() {
        printMatrix(getSecondMatrix(), false);
    }

    public void printResultMatrix() {
        printMatrix(getResultMatrix(), false);
    }

    public void printFirstMatrix_WithPositions() {
        printMatrix(getFirstMatrix(), true);
    }

    public void printSecondMatrix_WithPositions() {
        printMatrix(getSecondMatrix(), true);
    }

    public void printResultMatrix_WithPositions() {
        printMatrix(getResultMatrix(), true);
    }

    // Matrix operations----------------------------------------------------------------------:

    private boolean verifySum(int[][] firstMatrix, int[][] secondMatrix) {
        return firstMatrix.length == secondMatrix.length && firstMatrix[0].length == secondMatrix[0].length;
    }

    public int[][] sumMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        if (verifySum(firstMatrix, secondMatrix)) {
            int[][] resultMatrix = new int[firstMatrix.length][firstMatrix[0].length];
            for (int i = 0; i < firstMatrix.length; i++) {
                for (int j = 0; j < firstMatrix[0].length; j++) {
                    resultMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
                }
            }
            return resultMatrix;
        } else {
            System.out.println("unable to sum, returning first matrix");
            return firstMatrix;
        }
    }
    // matrix multiplier

//    public int[][] multiplyMatrices() {
//        int counter = 0;
//        int[] returnValue = new int[this.firstMatrix.length * this.secondMatrix[0].length];
//        for (int i = 0; i < this.firstMatrix.length; i++) {
//            for (int y = 0; y < this.secondMatrix[0].length; y++) {
//                int total = 0;
//                for (int j = 0; j < this.firstMatrix[0].length; j++) {
//                    int mult = (firstMatrix[i][j] * secondMatrix[j][y]);
//                    total += mult;
//                    if (j == firstMatrix[0].length - 1) {
//                        returnValue[counter] = total;
//                        counter++;
//                        total = 0;
//                    }
//                }
//            }
//        }
//        return returnValue;
//    }

}
