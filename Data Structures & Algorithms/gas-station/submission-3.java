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
            
            tank += gas[i] - cost[i];
            if(tank < 0){
                tank = 0;
                sp = i + 1;
            }

        }
        return sp;
    }
}
 