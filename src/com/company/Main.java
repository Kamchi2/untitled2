package com.company;

import static java.lang.Math.random;

public class Main {
    //Главный метод
    public static void main(String[] args) {
        // обычные переменные
        int temperature = 2;
        int yearOld = 11;
        // финальные
        final int max = 100;
        final int min = 1;
        // вызов метода metod
        metod(2, 11);
        // вызовы метода met
        met(2, 11);
        met(-4, 16);
        met(5, 20);
        met(-8, 28);
        met(4, 47);
        // вызов генератора возраста
        generateRandomAge(1, 100, 10);
        // вызов генератора температуры
        generateRandomTemperature(1, 50, -30, yearOld);
    }
    // метод metod
    public static int metod(int temperature, int yearOld) {
        return temperature + yearOld;
    }
// метод met
    public static void met(int temperature, int yearOld) {
        // условные операторы if else if else и &&
        if (yearOld > 20 && yearOld < 45 && temperature > -20 && temperature < 30) {
            System.out.println("Можно идти гулять");

        } else if (yearOld < 20 && temperature > 0 && temperature < 28) {
            System.out.println("Можно идти гулять");

        } else if (yearOld > 45 && temperature > -10 && temperature < 25) {
            System.out.println("Можно идти гулять");

        } else {
            System.out.println("Оставайтесь дома");
        }
    }
// генератор возраста
    public static int generateRandomAge(int yearOld, int max, int min) {
        yearOld = (int) (Math.random() * (max - min + 1) + min);
// возращение сгенерированного возраста
        return yearOld;
    }
    // генератор температуры
    public static int generateRandomTemperature(int temperature, int maxt, int mint, int yearOld) {
        temperature = (int) (Math.random() * (maxt - mint + 1) + mint);
        met(temperature, yearOld);
// возращение сгенерированной температуры
        return temperature;
    }
}