class Solution {
    public int singleNumber(int[] nums) {
        // int []freq=new int[256];
        // for(int i=0;i<nums.length;i++){
        //     freq[nums[i]]++;
        // }
        // for(int i=0;i<nums.length;i++){
        //     if(freq[nums[i]]==1){
        //         return nums[i];
        //     }
        // }
        // return -1;
        int ans = 0;

        for (int num : nums) {
            ans = ans ^ num;
        }

        return ans;
    }
}