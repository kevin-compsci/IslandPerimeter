/*
Kevin Nguyen
A basic program where given a matrix, check if the diagonals are the same value

How to run (linux):
	1.) open command line and cd into directory folder of where this code is
	2.) type in "javac *.java" to compile java files
	3.) type in "java ToeplitzMatrix"
*/

//imports
import java.io.*;
import java.util.*;

//class
class ToeplitzMatrix {
	//Global Declarations

	//main driver
	public static void main(String[] args) {
		//local Declarations
		
		//get matrix

		//call isToeplitzMatrix

		//result output
	}

    public boolean isToeplitzMatrix(int[][] matrix) {
        //local declarations
        int i = 0, j = 0, k = 0, v = 0, rowLimit = matrix.length, colLimit = 0, tgt = 0;
        boolean good = true;
        
        //empty case
        if(matrix.length < 1) {
            return true;
        }
        
        //iterate over rows
        while(i < rowLimit && good) {
            colLimit = matrix[i].length;
            //iterate over cols
            while(j < colLimit && good) {
                k = i; v = j;
                tgt = matrix[k][v];
                //go diagonally
                while(good) {
                    //conditional to ensure bounds are maintained
                    if(k >= rowLimit || v >= colLimit) {
                        break;
                    }
                    //check diagonal
                    if(matrix[k][v] != tgt) {
                        good = false;
                        break;
                    }
                    // System.out.println(matrix[k][v]);
                    k++; v++;
                }
                j++;
            }
            i++; j=0;
        }
        return good;   
    }
}