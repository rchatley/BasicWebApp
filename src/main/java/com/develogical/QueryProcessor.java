package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        else if (query.toLowerCase().contains("imperial")) {
            return "Imperial College London (legally Imperial College of Science, Technology and Medicine) " +
                    "is a public research university in London. Imperial grew out of Prince Albert's vision of an " +
                    "area for culture, including the Royal Albert Hall, Imperial Institute, numerous museums, " +
                    "and the Royal Colleges that would go on to form the college.[8][9] In 1907, Imperial College " +
                    "was established by Royal Charter, merging the Royal College of Science, Royal School of Mines, " +
                    "and City and Guilds College. In 1988, the Imperial College School of Medicine was formed by " +
                    "combining with St Mary's Hospital Medical School. In 2004, Queen Elizabeth II opened the Imperial " +
                    "College Business School. ";
        } else if (query.toLowerCase().contains("what is your name")) {
            return "Which github project do we use";
        }
        return "";
    }
}
