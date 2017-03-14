package pixelCake.cubicCity.main.nodeGeneration;

public class MajorNodeGeneration {
    public static void GenerateNodes(int CITY_LENGTH, int CITY_HEIGHT, float minNodeSize, float maxNodeSize){
        boolean remainderIsGreaterThanMin = true;
        float totalCompleted;
        
        //declare node arrays
        float xNodes[] = new float[(int) minNodeSize * 100];
        float yNodes[] = new float[(int) minNodeSize * 100];
        
        //populate node arrays
        
        //xNodes
        while(remainderIsGreaterThanMin){
            //find remainder as a percentage
            totalCompleted = 0f;
            for(int i = 0; i < (int) minNodeSize * 100; i++){
                totalCompleted += xNodes[i];
            }
            
            if(1 - totalCompleted > maxNodeSize){
                
            }
            
            if (1 - totalCompleted < maxNodeSize && 1 - totalCompleted > minNodeSize){
                
            }
                
        }
        
    }
}
