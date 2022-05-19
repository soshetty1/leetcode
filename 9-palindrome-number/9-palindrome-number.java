class Solution {
    public boolean isPalindrome(int x) {
        int t=x,r, s=0;
        while(x>0){
             r= x%10;
              x=x/10;
                s=s*10+r;
        }       
        if(t==s)
        {
            return true;
        }
        else{
                       return false;
        }
    
    }
   
}