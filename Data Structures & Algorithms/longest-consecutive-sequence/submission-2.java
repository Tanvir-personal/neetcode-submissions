class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length < 1)
            return 0;
        Set<Integer> set = new HashSet<>();
        int maxLen = 0;
        int j = 0;
        for(int i : nums){
            set.add(i);
        }
        for(int i = 0; i < nums.length; i++){
            //check if it is the first number of a sequence
            if(!set.contains(nums[i] - 1)){
                int currentLen = 0;
                int numSequence = nums[i] + 1;
                while(set.contains(numSequence)){
                    currentLen++;
                    numSequence++;
                }
                maxLen = Math.max(maxLen, currentLen);
            }

        }
        return maxLen + 1;
    }
}
