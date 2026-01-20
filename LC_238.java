class Solution {
    public int[] productExceptSelf(int[] nums) {
        int i,j,re=1;
        int res[]=new int[nums.length];
        for(i=0;i<nums.length;i++){
            for(j=0;j<nums.length;j++){
                if(i!=j){
                    re*=nums[j];
                }
            }
            res[i]=re;
            re=1;
        }
        return res;
    }
}
