package com.example.task_hard;

public class Main {
    public static void main(String[] args) {
        int start = 1000;//Диапазон чисел
        int end = 100000;

        int count = findNumbers(start, end);
        System.out.println("Amount of numbers: " + count);
    }

    public static int findNumbers(int start, int end) {// Поиск
        int count = 0;

        for (int num = start; num <= end; num++) {
            int sum = calculateSum(num);
            double square= Math.sqrt(sum);

            if (sum % 2 == 0 && sum % 6 == 0 && square % 1 == 0) {//условие делимости
                System.out.println(num);
                count++;// Количество
            }
        }

        return count;
    }

    public static int calculateSum(int num) {//Сумма цифр
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}