package com.example.producer;

import java.util.Arrays;
import java.util.List;

public abstract class StringUtils {

  public static final String EMPTY = "";

  public static final String nvl(final String str) {
    return nvl(str, EMPTY);
  }
  public static final String nvl(final String str, final String def) {
    return null == str || EMPTY.equals(str)
        ? def
        : str;
  }

  public static final List<String> toList(String... strings) {
    return Arrays.asList(strings);
  }

}
