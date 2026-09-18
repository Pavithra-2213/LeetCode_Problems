class Solution {
    public int majorityElement(int[] nums) {
         int n=nums.length;
         int a=nums[0],count=1;
         for(int i=1;i<n;i++){
            if(a==nums[i]){
                count++;
            }
            else count--;
         if(count==0)
         {
         a=nums[i];
         count=1;
    }
         }
    return a;
    }
}