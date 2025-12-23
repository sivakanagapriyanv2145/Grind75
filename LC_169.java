class Solution {
    public int majorityElement(int[] nums) {
        int num=0,tak=0,count=0;
        for(int n:nums){
            if(count==0){
                tak=n;
            }
            if(tak==n){
                count++;
            }
            else{
                count--;
            }
        }
        return tak;
    }
}
