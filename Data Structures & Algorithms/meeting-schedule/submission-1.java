/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        Collections.sort(intervals, Comparator.comparingInt(i -> i.start));
        for(int i = 1; i < intervals.size(); i++){
            int i1 = intervals.get(i-1).end;
            int i2 = intervals.get(i).start;
            if(i1 > i2){
                return false;
            }
        }
        return true;
    }
}
