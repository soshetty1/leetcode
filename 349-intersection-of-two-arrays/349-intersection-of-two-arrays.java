class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> map = new HashSet<Integer>();
        ArrayList<Integer> list= new ArrayList<Integer>();
        for(int num:nums1){
            if(!map.contains(num)){
                map.add(num);
            }
        }
        
        for(int num:nums2){
            if(map.contains(num)){
                list.add(num);
                    map.remove(num);
            }
        }
        
        int[] result = new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]= list.get(i);
        }
            return result;
    }

}