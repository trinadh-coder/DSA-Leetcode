class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map=new HashMap<>(); 
        int l=0,r=0,maxlen=0;
        for(r=0;r<s.length();r++){
            char now=s.charAt(r);
            if(map.containsKey(now)){
                l=Math.max(l,map.get(now)+1);
            }
            map.put(now, r);
            maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen;
        
    }
}