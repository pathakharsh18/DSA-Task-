class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq=new int[101];
        for(int k:nums){
            freq[k]+=1;
        }
        int max=0;
        for(int num:nums){
            max=Math.max(max,freq[num]);
        }
        int c=0;
        for(int num:nums){
            if(freq[num]==max){
                c++;
            }
        }
        return c;
    }
}