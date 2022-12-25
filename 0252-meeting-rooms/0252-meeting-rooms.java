class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        if(intervals.length==0 ){
            return true;
        }
        
       
        
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0]-b[0];
            }
        });
        
        int[] prev= intervals[0];
        
        for(int i=1; i<intervals.length; i++){
            int[] curr= intervals[i];
                
                if(prev[1]> curr[0]){
                    return false;
                   
                }
             prev = curr;
            
         
            
         
        }
        
        return true;
    }
}
    
