package ex_33_Collections_framework_dsa.List;

import java.util.ArrayList;
import java.util.List;

public class Lab_258_Al {

	public static void main(String[] args) {
	
		List l=new ArrayList();
        l.add("2");
        l.add("3");
        
        l.add("4");
        
        l.add("5");
        
        l.add("6");
        l.add("7");
        l.add(true);
       System.out.println(l);
       System.out.println(l.size());
       System.out.println(l.isEmpty());
       System.out.println(l.contains("2"));
       System.out.println(l.indexOf("3"));
       System.out.println(l.get(0));
       System.out.println(l.getFirst());
       System.out.println(l.getLast());
       System.out.println(l.lastIndexOf("4"));
       
       for(int i=0;i<l.size();i++)
       {
    	   System.out.println(l.get(i));
    	   
       }
       for(Object o:l) {
    	   System.out.println(o);
       }
       l.set(0, 1);
       System.out.println(l);
       l.remove(3);
       System.out.println(l);
       l.clear();
       System.out.println(l);
	}

}
