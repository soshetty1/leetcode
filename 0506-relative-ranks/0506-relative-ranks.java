class Solution {
    public String[] findRelativeRanks(int[] score) {
        TreeMap<Integer,Integer> map = new TreeMap<>(Collections.reverseOrder());
        for(int i=0; i< score.length; i++){
        map.put(score[i],i);
        }
        
        String[] arr = new String[ score.length];
        
    int count =1;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(count==1){
                arr[entry.getValue()] = "Gold Medal";
            }
            
            else if(count == 2){
                arr[entry.getValue()]= "Silver Medal";
            }
            else if(count ==3){
                arr[entry.getValue()]= "Bronze Medal";
            }
            else{
                arr[entry.getValue()] = String.valueOf(count);
            }
            count++;
        }
        return arr;
}}