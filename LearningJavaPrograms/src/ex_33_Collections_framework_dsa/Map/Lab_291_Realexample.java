package ex_33_Collections_framework_dsa.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Lab_291_Realexample {

	public static void main(String[] args) {
	
		Map<String,Object> student1 = new HashMap();
        student1.put("name","Diwakar");
        student1.put("phone",9876543210l);
        student1.put("address1","Bangalore");
        student1.put("address2",560021);
        
        Map<String,Object> student2 = new HashMap();
        student2.put("name","Lukcy");
        student2.put("phone","96789876");
        student2.put("address1","Delhi");
        student2.put("address2",345);

        List students = new ArrayList();
        students.add(student1);
        students.add(student2);
        System.out.println(students);
        
        Set book_read_items = new HashSet();
        book_read_items.add("Rich dad Poor Dad");
        book_read_items.add("Sapaiens");
        book_read_items.add("Secret");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Eat the Frog");
        System.out.println(book_read_items);
        


	}

}
