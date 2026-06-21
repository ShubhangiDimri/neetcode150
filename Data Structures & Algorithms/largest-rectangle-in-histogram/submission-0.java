class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        //right smaller element
        int[] rse= new int[n];
        Stack<Integer> st= new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                rse[i]=n;
            }else{
                rse[i]=st.peek();
            }
            st.push(i);
        }

        //left smaller element
        int[] lse= new int[n];
        Stack<Integer> st1= new Stack<>();
        for(int i=0;i<n;i++){
            while(!st1.isEmpty() && heights[st1.peek()]>=heights[i]){
                st1.pop();
            }
            if(st1.isEmpty()){
                lse[i]=-1;

            }else{
                lse[i]=st1.peek();
            }
            st1.push(i);
        }

        int max=0;
        //width= right-left-1
        for(int i=0;i<n;i++){
            int width= rse[i]-lse[i]-1;
            int area= heights[i]*width;
            max=Math.max(area,max);

        }
        return max;
    }
}
