package ru.job4j.tracker.test;

public class SimpleStringEncoder {
    public static void main(String[] args) {
        String result = encode("a");
        System.out.println(result);
    }

    public static String encode(String input) {
        StringBuilder result = new StringBuilder();
        char symbol = input.charAt(0);
        int counter = 1;
        int cycle = 0;
        if (input.length() == 1) {
            result.append(symbol);
            return result.toString();
        }
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
            } else {
                if (counter == 1) {
                    result.append(input.charAt(i - 1));
                } else {
                    result.append(input.charAt(i - 1)).append(counter);
                }
                symbol = input.charAt(i);
                counter = 1;
            }
            cycle++;
        }
        if (cycle == input.length() - 1) {
            if (counter == 1) {
                result.append(input.charAt(cycle));
            } else {
                result.append(input.charAt(cycle - 1)).append(counter);
            }
        }
        return result.toString();
    }
}
