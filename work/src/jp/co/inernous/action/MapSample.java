package jp.co.inernous.action;

import java.util.HashMap;
import java.util.Map;

public class MapSample {

	public static void main(String[] args) {
	Map<String,String>map= new HashMap<String,String>();
	
	map.put("Key1", "value1");
	map.put("Key2", "value2");
	map.put("Key3", "value3");
	map.put("Key4", "value4");
	map.put("Key5", "value5");
	
	String value =map.get("Key1");
	System.out.println(value);
	
	String valueNull=map.get("Key6");
	System.out.println(valueNull);
	
	if(map.containsKey("Key1")){
		
	System.out.println("key1は存在します");
	}else{
		System.out.println("Key1は存在しません");
	}
	
	for(Map.Entry<String,String>e:map.entrySet()){
		System.out.println(e.getKey()+":"+e.getValue());}
	}
	
	}

