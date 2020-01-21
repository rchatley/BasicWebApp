package com.develogical;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ComparisonProcessor extends AbstractQueryProcessor {
    @Override
    public Pattern getRegex() {
        return Pattern.compile("which of the following numbers is the largest: ([0-9, ]+)");
    }

    @Override
    public String getAnswer(Matcher parsedQuery) {
        String[] numbers = parsedQuery.group(1).split(", ");
        int max = Arrays.stream(numbers)
                .mapToInt(Integer::parseInt)
                .max().getAsInt();
        return String.valueOf(max);
    }
}
