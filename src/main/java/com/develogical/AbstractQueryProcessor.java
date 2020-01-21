package com.develogical;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class AbstractQueryProcessor {

  public abstract Pattern getRegex();

  public abstract String getAnswer(Matcher parsedQuery);
}
