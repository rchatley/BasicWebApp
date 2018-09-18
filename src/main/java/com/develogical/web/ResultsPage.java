package com.develogical.web;

import java.io.PrintWriter;

public class ResultsPage extends HtmlPage {

    private final String query;
    private final String answer;

    public ResultsPage(String query, String answer) {
        this.query = query;
        this.answer = answer;
    }

    @Override
    protected void writeContentTo(PrintWriter writer) {

        if (answer == null || answer.isEmpty()) {
            writer.println("<h1>Sorry</h1>");
            writer.print("<p>Sorry, we didn't understand <em>" + query + "</em></p>");
        } else {
            writer.println("<h1>" + query + "</h1>");
            writer.println("<p>" + answer + "</p>");
        }

        writer.println("<p><a href=\"/\">Back to Search Page</a></p>");
    }
}
