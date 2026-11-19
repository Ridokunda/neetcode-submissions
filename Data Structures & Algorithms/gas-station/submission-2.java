class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sumGas = 0;
        int sumCost = 0;
        for(int i = 0; i < gas.length; i++){
            sumGas += gas[i];
            sumCost += cost[i];
        }
        if(sumGas < sumCost) return -1;
        int tank = 0;
        int sp = 0;
        for(int i = 0; i < gas.length; i++){
            
            if((tank + gas[i]) < cost[i]){
                sp = (i + 1) % gas.length;
                tank = 0;
            }else{
                tank += gas[i] - cost[i];
                
            }

        }
        return sp;
    }
}
 