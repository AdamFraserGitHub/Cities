package pixelCake.cubicCity.main;

import pixelCake.cubicCity.main.GlobalVariables;
import pixelCake.cubicCity.main.nodeGeneration.MajorNodeGeneration;

public class Runtime {
    static int CITY_LENGTH, CITY_HEIGHT;
    static float minNodeSize, maxNodeSize;
    
    public static void getFinalVariables(){
        CITY_LENGTH = GlobalVariables.getCITY_LENGTH();
        CITY_HEIGHT = GlobalVariables.getCITY_HEIGHT();
        minNodeSize = GlobalVariables.getMinNodeSize();
        maxNodeSize = GlobalVariables.getMaxNodeSize();
    }
    
    public static void generateMajorNodes(){
        MajorNodeGeneration.GenerateNodes(CITY_LENGTH, CITY_HEIGHT, minNodeSize, maxNodeSize);
    }
}
