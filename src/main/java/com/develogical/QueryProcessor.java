package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an "
                    + "English poet, playwright, and actor, widely regarded as the greatest "
                    + "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.toLowerCase().contains("largest")) {
            String[] parts = query.split("[:,]");

            int largest = 0;
            for (int i = 1; i < parts.length; i++) {
                String y = parts[i].replace(" ", "");
                int x = Integer.parseInt(y);
                if (x > largest) {
                    largest = x;
                }
            }
            
            return String.valueOf(largest);
        }
        return "";
    }
}
