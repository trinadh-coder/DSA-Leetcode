class Solution {
    public int reverseDegree(String s) {
        int count=0,digit=0,sum=0;
        for(int i=0;i<s.length();i++){
            digit=26-(s.charAt(i)-'a');
            count=digit*(i+1);
            sum+=count;
        }
       return sum; 
    }
}