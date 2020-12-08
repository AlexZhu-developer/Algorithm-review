public class binsearch {
    /**
     * @param nums: An integer array sorted in ascending order
     * @param target: An integer
     * @return: An integer
     */
    public int findPosition(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int middle = 0;
        
        while(low<=high){
            middle = (low + high)/2;
            if(nums[middle] == target){
                return middle;
            }else if(nums[middle] > target){
                high = middle-1;
            }else{
                low = middle+1;
            }
        }
        return -1;
        // write your code here
    }
}