class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int count=0;
       
        for(int i=0; i<arr1.length; i++){
            
            int j=0;
            while(j<arr2.length){
                if( Math.abs (arr1[i]- arr2[j]) <= d)
                {
                                        count= count-1;

                    break;
                }
                else{
                    j++;
                }
            }
                            count = count+1;

            
        }
        return count;
    }
}