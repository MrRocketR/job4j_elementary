package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
            String point = array[i];
            if (point == null) {
                int j = i + 1;
                while (j < array.length && array[j] == null) {
                    j++; }
                if (j < array.length) {
                    array[i] = array[j];
                    array[j] = null;
                }
            }
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}