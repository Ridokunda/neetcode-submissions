class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> freq = new HashMap<>();

        for(char c: s.toCharArray()){
            freq.put(c, freq.getOrDefault(c,0) + 1);
        }
        for(char c: t.toCharArray()){
            if(freq.containsKey(c)){
                freq.put(c, freq.get(c)-1);
                if(freq.get(c) < 0){
                    return false;
                }
            }else{
                return false;
            }
        }
        for(int n: freq.values()){
            if(n != 0){
                return false;
            }
        }
        return true;
    }
}
