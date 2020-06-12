package ru.synergy;

public class MatrixRunner {
    public static void main(String[] args) {
        Matrix matrixA = new Matrix ( new int[][] { { 1 , 2 } , { 3 , 4 } } );
        System.out.println ( matrixA );
        Matrix matrixB = new Matrix ( new int[][] { { 10 , 20 } , { 30 , 86 } } );
        System.out.println ( matrixB );
        Matrix matrixE = new Matrix ( new int[][] { { 0 , 0 } , { 0 , 0 } } );


        Matrix summa = matrixA.summa ( matrixB );
        System.out.println ( "Сумма " + summa );
        System.out.println ();
        Matrix minus = matrixA.minus ( matrixB );
        System.out.println ( "Разность " + minus );
        System.out.println ();
        Matrix transpose = matrixA.transpose ( matrixA );
        System.out.println ( "Транспонирование " + transpose );
        System.out.println ();
        Matrix oneMatrix = matrixE.oneMatrix ( 2 );
        System.out.println ( "Единичная " + oneMatrix );
        System.out.println ();
        Matrix multiplicationMatrixs = matrixA.multiplicationMatrixs ( matrixA, matrixB );
        System.out.println ("произведение матриц "+multiplicationMatrixs );
        System.out.println ();
        Matrix multiplicationByNumber = matrixA.multiplicationByNumber (10);
        System.out.println ("умножение на число 10 "+multiplicationByNumber);
        Matrix square = matrixA.square ( matrixA);
        System.out.println ("matrixA^2 "+ square);
        Matrix cube = matrixA.cube( matrixA );
        System.out.println ("matrixA^3 "+ cube);



    }
}
