package com.hm.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *日期转换函数
 */
public class DateFormatUtils {

    //日期转换为字符串
    public static String dateToString(Date date , String patt){
        SimpleDateFormat sdf = new SimpleDateFormat(patt);
        String format = sdf.format(date);
        return  format;
    }

    //字符串转换为日期
    public static Date stringToDate(String str,String patt) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(patt);
        Date parse = sdf.parse(str);
        return parse;

    }
}
