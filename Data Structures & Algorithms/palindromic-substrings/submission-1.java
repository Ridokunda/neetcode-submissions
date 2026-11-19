class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int center=0; center < s.length(); center++){
            count += expandCenter(s, center, center);

            count += expandCenter(s, center, center+1);

        }
        return count;
    }
    private int expandCenter(String s, int left, int right){
        int count = 0;
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            count++; 
            left--;
            right++;
        }
        return count;
    }
}
