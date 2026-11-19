class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];

        int maxFreq = 0;
        int maxLength = 0;
        int left = 0;

        for(int right = 0; right < s.length(); right++){
            char current = s.charAt(right);
            freq[current - 'A']++;

            maxFreq = Math.max(maxFreq, freq[current-'A']);
            int windowLength = right - left + 1;
            int replacements = windowLength - maxFreq;

            while(replacements > k){
                freq[s.charAt(left) - 'A']--;
                left++;
                windowLength = right - left + 1;
                replacements = windowLength - maxFreq;
            } 
            maxLength = Math.max(maxLength, windowLength);
        }
        return maxLength;
    }
}
