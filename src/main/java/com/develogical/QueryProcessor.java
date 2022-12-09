package com.develogical;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QueryProcessor {

    public String process(String query) {

        System.out.println("Received query:" + query);

        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }

        if (query.toLowerCase().contains("plus")) {
            return extractTwoNumbersAnd(query, (x, y) -> x + y);
        }

        if (query.toLowerCase().contains("multiplied by")) {
            return extractTwoNumbersAnd(query, (x, y) -> x * y);
        }

        if (query.toLowerCase().contains("largest")) {

            String list = query.split(":")[1];

            String[] numbers = list.split(",|\\?");
            return String.valueOf(Arrays.stream(numbers).map(String::trim).mapToInt(Integer::parseInt).max());
        }

        if (query.toLowerCase().contains("name")) {
            return "RobTest";
        }
        return "";
    }

    private String extractTwoNumbersAnd(String query, BinaryOperator<Integer> func) {
        Pattern twoNumbers = Pattern.compile("What is (\\d+) (plus|multiplied by) (\\d+)?");
        Matcher matcher = twoNumbers.matcher(query);
        if (matcher.find()) {
            int a = Integer.parseInt(matcher.group(1));
            int b = Integer.parseInt(matcher.group(3));
            return String.valueOf(func.apply(a, b));
        }
        return null;
    }
}
