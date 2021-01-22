package edu.cnm.deepdive;

public class MultiDimensionalArrays {

  public static void main(String[] args) {
    // one dimensional array
    int[] myArray = {0, 1};

    // two dimensional array
    int[][] array = new int[2][4];// 2 rows and 4 columns
    int[][] anotherArray = new int[2][4];

    int[] myIntArray[] = new int[2][4];// is accepted as a two dimensional array but not good practice.
    //asymmetrical array
    String[][] my2ndArray = new String[][] {
        {"One", "Two"},// first row has two elements
        {"Three", "Four", "Five"},//2nd row has three elements
        {"Six", "Seven", "Eight", "Nine"},//3rd row has four elements
        null//4rd row has zero elements.
    };


    int[][] numberTable = new int[2][3];
    numberTable[0][0] = 1;
    numberTable[0][1] = 2;
    numberTable[0][2] = 3;
    //numberTable[0][3] = 4; will throw an ArrayOutOfBoundsException

    //three dimensional array
    //pages (planes), rows, columns
    int[][][] threeArray = new int[3][3][3]; //3 pages, 3 rows, 3 columns like a Rubik's cube
    int oneMoreThreeArray[][][] = new int[3][3][3];//also accepted.
    int[] anotherThreeArray[][]; // accepted but not good practice.

    int[][][] threeDArray = {
        {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},// first page with three rows of each tree columns.
        {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
        {{19, 20, 21}, {22, 23, 24}}// 3rd page with two rows of each three columns.
    };
  }
 }
