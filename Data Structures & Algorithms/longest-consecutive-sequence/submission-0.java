class Solution {
    public int longestConsecutive(int[] nums) {
        int count=1;
        int max=1;
        int n=nums.length;
        if(n==0) return 0;
        Arrays.sort(nums);
        for(int j=1;j<n;j++){
            if(nums[j]==nums[j-1]){
                continue;
            }

            if(nums[j]-nums[j-1]==1){
                count++;
            }else{
                count=1; //break
            }
            max=Math.max(max,count);

        }
        return max;

    }
}
