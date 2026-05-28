class Solution {
    //"Hello","World"
    //5#Hello5#World

    public String encode(List<String> strs) {
        StringBuilder encodedString= new StringBuilder();
        for(String str: strs){
            encodedString.append(str.length()).append("#").append(str);

        }
        return encodedString.toString();

    }

    public List<String> decode(String str) {
        List<String> decoded= new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }

            int length= Integer.parseInt(str.substring(i,j));
            String word= str.substring(j+1,j+1+length);
            decoded.add(word);
            i=j+1+length; //move i to next word


        }
        return decoded;
        

    }
}
