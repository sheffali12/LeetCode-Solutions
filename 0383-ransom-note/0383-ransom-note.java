class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character , Integer> charCount = new HashMap<>();

     for (char c : magazine.toCharArray()){
        charCount.put(c,charCount.getOrDefault(c,0)+1);
     }
     for(char c : ransomNote.toCharArray()){
        int count =  charCount.getOrDefault(c,0);

        if (count==0){
            return false;
        }
        charCount.put(c,count-1);
     }
     return true;
    }
}