class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String word:strs){
            sb.append(String.format("%03d",word.length()));
            sb.append(word);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int length=Integer.parseInt(str.substring(i,i+3));
            i=i+3;
            list.add(str.substring(i,i+length));
            i=i+length;
        }
        return list;

    }
}
