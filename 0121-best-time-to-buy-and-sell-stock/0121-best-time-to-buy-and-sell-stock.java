class Solution {
    public int maxProfit(int[] prices) {
        int mini=prices[0];
        int n=prices.length;
        int p=0;
        for(int i=1;i<n;i++){
            p=Math.max(p,prices[i]-mini);
            mini=Math.min(mini,prices[i]);
        }
        return p;
    }
}
 