class Solution {
    public int majorityElement(int[] nums) {
         int n=nums.length;
         int count=0;
    //      for(int i=1;i<n;i++){
    //         if(a==nums[i]){
    //             count++;
    //         }
    //         else count--;
    //      if(count==0)
    //      {
    //      a=nums[i];
    //      count=1;
    // }
    //      }
    // return a;
    // int a=0;                        ->TC=o(n);
    // for(int i=0;i<n;i++){
    //     count=0;
    //     for(int j=0;j<n;j++){
    //         if(nums[i]==nums[j])count++;

    //     }
    //     if(count>n/2){
    //         return nums[i];
    //     }
    // }
    // return -1;
    HashMap<Integer,Integer>mp=new HashMap<>();
    for(int num:nums){
        mp.put(num,mp.getOrDefault(num,0)+1);
    }
    for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
        if(entry.getValue()>n/2)return entry.getKey();
    }
    return -1;
    }
}