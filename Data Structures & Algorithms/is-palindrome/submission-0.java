class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","");
        s=s.toLowerCase();
        char[] str= s.toCharArray();
        int start=0;
        int end=str.length-1;

        while(start<end){
            if(str[start]!=str[end]){
                return false;
            }else{
                start++;
                end--;
            }
        }
        return true;
    }
}
