package ru.synergy;

public class MatrixOperations {
    public static void main(String[] args) {
        Matrix2 matrixA = new Matrix2();
        matrixA.n = 2;
        matrixA.m = 2;
        matrixA.array = new int[][]{{1, 2}, {3, 4}};

        Matrix2 matrixB = new Matrix2();
        matrixB.n = 2;
        matrixB.m = 2;
        matrixB.array = new int[][]{{1, 2}, {1, 2}};

        Matrix2 matrixResult = new Matrix2();
        Matrix2 matrixSquare = new Matrix2();

        System.out.println("Матрица А:");
        matrixA.printMatrix(matrixA);
        System.out.println();

        System.out.println("Матрица B:");
        matrixB.printMatrix(matrixB);
        System.out.println();

        matrixA.summa(matrixA, matrixB, matrixResult, 0, 0);

        System.out.println("Сумма матриц А и В:");
        matrixResult.printMatrix(matrixResult);
        System.out.println();

        matrixA.minus(matrixA, matrixB, matrixResult, 0, 0);

        System.out.println("Разница матриц А и В:");
        matrixResult.printMatrix(matrixResult);
        System.out.println();

        matrixA.transpose(matrixA, matrixResult, 0, 0);

        System.out.println("транспонированная матрица А:");
        matrixResult.printMatrix(matrixResult);
        System.out.println();

        matrixResult.onceMatrix(matrixResult, 0, 0);

        System.out.println("Единичная матрица:");
        matrixResult.printMatrix(matrixResult);
        System.out.println();

        matrixA.printGetter(matrixA);
        System.out.println();

        matrixA.multiplicationMatrixs(matrixA, matrixB, matrixResult, 0, 0, 0);

        System.out.println("Произведение матриц А на матрицу В:");
        matrixResult.printMatrix(matrixResult);
        System.out.println();

        matrixA.multiplicationByNumber(matrixA, matrixResult, 0, 0, 10);

        System.out.println("Произведение матрицы А на 10:");
        matrixResult.printMatrix(matrixResult);
        System.out.println();
        matrixResult.zero(matrixResult, 0, 0);

        matrixA.square(matrixA, matrixResult, 0, 0, 0);

        System.out.println("Квадрат матрицы А:");
        matrixResult.printMatrix(matrixResult);
        System.out.println();
        matrixResult.zero(matrixResult, 0, 0);

        matrixA.cube(matrixA, matrixSquare, matrixResult, 0, 0, 0);

        System.out.println("Куб матрицы А:");
        matrixResult.printMatrix(matrixResult);
        System.out.println();
    }
}
