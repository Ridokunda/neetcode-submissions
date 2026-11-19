class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int n: stones){
            maxHeap.offer(n);
        }
        while(maxHeap.size() > 1){
            //int x = maxHeap.poll();
            //int y = maxHeap.poll();
            int cur = maxHeap.poll() - maxHeap.poll();
            if(cur == 0){
                continue;
            }else{
                maxHeap.offer(cur);
            }
        }
        return (maxHeap.size() == 1) ? maxHeap.peek() : 0;
    }
}
