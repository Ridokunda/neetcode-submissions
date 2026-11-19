class Solution {
    public int search(int[] nums, int target) {
        int l = 0; 
        int r = nums.length-1;
        int mid = 0;
        while(l < r){
            mid = l + (r-l)/2;
            if(nums[mid] > nums[r]){
                l = mid + 1;
            }else{
                r = mid;
            }
        }
        int pivot = l;
        int low = binarySearch(nums, 0, pivot - 1, target);
        int high = binarySearch(nums, pivot, nums.length - 1, target);
        return ( low > -1) ? low : high;

    }
    private int binarySearch(int[] nums,int low, int high, int target){
        
        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }
}