class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n=nums.length;
        int[][] result=new int[n/3][3];
        Arrays.sort(nums);
        for(int i=0,gi=0;i<n;i+=3,gi++){
            int a=nums[i],b=nums[i+1],c=nums[i+2];
            if(c-a>k){
                return new int[0][0];
            }
            result[gi][0]=a;
            result[gi][1]=b;
            result[gi][2]=c;
        }
        return result;
    }
}
