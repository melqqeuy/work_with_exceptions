package io.githhub.melqqeuy;

import io.githhub.melqqeuy.math.Matrix;

public class Main {

    public static final String[][] MATRIX = {
            {"1", "2", "3", "4"} ,
            {"1", "2", "3", "4"} ,
            {"1", "2", "3", "4"} ,
            {"1", "2", "3", "4"}
    };
    public static final String[][] MATRIX_2 = {
            {"1", "2", "3", "4"} ,
            {"1", "2", "3", "4"} ,
            {"1", "2", "3", "4"}
    };
    public static final String[][] MATRIX_3 = {
            {"1", "2", "3", "4"} ,
            {"1", "2", "3", "4"} ,
            {"1", "2", "3"} ,
            {"1", "2", "3", "4"}
    };
    public static final String[][] MATRIX_4 = {
            {"1", "2", "hello", "4"} ,
            {"1", "2", "3", "4"} ,
            {"1", "2", "3", "4"} ,
            {"1", "2", "3", "4"}
    };

    public static void main(String[] args) {
        try {
            System.out.println("Сумма = " + Matrix.sumMatrix(MATRIX_4));
        }
        catch (Matrix.MyArraySizeException e) {
            System.out.println("Перехвачен MyArraySizeException: " + e.getMessage());
        }
        catch (Matrix.MyArrayDataException e) {
            System.out.println("Перехвачен MyArrayDataException: " + e.getMessage());
        }
    }


}
