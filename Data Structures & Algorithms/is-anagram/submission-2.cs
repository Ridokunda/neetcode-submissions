public class Solution {
    public bool IsAnagram(string s, string t) {
        if(s.Length != t.Length) return false;
        int[] freqS = new int[26];
        int[] freqT = new int[26];

        foreach(char c in s.ToCharArray()){
            freqS[c - 'a']++;
        }
        foreach(char c in t.ToCharArray()){
            freqT[c - 'a']++;
        }
        for(int i = 0; i < 26; i++){
            if(freqS[i] - freqT[i] < 0) return false;
        }
        return true;
    }
}
