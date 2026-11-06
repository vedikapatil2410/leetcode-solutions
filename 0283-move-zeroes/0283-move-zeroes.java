class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;//pointer for iteration
        int j=0;//pointer towards non zero elements
        int n=nums.length;
        for(i=0;i<n;i++){
            if(nums[i]!=0){
               nums[j]=nums[i];
               j++;
            }
        }
        int len=n-j;//number of zeros in the array
        for(int k=j;k<n;k++){
            nums[k]=0;
        }
    }
}