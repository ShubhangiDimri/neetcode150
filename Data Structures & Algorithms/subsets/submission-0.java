class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> ans= new ArrayList<>();
        ArrayList<Integer> curr= new ArrayList<>();
        allSubsets(nums,ans,curr,0);
        return ans;

    }
    public void allSubsets(int[] nums,ArrayList<List<Integer>> ans,   ArrayList<Integer> curr,int i ){
        if(i==nums.length){
            //store result
            ans.add(new ArrayList<>(curr));
            return;
        }

        //include
        curr.add(nums[i]);
        allSubsets(nums,ans,curr,i+1);
    
        //backtrack 
        curr.remove(curr.size()-1);

        //exclude
        allSubsets(nums,ans,curr,i+1);

    }
}
