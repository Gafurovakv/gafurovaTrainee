package com.gafurova.trainee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        InputNumber inputNumber = new InputNumber();
        inputNumber.inputNumber(in);
        InputName inputName = new InputName();
        inputName.inputName(in);
        InputArray inputArray = new InputArray();
        inputArray.inputArray(in);
        in.close();
    }
}
