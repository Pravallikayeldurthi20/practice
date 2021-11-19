
package org.example;

import flower.ChooseFlower;
import org.testng.annotations.Test;

public class FlowerTest {
    ChooseFlower chooseFlower=new ChooseFlower();
    @Test
    public void getCostOfFlowers()
    {
        System.out.println(chooseFlower.getCostOfFlower("rose"));
        System.out.println(chooseFlower.getCostOfFlower("lily"));
    }
}
