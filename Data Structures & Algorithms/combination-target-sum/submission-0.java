class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> curr= new ArrayList<>();
        allCombi(nums,0,ans,curr,target);
        return ans;
    }
    public void allCombi(int[]nums, int i, List<List<Integer>>ans, List<Integer>  curr,int target){
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }

        if(i==nums.length || target<0){
            return;
        }

        curr.add(nums[i]);
        allCombi(nums,i,ans,curr,target-nums[i]);

        curr.remove(curr.size()-1);
        allCombi(nums,i+1,ans,curr,target);

    }
}
