class Solution {
    public int findContentChildren(int[] g, int[] s) {
       
        
int i=0;
        int j=0;
        int res= 0;
         Arrays.sort(g);
        Arrays.sort(s);
        
        while(i<g.length && j<s.length){
            if(g[i]> s[j]){ 
            j++;
            }
            
            else if(s[j]>= g[i]){
                res++;
                 i++;
            j++;
                
            }
           
        }
        
        return res;
        
    }
}