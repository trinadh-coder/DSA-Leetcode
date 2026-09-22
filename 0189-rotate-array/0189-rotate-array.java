class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
       int[] b=new int[2*n];
       k=k%n;
       for(int i=0;i<n;i++){
        b[i]=nums[i];
        b[n+i]=nums[i];
       }
       int j=0;
       for(int i=n-k;i<2*n-k;i++){
        nums[j]=b[i];
        j++;       
       }

    }
}