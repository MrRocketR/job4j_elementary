package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1:
        name = "Понедельник";
        break;
            case 2:
        name = "Вторник";
        break;
            case 3:
        name = "Среда";
        break;
            case 4:
        name = "Среда";
        break;
            case 5:
        name = "Среда";
        break;
            case 6:
        name = "Среда";
        break;
            case 7:
        name = "Среда";
        break;
            default:
        name = "Ошибка";
        break;
        }
        return name;
    }

    public static void main(String[] args) {
        System.out.println(nameOfDay(28));
    }
}
