package com.gafurova.trainee;

import java.util.Scanner;

public class InputNumber {
    public void inputNumber(Scanner in) {
        System.out.println("Введите число и нажмите Enter");
        int num = Integer.parseInt(in.nextLine());
        if (num > 7) {
            System.out.println("Привет");
        }
    }
}
