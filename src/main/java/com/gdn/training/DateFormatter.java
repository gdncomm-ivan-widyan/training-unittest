package com.gdn.training;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {
  public static String getFormattedYearMonth(Date date){
    if(date == null){
      throw new IllegalArgumentException("date is null");
    }
    return new SimpleDateFormat("yyyy-MM").format(date);
  }
}
