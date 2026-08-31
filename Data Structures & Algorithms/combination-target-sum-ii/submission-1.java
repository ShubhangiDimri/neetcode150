class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> curr= new ArrayList<>();
        helper(candidates,target,ans,curr,0);
        return ans;
    }
    public void helper(int[] arr, int target, List<List<Integer>>ans, List<Integer> curr, int i){
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(i==arr.length || target<0){
            return;
        }
        curr.add(arr[i]);
        helper(arr,target-arr[i],ans,curr,i+1);

        curr.remove(curr.size()-1);

        while(i+1<arr.length && arr[i]==arr[i+1]){
            i++;
        }
        helper(arr,target,ans,curr,i+1);
    }
}
