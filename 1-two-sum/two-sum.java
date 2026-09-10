class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int []a=new int[2];
        for(int i=0;i<nums.length;i++){
            int curr=nums[i];
            int need=target-curr;
            if(mp.containsKey(need)){
                   a[0]=mp.get(need);
                   a[1]=i;
            }
            mp.put(curr,i);
        }
        return a;
    }
}