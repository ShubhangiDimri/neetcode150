class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set= new HashSet<>();
        int i=0;
        int j=0;
        int size=s.length();
        int max=0;

        while(j<size){

            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
               
            }
            set.add(s.charAt(j));
            
            max=Math.max(j-i+1 , max);
            j++;

        }
        return max;


    }
}
