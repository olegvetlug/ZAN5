package ru.synergy;

public class Main {

            public static void main(String[] args) {
                int[][] squarMatrix = {{1, 2},
                                       {3, 4}};
                for (int i = 0; i < squarMatrix.length; i++) {
                    for (int j = 0; j < squarMatrix[i].length; j++) {
                        System.out.print(squarMatrix[i][j] + " ");
                    }
                    System.out.println("");
                }
            }
        }


