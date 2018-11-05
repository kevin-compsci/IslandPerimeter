/*
Kevin Nguyen
A basic program where given a matrix, determine the perimeter of an island.

How to run (linux):
	1.) open command line and cd into directory folder of where this code is
	2.) type in "javac *.java" to compile java files
	3.) type in "java IslandPerimeter"
*/

//imports
import java.io.*;
import java.util.*;

//class
class IslandPerimeter {
	//Global Declarations

	//main driver
	public static void main(String[] args) {
		//local Declarations
		
		//get matrix

		//call islandPerimeter function

		//result output
	}

    //IslandPerimeter will return the value (int) of the perimeter of the island given a matrix
    public int islandPerimeter(int[][] grid) {
        //local declarations
        int i = 0, j = 0, rowLimit = grid.length, colLimit = 0, k = 0, v = 0, perim = 0;
        
        //empty case
        if(grid.length < 1) {
            return 0;
        }
        
        //iteate over rows
        while(i < rowLimit) {
            colLimit = grid[i].length;
            //iterate over cols
            while(j < colLimit) {
                k = i; v = j;
                
                if(grid[i][j] == 1) {
                    //check left
                    v--;
                    if(v < 0) {
                        perim++;
                    }
                    else {
                        if(grid[k][v] == 0) {
                            perim++;
                        }
                    }

                    //check right
                    v = j; v++;
                    if(v >= colLimit) {
                        perim++;
                    }
                    else {
                        if(grid[k][v] == 0) {
                            perim++;
                        }
                    }

                    //check top
                    v = j; k--;
                    if(k < 0) {
                        perim++;
                    }
                    else {
                        if(grid[k][v] == 0) {
                            perim++;
                        }
                    }

                    //check bot
                    k = i; k++;
                    if(k >= rowLimit) {
                        perim++;
                    }
                    else {
                        if(grid[k][v] == 0) {
                            perim++;
                        }
                    }
                }
                j++;
            }
            i++; j=0;
        }
        return perim;
    }
}