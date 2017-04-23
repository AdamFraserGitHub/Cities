package pixelCake.cubicCity.main.nodeGeneration;

import java.util.Random;

public class MajorNodeGeneration {
    public static void GenerateNodes(int CITY_LENGTH, int CITY_HEIGHT, float minNodeSize, float maxNodeSize){
        boolean remainderIsGreaterThanMin = true;
        float totalCompleted;
        
        //declare node arrays
        float xNodes[] = new float[(int) (minNodeSize * 100)];
        float yNodes[] = new float[(int) (minNodeSize * 100)];
        
        //populate node arrays
        int counter = 0;
        Random random = new Random();
        
        //xNodes
        while(remainderIsGreaterThanMin){
            //find remainder as a percentage
            totalCompleted = 0f;
            for(int i = 0; i < (int) (minNodeSize * 100); i++){
                totalCompleted += xNodes[i];
            }
            
            if(1 - totalCompleted >= maxNodeSize){
                float nodeSize = (random.nextInt((int) ((maxNodeSize * 100)) + 1 - (int) minNodeSize * 100) + (int) minNodeSize * 100);
                nodeSize = nodeSize / 100; //if opperation preformed on abouve line float defaults to 0.0 (for some reason :/)
                xNodes[counter] = nodeSize;
                counter++;
            }
            
            //@TODO optimise this block
            if (1 - totalCompleted < maxNodeSize && 1 - totalCompleted > minNodeSize && counter < 10){
//                System.out.println((int) ((1-totalCompleted * 100)));
                float nodeSize = (random.nextInt((int) (((1-totalCompleted) * 100)) + 1 - (int) minNodeSize * 100) + (int) minNodeSize * 100);
                nodeSize = nodeSize / 100;
                xNodes[counter] = nodeSize;
                counter++;
            }
            
            if (counter == 10){
                remainderIsGreaterThanMin = false;
            }
        }

        for(int i = 0; i < 10; i++){
                System.out.println(xNodes[i]);    
        }
    }
}
