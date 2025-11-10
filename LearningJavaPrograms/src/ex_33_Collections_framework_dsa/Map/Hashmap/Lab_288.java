package ex_33_Collections_framework_dsa.Map.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class Lab_288 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<String,Integer> map = new HashMap();
	        map.put("id", 1);
	        map.put("id2", 2);
	        map.put("id3", 34);
	        map.put("id4", null);
	        map.put("id5", null);
	        map.put(null, 100);
	        System.out.println(map.size());
	        for(Map.Entry<String,Integer> item:  map.entrySet()){
	            System.out.println(item.getKey() + " -> " +item.getValue());
	        }


	}

}
