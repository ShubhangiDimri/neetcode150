class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        int n=nums.length;
        if(n<3){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int target=-nums[i];
            ans.addAll(twoSum(nums,target,i+1,n-1));
        }
        return ans;
    }
     public List<List<Integer>> twoSum(int[] nums, int target, int start, int end){
        ArrayList<List<Integer>> result= new ArrayList<>();

        while(start<end){
            if(nums[start]+nums[end]>target){
                end--;
            }else if(nums[start]+nums[end]<target){
                start++;
            }else{
                while(start<end && nums[start]==nums[start+1]) start++;
                while(start<end && nums[end]==nums[end-1]) end--;

                result.add(Arrays.asList(-target, nums[start], nums[end]));
                start++;
                end--;

            }
        }
        return result;

    }
}
