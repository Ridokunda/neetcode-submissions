class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> freqCount = new HashMap<>();
        for(char c: tasks){
            freqCount.put(c, freqCount.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b - a);
        for(Integer count : freqCount.values()){
            maxHeap.offer(count);
        }
        int time = 0;
        Queue<int[]> queue = new LinkedList<>();
        while(maxHeap.size() > 0 || queue.size() > 0){
            time++;
            if(maxHeap.isEmpty()){
                time = queue.peek()[1];
            }else{
                int count = maxHeap.poll() - 1;
                if(count != 0){
                    queue.offer(new int[]{count, time+n});
                }
            }
            if(queue.size() > 0 && queue.peek()[1] == time){
                maxHeap.offer(queue.poll()[0]);
            }
            
        }
        return time;
    }
}
