package ex_27_Generics;

import java.util.ArrayList;
import java.util.List;

public class Lab_218_Generics_List
{
    public static void main(String[] args) {
        List normalList = new ArrayList();
        normalList.add(10);
        normalList.add("Pramod");
        normalList.add(true);

        List<Integer> integerList = new ArrayList();
        integerList.add(10);
        // integerList.add("Pramod");
    }
}

// List - Collection Framework ->collection of items -> 12,3, pramd, dutta.