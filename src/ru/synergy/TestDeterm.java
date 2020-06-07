package ru.synergy;

import javax.security.auth.kerberos.DelegationPermission;

public class TestDeterm {
    public static void main(String[] args) {
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
    }
}
//=================
 class Determin {
    private double summ;

    public Determin(double[][] matrix) {
        getReduction(matrix, 1);
    }


    public void getValue() {
        System.out.printf("%.2f", this.summ);
        System.out.println("");

    }


    private void getReduction(double [][] subMinor, double elemParentMinor) {
        if (subMinor.length > 1){
            double [][] tmpMinor = new double[subMinor.length - 1][subMinor[0].length - 1];
            for (int c = 0; c < subMinor[0].length; c++) {
                for (int i = 1; i < subMinor.length; i++) {
                    for (int j = 0; j < subMinor[0].length; j++) {
                        if (j < c)
                            tmpMinor[i - 1][j] = subMinor[i][j];
                        else if (j > c)
                            tmpMinor[i - 1][j - 1] = subMinor[i][j];
                    }
                }
                double paramForSub = Math.pow(-1,c+2)*subMinor[0][c]*elemParentMinor;
                getReduction(tmpMinor, paramForSub);
            }
        }
        else
            this.summ += elemParentMinor * subMinor[0][0];
    }

}

