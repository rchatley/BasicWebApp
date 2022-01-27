package com.develogical;

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

        return "";
    }
}
