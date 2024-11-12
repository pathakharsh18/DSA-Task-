class Solution {
    public List<String> commonChars(String[] words) {
        int[] freq=new int[26];
        String word=words[0];
        for(char ch:word.toCharArray()){
            int idx=ch-'a';
            freq[idx]++;
        }
        int n=words.length;
        for(int i=1;i<n;i++){
            int[] curr=new int[26];
            String curword=words[i];
            for(char ch:curword.toCharArray()){
                int idx=ch-'a';
                curr[idx]++;
            }
            for(int j=0;j<26;j++){
                freq[j]=Math.min(freq[j],curr[j]);
            }
        }
        List<String> l=new ArrayList<>();
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                char ch=(char)(i+97);
                int count=freq[i];
                while(count>0){
                    l.add(""+ch);
                    count--;
                 }
                }
        }
        return l;
    }
}
