class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> list= new ArrayList<>();
        int i=0;
        int j=0;
        int size=nums.length;
        Deque<Integer> dq= new ArrayDeque<>();
        while(j<size){
            //dq.addFirst(nums[j]); if duplicates are present,  store indices instead

            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[j]){
                dq.removeLast();
            }
             dq.addLast(j);

            if(j-i+1<k){
                j++;
            }else if(j-i+1 ==k){
                list.add(nums[dq.peekFirst()]);

            
            if(!dq.isEmpty() && dq.peekFirst()==i){
                dq.removeFirst();
            }
            j++;
            i++;
            }

        }

        int[] ans = new int[list.size()];
        for(int idx = 0; idx < list.size(); idx++){
            ans[idx] = list.get(idx);
        }
        return ans;
    }
}