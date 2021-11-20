package org.example.input;

import predicate.Conditions;

import java.util.Arrays;
import java.util.Iterator;

public class DataProvider {
    @org.testng.annotations.DataProvider(name = "conditions")
    public Object[][] conditionsType() {

        Object[][] objects=new Object[][]{
                {Conditions.CONTAINS_G}, {Conditions.NO_TEXT}, {Conditions.STARTS_WITH_I} };

        return objects;
        }
    }

