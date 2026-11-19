class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()){
            return "";
        }
        int[] need = new int[128];
        int[] have = new int[128];

        for(char c: t.toCharArray()){
            need[c]++;
        }

        int required = 0;
        int haveCount = 0;

        for(int n: need){
            if(n > 0){
                required++;
            }
        }

        int minLeft = 0;
        int minLength = Integer.MAX_VALUE;
        int left = 0;

        for(int right = 0; right < s.length(); right++){
            char current = s.charAt(right);
            have[current]++;

            if(need[current] > 0 && have[current] == need[current]){
                haveCount++;
            }

            while(haveCount == required){
                int windowLength = right - left + 1;

                if(windowLength < minLength){
                    minLength = windowLength;
                    minLeft = left;
                }

                char leftChar = s.charAt(left);
                have[leftChar]--;

                if(need[leftChar] > 0 && have[leftChar] < need[leftChar]){
                    haveCount--;
                }
                left++;
            }
        }
        if(minLength == Integer.MAX_VALUE) return "";
        return s.substring(minLeft, minLeft+minLength);

    }
}
