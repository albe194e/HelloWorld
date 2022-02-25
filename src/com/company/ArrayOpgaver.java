package com.company;

public class ArrayOpgaver {

    void runProgram(){
        // String[] names = {"Jonas","Tina","Tom","Steve","Amanda","Hanna","Rebecca","Carl"};

        //EXERCISE 3
        /*
        for (int i = names.length - 1; i <= names.length && i > -1; i--){
            System.out.println(names[i]);
        }

         */
        //EXERCISE 4
        /*
        int[] values = new int[25];
        for (int i = 0; i < values.length; i++) {
            if (i % 2 != 0){
                values[i] = 1;
            } else {
                values[i] = i;
            }
            System.out.print(values[i] + " ");

         */
        //EXERCISE 5
        /*
        int[]field={2,20,3,13,15,3,9,10,1,5,8};

        for (int i = 0; i < field.length; i++){
            if (field[i] % 2 != 0){
                System.out.println(field[i]);
            }
        }
         */


    }

    public static void main(String[] args) {
        new ArrayOpgaver().runProgram();

    }
}
