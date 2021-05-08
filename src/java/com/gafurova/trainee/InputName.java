package com.gafurova.trainee;

import java.util.Scanner;

public class InputName {
    public void inputName(Scanner in) {
        System.out.println("Введите имя и нажмите Enter");
        String name = in.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}

