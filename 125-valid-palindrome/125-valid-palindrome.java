class Solution {
    public boolean isPalindrome(String s) {
     boolean flag = true;
        String sNew = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        System.out.println(sNew);
        if(sNew.isEmpty()){
            return flag;
        }
        int i=0;
        int j= sNew.length()-1;     

        while(i<j){
            if(sNew.charAt(i) == sNew.charAt(j)){
                i++;
                j--;
              while (i==j){
                    flag = true;
                    
                    break;
               }
            }else {
            	flag = false;
            	break;
            }
               
            
       }
        return flag;
    }
}
        
   