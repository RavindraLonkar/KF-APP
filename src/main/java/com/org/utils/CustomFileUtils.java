package com.org.utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

public class CustomFileUtils<T> {
	
	Calendar localCalendar = Calendar.getInstance(TimeZone.getDefault());
	SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	
	public List<T> getMappedObjectList(String fileContent, T object, String headerString) {
		Map<String, String> map = null;
		List<T> dataList = new ArrayList<T>();
		try {
			String splitLines[] = fileContent.split("\\r\\n");
			String splitHeader[] = headerString.split(",");

			for (int i = 0; i < splitLines.length; i++) {
				map = new HashMap<String, String>();
				String splitData[] = splitLines[i].split(",");
				for (int j = 0; j < splitData.length; j++) {
					map.put(splitHeader[j], splitData[j]);
				}

				Gson gson = new Gson();
				JsonElement json = gson.toJsonTree(map);
				object = (T) gson.fromJson(json, object.getClass());

				dataList.add(object);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dataList;
	}
	
	public int getPrDay() {
		return localCalendar.get(Calendar.DATE);
	}
	
	public int getPrWeek() {
		return localCalendar.get(Calendar.DAY_OF_WEEK);
	}
	
	public Date getPrTime() {
		return localCalendar.getTime();
	}
	
	public String getDate() {
		    Date date = new Date();
		    return dateFormat.format(date);
	}
	
	public int getPrYear() {
		return Calendar.getInstance(TimeZone.getDefault()).get(Calendar.YEAR);
	}
	public int getYear(int pi_Week) {
		if (pi_Week >= 30 && pi_Week <= 52) {
			return Calendar.getInstance(TimeZone.getDefault()).get(Calendar.YEAR);
		} else {
			return Calendar.getInstance(TimeZone.getDefault()).get(Calendar.YEAR) - 1;
		}
	}

}
