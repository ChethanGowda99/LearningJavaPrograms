package ex_33_Collections_framework_dsa.Map.Treemap;

import java.util.Map;
import java.util.TreeMap;

public class Lab_290 {

	public static void main(String[] args) {
		

        Map m3 = new TreeMap();
        m3.put("firstname","pramod");
        m3.put("lastname","dutta");
        m3.put("rollno",1);
        m3.put("phone",987654321);
        System.out.println(m3);



		 // Creating TreeMap
        Map<String, Integer> values = new TreeMap();
        // Insert elements (note the order)
        values.put("Second", 2);
        values.put("First", 1);
        values.put("Third", 3);
        System.out.println("TreeMap (sorted by keys): " + values);

        // Replacing values
        values.replace("First", 11);
        values.replace("Second", 22);
        System.out.println("After replacement: " + values);
        // Remove element
        int removedValue = values.remove("First");
        System.out.println("Removed Value: " + removedValue);
        System.out.println("Final map: " + values);


	}

}
