package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        percent = percent / 100;
        int year = 0;
        while (amount > 0)         {
            amount = (amount  * percent) + amount;
            amount = amount -  salary;
            year++;
        }
        return year;
    }
}