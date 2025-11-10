package ex_33_Collections_framework_dsa.Map.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class Lab_275_Hashmap {

	public static void main(String[] args) {
   //Map m1 = new Map();
      Map m1 = new HashMap(20);
      // Map is key and value pair
      // name -> pramod
      m1.put("name","pramod");
      m1.put("rollno",1);
      m1.put("phone",987654321);
      
//    m1.put(34,90);
    System.out.println(m1);

	}

}
