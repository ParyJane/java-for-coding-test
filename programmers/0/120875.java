import java.util.List;
import java.util.ArrayList;

class Solution {
    
    public int solution(int[][] dots) {
        // 기울기가 같으면 1, 다르면 0
        List<Float> list = new ArrayList<Float>();
        for(int i = 0; i < dots.length; i++) {
            float slope;
            for(int j = i + 1; j < dots.length; j++) {
                slope = (float)(dots[i][1]-dots[j][1]) / (dots[i][0]-dots[j][0]);
                if(list.contains(slope)) return 1;
                list.add(slope);
            }
        }
        
        return 0;
    }
}
