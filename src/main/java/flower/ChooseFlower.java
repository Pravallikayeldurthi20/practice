package flower;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ChooseFlower {
    private static final Supplier<Flower> LILY= ()->{
        return new Lily();
    };
    private static final Supplier<Flower> ROSE=()->{
        return  new Rose();
    };
    private static final Map<String,Supplier<Flower>> FLOWER=new HashMap<>();
    static {
        FLOWER.put("rose",ROSE);
        FLOWER.put("lily",LILY);
    }
    public int getCostOfFlower(String FLOWER_NAME)
    {
        return FLOWER.get(FLOWER_NAME).get().costOfFlower();
    }
}
