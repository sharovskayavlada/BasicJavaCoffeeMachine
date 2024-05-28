package org.example;

import java.awt.color.ProfileDataException;
import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeMachineMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вы хотите включить кофеварку? 1) Да. 2) Нет.");
        int a = scanner.nextInt();
        switch (a) {
            case 1: System.out.println("Кофеварка включена");
                break;
            case 2: System.out.println("Кофеварка выключена");
                break;
            default: System.out.println("Упс! Такой функции не предусмотрено. Попробуйте еще раз!");
        }


        System.out.println("1) Создать свой напиток; 2) Приготовить Эспрессо; 3) Приготовить Капучино; 4) Очистка кофе машины");
        int b = scanner.nextInt();
        switch (b) {
            case 1: System.out.println(",");
                break;
            case 2: System.out.println("-");
                break;
            case 3: System.out.println("+");
                break;
            case 4: System.out.println("mn");
                break;
            default: System.out.println("Упс! Такой функции не предусмотрено. Попробуйте еще раз!");
        }
    }
}



