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
        assertThat(queryProcessor.process("Imperial"),
                containsString("university"));
    }

    @Test
    public void knowsName() throws Exception {
        assertThat(queryProcessor.process("what is your name"), containsString("FathomlessDepths"));
    }

    @Test
    public void canLargest() throws Exception {
        assertThat(queryProcessor.process("35e30090: which of the following numbers is the largest: 100, 500, 120, -5"), is("500"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

    @Test
    public void canAddNumbers() throws Exception {
        assertThat(queryProcessor.process("what is 2 plus 2"), containsString("4"));
    }
}
