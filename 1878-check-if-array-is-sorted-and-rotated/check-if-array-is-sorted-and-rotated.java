class Solution {
    public boolean check(int[] nums) {
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]<nums[i+1])return true;
        int count=0,n=nums.length;
         for(int i=1;i<n;i++)
         {
            if(nums[i]<nums[i-1])count++;

         }   
         if(nums[n-1]>nums[0])count++;
         return count<=1;
    }
}