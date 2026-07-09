class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c: t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int i=0;
        int j=0;
        int size=s.length();
        int count=t.length();
        int minWindow= Integer.MAX_VALUE;
        int start=0;
        while(j< size){

            if(map.containsKey(s.charAt(j))){
                map.put(s.charAt(j),map.get(s.charAt(j)) -1);

                if(map.get(s.charAt(j))>=0){
                    count--;
                }

            }
            

            while(count==0){//shrinking logic
                  if(j-i+1 < minWindow){
                    minWindow= j-i+1;
                    start=i;
                  }



                  if(map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i), map.get(s.charAt(i))+1);

                    if(map.get(s.charAt(i))>0){
                        count++;
                    }

                  }
                  i++;

            }
            j++;
            

        }
        if(minWindow==Integer.MAX_VALUE){
            return "";
        }else{
            return s.substring(start, start+minWindow);
        }
    }
}