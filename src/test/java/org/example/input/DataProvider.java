package org.example.input;

import java.util.Arrays;
import java.util.Iterator;

public class DataProvider {
    @org.testng.annotations.DataProvider(name = "conditions")
    public Iterator<Object[]> conditionsType() {

//        Object[] objects={
//                "CONTAINS_G", "STARTS_WITH_I", "NO_TEXT" };
           Iterator<Object[]> it=new Iterator<Object[]>() {
               @Override
               public boolean hasNext() {
                   return false;
               }

               @Override
               public Object[] next() {
                   return new Object[0];
               }
           }{"CONTAINS_G", "STARTS_WITH_I", "NO_TEXT"}
        return objects;
        }
    }
}
