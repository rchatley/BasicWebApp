package com.develogical;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

public class QueryProcessor {

    List<AbstractQueryProcessor> queryProcessors = new ArrayList<>();

    public QueryProcessor() {
        queryProcessors.add(new ComparisonProcessor());
    }

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        for (AbstractQueryProcessor processor: queryProcessors) {
            Matcher matcher = processor.getRegex().matcher(query);
            if (matcher.find()) {
                return processor.getAnswer(matcher);
            }
        }
        return "";
    }
}
