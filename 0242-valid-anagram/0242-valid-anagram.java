class Solution {
    public boolean isAnagram(String s, String t) {
        int ss=s.length();
        int ts=t.length();

        if(ss!=ts){
            return false;
        }
        char[] schars=s.toCharArray();
        char[] tchars=t.toCharArray();
        Arrays.sort(schars);
        Arrays.sort(tchars);
        return Arrays.equals(schars, tchars);
    }
}