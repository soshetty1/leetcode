class Solution {
    public int largestSumAfterKNegations(int[] A, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue();
        
        for (int a : A)
            pq.add(a);
        
        int sum = Arrays.stream(A).sum();
        
        while (K>0) {
            sum -= 2*pq.peek();
            pq.add(-pq.poll());
            K--;
        }
        return sum;
    }
}