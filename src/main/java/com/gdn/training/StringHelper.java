package com.gdn.training;

import java.util.List;
import java.util.stream.Collectors;

public class StringHelper {
  public static List<String> toUpperCase(List<String> strings){
    return strings.stream()
        .filter(s -> s != null)
        .map(word -> word.toUpperCase())
        .collect(Collectors.toList());
  }
}
