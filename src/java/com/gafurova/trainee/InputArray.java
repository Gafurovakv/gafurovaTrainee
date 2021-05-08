package com.gafurova.trainee;

import java.util.Scanner;

public class InputArray {
    public void inputArray(Scanner in) {
        System.out.println("Введите через запятую числа и нажмите Enter");
        String input = in.nextLine();
        String[] inputArray = input.split(",");
        for (String stringNumber : inputArray) {
            int number = Integer.parseInt(stringNumber);
            if (number % 3 == 0) {
                System.out.print(number + " ");
            }
        }
    }
}
