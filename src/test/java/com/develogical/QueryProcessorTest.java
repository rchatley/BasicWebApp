package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsAboutImperial() throws Exception {
        assertThat(queryProcessor.process("name"),
                containsString("TestTwo"));
    }

    @Test
    public void canAddUp() throws Exception {
        assertThat(queryProcessor.process("What is 14 plus 3?"),
                containsString("17"));
    }

    @Test
    public void canMultiply() throws Exception {
        assertThat(queryProcessor.process("What is 7 multiplied by 3?"),
                containsString("21"));
    }

    @Test
    public void canFindLargest() throws Exception {
        assertThat(queryProcessor.process("Which of the following numbers is the largest: 45, 101, 25, 58, 76, 12, 80, 94?"),
                containsString("101"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }
}
