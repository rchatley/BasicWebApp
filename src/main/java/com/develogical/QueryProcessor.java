package com.develogical;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }

        if (query.toLowerCase().contains("imperial")) {
            return "Imperial College is a university in London";
        }

        if (query.toLowerCase().contains("name")) {
            return "FathomlessDepths";
        }

        if (query.toLowerCase().contains("largest")) {
            String[] numbers = query.split(":")[2].split(",");
            int max = 0;

            for (String number : numbers) {
                max = Math.max(max, Integer.parseInt(number.trim()));
            }

            return String.valueOf(max);
        }

        if (query.toLowerCase().contains("plus")) {
            Pattern pattern = Pattern.compile("what is (\\d) plus (\\d)");
            Matcher matcher = pattern.matcher(query.toLowerCase());

            if (matcher.find()) {
                int result = Integer.parseInt(matcher.group(1)) + Integer.parseInt(matcher.group(2));
                return String.valueOf(result);
            }

            return "No idea";
        }

        return "";
    }
}
