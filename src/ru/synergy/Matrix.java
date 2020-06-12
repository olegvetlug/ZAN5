package ru.synergy;

public class Matrix {
    //поля класса
    int n = 0, m = 0;
    private int array[][];

    //перегруженный конструктор
    Matrix(int[][] array) {
        this.array = array;
        this.n = array.length;
        this.m = array[0].length;
    }

    //перегруженный конструктор
    Matrix(Matrix matrix) {
        this.array = matrix.array;
        this.n = matrix.n;
        this.m = matrix.m;
    }

    //конструктор по-умолчанию
    Matrix() {
        this.n = 2;
        this.m = 2;
        this.array = new int[n][m];
    }
    public int getN() {
//        return this.array.length;
        return n;
    }

    public int getM() {
//        return getN() > 0 ? this.array[0].length : 0;
        return m;
    }

    //сложение
    Matrix summa(Matrix matrixB) {
        if (this.getN() != matrixB.getN() || this.getM() != matrixB.getM()) {
            return null;
        }

        Matrix resultMatrix = new Matrix(new int[this.getN()][this.getM()]);
        for (int i = 0; i < resultMatrix.n; i++) {
            for (int j = 0; j < resultMatrix.m; j++) {
                resultMatrix.array[i][j] = this.array[i][j] + matrixB.array[i][j];
            }
        }
        return resultMatrix;
    }

    @Override
    public String toString() {
        String result = "Matrix{" +
                "n=" + n +
                ", m=" + m +
                ", array=\n";
        for (int i = 0; i < array.length; i++) {
            result += "(";
            for (int j = 0; j < array[i].length; j++) {
                result += this.array[i][j] + " ";
            }
            result += ")\n";
        }
        return result + '}' ;
    }

    Matrix minus(Matrix matrixB) {
        Matrix matrixResult = new Matrix(new int[this.getN()][this.getM()]);
        for (int i = 0; i < matrixResult.n; i++) {
            for (int j = 0; j < matrixResult.m; j++) {
                matrixResult.array[i][j] = this.array[i][j] - matrixB.array[i][j];
            }
        }
        return matrixResult;
    }

    Matrix transpose(Matrix matrixA) {
        Matrix matrixResult = new Matrix(new int[this.getN()][this.getM()]);
        for (int i = 0; i < this.getN(); i++) {
            for (int j = 0; j < this.getM(); j++) {
                matrixResult.array[i][j] = this.array[j][i];
            }
        }
        return matrixResult;
    }

    static Matrix oneMatrix(int e) {
        Matrix matrixResult = new Matrix(new int[e][e]);
        for (int i = 0; i < matrixResult.n; i++) {
            for (int j = 0; j < matrixResult.m; j++) {
                if (i == j)
                    matrixResult.array[i][j] = 1;
                else matrixResult.array[i][j] = 0;
            }
        }
        return matrixResult;
    }
    Matrix multiplicationMatrixs(Matrix matrixA,Matrix matrixB) {
        Matrix matrixResult = new Matrix(new int[this.n][matrixA.m]);
        for (int i = 0; i < matrixResult.n; i++){
            for (int j = 0; j < matrixResult.m; j++){
                for (int k = 0; k < matrixResult.n; k++) {
                    matrixResult.array[i][j] += this.array[i][k] * matrixB.array[k][j];
                }
            }
        }
        return matrixResult;
    }
    Matrix multiplicationByNumber(int k) {
        Matrix matrixResult = new Matrix(new int[this.n][this.m]);
        for (int i = 0; i < matrixResult.n; i++){
            for (int j = 0; j < matrixResult.m; j++){
                matrixResult.array[i][j] = this.array[i][j] * k;
            }
        }
        return matrixResult;
    }
    Matrix square(Matrix matrixA) {
        Matrix matrixResult = new Matrix(new int [this.getN()][this.getM()]);
        for (int i = 0; i < matrixResult.n; i++){
            for (int j = 0; j < matrixResult.m; j++){
                for (int k = 0; k < matrixResult.n; k++) {
                    matrixResult.array[i][j] += this.array[i][k] * this.array[k][j];
                }
            }
        }
        return matrixResult;
    }
    Matrix cube(Matrix matrixA) {
        Matrix matrixAA = new Matrix(new int[this.n][this.m]);
        matrixAA.array = this.array;
        Matrix matrixSquare = new Matrix(new int[this.n][this.m]);
        matrixSquare = matrixAA.square(matrixA);
        Matrix matrixResult1 = new Matrix(new int[this.n][this.m]);
        matrixResult1 = matrixSquare.multiplicationMatrixs(matrixA,matrixAA);
        return matrixResult1;
    }
}
