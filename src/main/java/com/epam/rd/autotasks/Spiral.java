package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int j = 1;
        int counter = 0;
        int right,down,left,up;

        int[][] arr = new int[rows][columns];

        for(int i=0; i<(rows+1)/2; ){

            for( right=i; right<columns-counter; right++){
                arr[i][right] = j;
                j++;
            }

            if (j>rows*columns)
                break;

            i++;
            for( down = i; down<rows-counter; down++){
                arr[down][right-1] = j;
                j++;
            }

            if (j>rows*columns)
                break;

            for( left = right-2; left>=counter; left--){
                arr[down-1][left] = j;
                j++;
            }

            if (j>rows*columns)
                break;

            counter++;
            for( up = down-2; up>=counter; up--){
                arr[up][left+1] = j;
                j++;
            }

            if (j>rows*columns)
                break;

        }

        return arr;
    }
}
