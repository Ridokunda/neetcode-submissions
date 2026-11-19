class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0){
            return false;
        }
        
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int n: hand){
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int n: freq.keySet()){
            minHeap.offer(n);
        }
        while(minHeap.size() > 0){
            int first = minHeap.peek();
            for(int i = first; i < first + groupSize; i++){
                if(!freq.containsKey(i)){
                    return false;
                }
                freq.put(i, freq.get(i) - 1);
                if(freq.get(i) == 0){
                    if(i != minHeap.peek()){
                        return false;
                    }
                    minHeap.poll();
                }
            }
        }
        return true;
    }
}
