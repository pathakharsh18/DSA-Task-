class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int cs=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i-1]==nums[i]) continue;
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(Math.abs(target-sum)<Math.abs(target-cs)){
                    cs=sum;
                }
                if(sum<target) left++;
                else if(sum>target) right--;
                else return sum;
            }
        }
        return cs;
    }
}