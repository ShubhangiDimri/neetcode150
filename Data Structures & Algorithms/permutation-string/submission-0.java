class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map= new HashMap<>();
        int n= s1.length();
        for(int k=0;k<n;k++){
            map.put(s1.charAt(k) , map.getOrDefault(s1.charAt(k),0)+1);
        }

        int i=0;
        int j=0;
        int size=s2.length();
        HashMap<Character, Integer> map1= new HashMap<>();

        while(j<size){
            map1.put(s2.charAt(j), map1.getOrDefault(s2.charAt(j),0)+1);

            if(j-i+1 < n){
                j++;
            }
            else if(j-i+1 == n){
                if(map1.equals(map)){
                    return true;
                }

                char remove= s2.charAt(i);
                map1.put(remove , map1.get(remove)-1);
                if(map1.get(remove)==0){
                    map1.remove(remove);
                }

                i++;
                j++;

            }
        }
        return false;
    }
}
