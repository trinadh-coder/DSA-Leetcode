class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
       int[] b=new int[n];
       k=k%n;
       for(int i=0;i<n;i++){
        b[(k+i)%n]=nums[i];
       }
       for(int i=0;i<n;i++){
        nums[i]=b[i];
       }

    }
}