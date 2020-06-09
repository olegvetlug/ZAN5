package ru.synergy;

public class Matrix2 {
    //поля класса
    int n, m;
    int array[][] = new int[n][m];

    //перегруженный конструктор
    Matrix2(int n, int m, int[][] array) {
        this.n = n;
        this.m = m;
        this.array[n][m] = array[n][m];
    }

    //конструктор по-умолчанию
    Matrix2() {
        this.n = 2;
        this.m = 2;
    }

    //сложение
    void summa(Matrix2 matrixA, Matrix2 matrixB, Matrix2 matrixResult, int i, int j) {
        matrixResult.n = Math.max(matrixA.n, matrixB.n);
        matrixResult.m = Math.max(matrixA.m, matrixB.m);
        matrixResult.array = new int[matrixResult.n][matrixResult.m];
        for (i = 0; i < matrixResult.n; i++)
            for (j = 0; j < matrixResult.m; j++) {
                matrixResult.array[i][j] = matrixA.array[i][j] + matrixB.array[i][j];
            }
    }

    //вычитание
    void minus(Matrix2 matrixA, Matrix2 matrixB, Matrix2 matrixResult, int i, int j) {
        matrixResult.n = Math.max(matrixA.n, matrixB.n);
        matrixResult.m = Math.max(matrixA.m, matrixB.m);
        matrixResult.array = new int[matrixResult.n][matrixResult.m];
        for (i = 0; i < matrixResult.n; i++)
            for (j = 0; j < matrixResult.m; j++) {
                matrixResult.array[i][j] = matrixA.array[i][j] - matrixB.array[i][j];
            }
    }

    //вывод матрицы
    void printMatrix(Matrix2 matrix) {
        for (int i = 0; i < matrix.n; i++) {
            for (int j = 0; j < matrix.m; j++) {
                System.out.print(" " + matrix.array[i][j] + " ");
            }
            System.out.println();
        }
    }

    //транспонирование матрицы
    void transpose(Matrix2 matrixA, Matrix2 matrixResult, int i, int j) {
        for (i = 0; i < n; i++)
            for (j = 0; j < m; j++) {
                matrixResult.array[i][j] = matrixA.array[j][i];
            }
    }

    //вывод единичной матрицы
    void onceMatrix(Matrix2 matrixResult, int i, int j) {
        for (i = 0; i < n; i++)
            for (j = 0; j < m; j++) {
                if (i == j)
                    matrixResult.array[i][j] = 1;
                else matrixResult.array[i][j] = 0;
            }
    }

    //вывод геттеров
    void printGetter(Matrix2 matrixResult) {
        System.out.println("Количество строк в матрице A:" + matrixResult.n);
        System.out.println("Количество столбцов в матрице A:" + matrixResult.m);
    }

    //умножение на матрицу
    void multiplicationMatrixs(Matrix2 matrixA, Matrix2 matrixB, Matrix2 matrixResult, int i, int j, int k) {
        matrixResult.n = matrixA.n;
        matrixResult.m = matrixB.m;
        for (i = 0; i < matrixResult.n; i++)
            for (j = 0; j < matrixResult.m; j++)
                for (k = 0; k < matrixResult.n; k++) {
                    matrixResult.array[i][j] += matrixA.array[i][k] * matrixB.array[k][j];
                }
    }

    //умножение на число
    void multiplicationByNumber(Matrix2 matrixA, Matrix2 matrixResolt, int i, int j, int k) {
        for (i = 0; i < matrixResolt.n; i++)
            for (j = 0; j < matrixResolt.m; j++)
                matrixResolt.array[i][j] = matrixA.array[i][j] * k;
    }

    //обнуление матрицы
    void zero(Matrix2 matrix, int i, int j) {
        for (i = 0; i < matrix.n; i++)
            for (j = 0; j < matrix.m; j++)
                matrix.array[i][j] = 0;
    }

    //квадрат матрицы
    void square(Matrix2 matrixA, Matrix2 matrixResult, int i, int j, int k) {
        matrixResult.n = matrixA.n;
        matrixResult.m = matrixA.m;
        for (i = 0; i < matrixResult.n; i++)
            for (j = 0; j < matrixResult.m; j++)
                for (k = 0; k < matrixResult.n; k++)
                    matrixResult.array[i][j] += matrixA.array[i][k] * matrixA.array[k][j];
    }

    //куб матрицы
    void cube(Matrix2 matrixA, Matrix2 matrixSquare, Matrix2 matrixResult, int i, int j, int k) {
        matrixA.multiplicationMatrixs(matrixA, matrixA, matrixResult, 0, 0, 0);
        matrixSquare = matrixResult;
        matrixResult.multiplicationMatrixs(matrixA, matrixSquare, matrixResult, 0, 0, 0);
    }
}
