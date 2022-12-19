class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        

        
        PriorityQueue< Integer> pq= new PriorityQueue<>();
        
        for(int A: nums){
            pq.add(A);
        }
        
        while(k>0)
        {
            int temp = pq.poll();
            temp = temp * -1;
            pq.add(temp);
            k--;   // it's importanat to decremnent the k value 
        }
        
        int sum =0;
        for(int B:pq){
            sum = sum + B;
            
        }
        return sum;
    }
    
}
        
