package com.company;

public class EXERCISE7 {
    int inNum = 3;
    int[] field = {2,3,2,5,3,1};

    int[] increaseValues(int[] increaseValues, int inNum){
        int[] newField = new int[increaseValues.length];
        for (int i = 0; i < increaseValues.length; i++){
            if (i > 0 && i < 5){
                newField[i] = increaseValues[i] * inNum;
            } else {
                newField[i] = increaseValues[i];
            }
        } return newField;
    }
    void runProgram(){
        for (int i = 0; i < increaseValues(field, inNum).length; i++) {
            System.out.println(increaseValues(field, inNum)[i]);
        }
    }
    public static void main(String[] args) {
        new EXERCISE7().runProgram();
    }
}
