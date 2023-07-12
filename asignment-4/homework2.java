class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int x:nums1){
            mp.put(x,1);
        }

        for(int x:nums2){
            if(mp.getOrDefault(x,0) == 1)
                mp.put(x,3);
            else if(mp.getOrDefault(x,0) == 0)
                mp.put(x,2);
        }
        
        List<Integer> f1 = new ArrayList<>();
        List<Integer> f2 = new ArrayList<>();
        for(int x:nums1){
            if(mp.getOrDefault(x,0) == 1){
                mp.put(x,0);
                f1.add(x);
            }
                
        }
        
        ans.add(f1);
        for(int x:nums2){
            if(mp.getOrDefault(x,0) == 2){
                mp.put(x,0);
                f2.add(x);
            }
        }
        
        
        ans.add(f2);
        
        return ans;
    }
}