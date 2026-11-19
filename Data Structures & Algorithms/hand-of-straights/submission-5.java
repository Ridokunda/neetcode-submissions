class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        //Arrays.sort(hand);
        TreeMap<Integer,Integer> frq = new TreeMap<>();

        for(int n: hand){
            frq.put(n, frq.getOrDefault(n,0)+1);
        }
        //int j = hand.length / groupSize;
        while (!frq.isEmpty()) {

            int start = frq.firstKey();

            for (int i = 0; i < groupSize; i++) {

                int card = start + i;

                if (!frq.containsKey(card))
                    return false;

                frq.put(card, frq.get(card) - 1);

                if (frq.get(card) == 0)
                    frq.remove(card);
            }
        }
        
        return true;
    }
}
