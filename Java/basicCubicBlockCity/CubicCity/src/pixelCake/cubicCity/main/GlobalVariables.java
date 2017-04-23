package pixelCake.cubicCity.main;

public class GlobalVariables {
    private static final int CITY_LENGTH = 10;
    private static final int CITY_HEIGHT = 20;
    private static final float minNodeSize = 0.1f;
    private static final float maxNodeSize = 0.4f;
    
    //GETTERS
    public static int getCITY_LENGTH(){
        return CITY_LENGTH;
    }
    
    public static int getCITY_HEIGHT(){
        return CITY_HEIGHT;
    }

    public static float getMinNodeSize(){
        return minNodeSize;
    }
    
    public static float getMaxNodeSize(){
        return maxNodeSize;
    }
}


