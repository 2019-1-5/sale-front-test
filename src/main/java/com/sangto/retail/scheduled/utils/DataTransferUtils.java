package com.sangto.retail.scheduled.utils;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Iterator;
import java.util.Map;


public class DataTransferUtils {
	
	private static final Log logger = LogFactory.getLog(DataTransferUtils.class);
	
	/**
	 * 拼写出base库给sangtoCrm库中写数据时的insert语句的列名和对应的值
	 * @param map  要插入的列和对应的数据组成的键值对
	 * @return
	 */
	public static String insertToCenterSqlstr(Map<String, Object> map){
		String keys = "", values ="";
		String Valuetemp = "" ;
		Iterator<String> iter = map.keySet().iterator();
		while (iter.hasNext()) {
			String key = (String) iter.next();
			Object value = map.get(key) ;
			System.err.println("key:" + key);
			System.err.println("value:" + value);
			if(value instanceof java.lang.String ){
				String objvalue = (String) map.get(key);
				Valuetemp = "\"" + execString(objvalue.trim()) + "\"" ; 
			}else if(value instanceof java.util.Date){
				Valuetemp = "'" + value + "'" ;
			}else{
				if (value == null) {
					Valuetemp = "null" ; 
				}else{
					Valuetemp = value.toString();
				}
			}
			keys = keys + ","+ key ; 
			values = values + "," + Valuetemp ; 
			
		}
		keys = keys.substring(1); 
		values = values.substring(1); 
		return "(" + keys + ") values (" + values+")" ;		
	}
	
	
	
	public static String execString(String str) {
		String resultStr = str;
		if(StringUtils.contains(str, "\\") || StringUtils.contains(str, "\"")) {
			resultStr = StringUtils.replace(resultStr, "\\", "\\\\"); 
			resultStr = StringUtils.replace(resultStr, "\"", "\\\""); 
		}
		logger.info("E:" + resultStr);
		return resultStr ; 
		
	}

}
