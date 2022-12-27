class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n= capacity.length;
        int fullbag= 0;
        int[] remaining_capacity = new int[n];
        for(int i=0;i<n; i++){
            remaining_capacity[i]= capacity[i]- rocks[i];
        }
        
        Arrays.sort(remaining_capacity);
        
        
        for( int i=0; i<n; i++){
            if (additionalRocks >= remaining_capacity[i])
            {
                additionalRocks = additionalRocks - remaining_capacity[i];
            fullbag++;
            }
            
            else{
                break;
            }
        }
        
        return fullbag;
    }
}