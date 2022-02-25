package com.company;

public class EXERCISE6 {

    int inputNum = 3;
    int[] beforeField = {2,3,2,1,3,5,7,8,7,8,2,6,3};

    int[] removeInputNum(int[] beforeField, int inputNum){
        int[] newField = new int[beforeField.length];
        for (int i = 0; i < beforeField.length; i++){
            if (beforeField[i] != inputNum){
                newField[i] = beforeField[i];
            } else {
                newField[i] = 0;
            }
        } return newField;
    }
    void go(){
        removeInputNum(beforeField, inputNum);
        for (int i = 0; i < removeInputNum(beforeField, inputNum).length; i++) {
            System.out.println(removeInputNum(beforeField, inputNum)[i]);
        }
    }
    public static void main(String[] args) {
        new EXERCISE6().go();
    }
}
