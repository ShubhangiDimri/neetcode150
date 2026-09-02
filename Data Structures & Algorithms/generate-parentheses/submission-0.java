class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list= new ArrayList<>();
        helper(n,n,"",list);
        return list;
    }
    public void helper(int open, int close, String op, List<String> list){
        if(open==0 && close==0){
            list.add(op);
            return;
        }

        if(open>0){
            helper(open-1,close,op+'(',list);
        }
        if(close>open){
            helper(open,close-1,op+')',list);
        }

    }
}
