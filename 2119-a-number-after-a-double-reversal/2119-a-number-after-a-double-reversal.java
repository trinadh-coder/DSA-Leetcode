class Solution {
    public boolean isSameAfterReversals(int num) {
        int c=num;
        int a=0;
        while(num!=0){
            a=(a*10)+num%10;
            num=num/10;
        }
        int b=0;
        while(a!=0){
            b=(b*10)+a%10;
            a=a/10;
        }
    if(c!=b){
        return false;
    }
    return true;
    }
}