package com.farwolf.updater.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtil {

	
	
	public static String timestamp()
	{
	   return	System.currentTimeMillis()+"";
	}
	
	public static String now()
	{
		 
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	
		return sd.format(Calendar.getInstance().getTime());
	}
	
	public static String date()
	{
		
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");	
		return sd.format(Calendar.getInstance().getTime());
	}
	public static String date(int k)
	{
		

		return getTime(date(), "yyyy-MM-dd", "yyyy-MM-dd", Calendar.DAY_OF_YEAR, k);
		
	}
	
	
	public static String getTime(String time,String inputformat,String oupuformat,int unit,int k)
	{
		
		SimpleDateFormat sd=new SimpleDateFormat(inputformat);	
		SimpleDateFormat osd=new SimpleDateFormat(oupuformat);	
		 
		Calendar ca=Calendar.getInstance();
		try {
			ca.setTime(sd.parse(time));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ca.add(unit, k);
		return osd.format(ca.getTime());
	}
	
	public static int getDayOfWeek(String time)
	{
		 
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	
		try {
			Calendar ca= Calendar.getInstance();
			ca.setTime(sd.parse(time));
			return ca.get(Calendar.DAY_OF_WEEK);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}
}
