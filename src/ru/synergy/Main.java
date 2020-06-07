package ru.synergy;

public class Main {
            public static void main(String[] args) {
                int[][] squarMatrix = {{1, 2},
                                       {3, 4}};
                int [][] twoDimArray1 = {{1,0,0,0},{0,1,0,0},{0,0,0,0}};//объявляем две матрицы
                int[][] twoDimArray2 = {{1,2,3},{1,1,1},{0,0,0},{2,1,0}};
//процесс умножения матриц
                int[][]twoDimArray3 = new int [twoDimArray1.length][twoDimArray2[0].length];
                double [][] mat4 = {
                        {1.0,1.0,-1.0,-1.0},
                        {2.0,1.0,2.0,3.0},
                        {3.0,4.0,5.0,6.0},
                        {5.0,7.0,8.0,9.0}
                };
                double [][] mat3 = {
                        {1.0,2.0,3.0},
                        {4.0,5.0,6.0},
                        {7.0,8.0,9.0}
                };
                double [][] mat2 = {
                        {1,2},
                        {3,4},
                };
                Determin dd = new Determin(mat4);
                dd.getValue();
                Determin aa = new Determin(mat2);
                aa.getValue();
                Determin bb = new Determin(mat3);
                bb.getValue();


                int k;
                for (int i = 0; i<twoDimArray3[0].length; i++)
                    for (int j=0; j<twoDimArray3.length; j++)
                        for (k=0; k<twoDimArray1[0].length; k++)
                            twoDimArray3[i][j] = twoDimArray3[i][j] + twoDimArray1[i][k] * twoDimArray2[k][j];

//вывод на экран
                for (int i = 0; i < twoDimArray3.length; i++) {
                    for (int j = 0; j < twoDimArray3[0].length; j++) {
                        System.out.print(" " + twoDimArray3[i][j] + " ");
                    }
                    System.out.println();
                for (int i1 = 0; i1 < squarMatrix.length; i1++) {
                    for (int j = 0; j < squarMatrix[i1].length; j++) {
                        System.out.print(squarMatrix[i1][j] + " ");
                    }
                    System.out.println("");
                }
            }
        }
        }



