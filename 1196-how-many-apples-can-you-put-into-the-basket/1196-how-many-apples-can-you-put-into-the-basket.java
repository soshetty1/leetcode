class Solution {
    public int maxNumberOfApples(int[] weight) {
        int sum = 5000;
        int res=0;
        int count=0;
        Arrays.sort(weight);
        for(int a: weight){
            res= res+a;
            
            if(res<=sum){
                count+= 1;
            
            }
            else{
                break;
            }
        }
        return count;
    }
}