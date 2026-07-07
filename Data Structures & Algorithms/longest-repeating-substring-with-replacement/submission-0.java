class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq= new int[26];
        int i=0;
        int j=0;
        int size=s.length();
        int maxLen=0;
        int maxFreq=0;

        while(j<size){
            freq[s.charAt(j)- 'A']++;
            maxFreq= Math.max(maxFreq, freq[s.charAt(j)-'A']);

            if((j-i+1)-maxFreq <=k){
                maxLen=Math.max(maxLen, j-i+1);
            }

            while((j-i+1)-maxFreq > k){
                freq[s.charAt(i)- 'A']--;
                i++;
            }
            j++;


        }
        return maxLen;
    }
}
