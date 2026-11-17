class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

     int[]charCount = new int [26];

     //counting the frequency of each alphabet 
     for(char c : magazine.toCharArray()){
        charCount[c-'a']++;
     }   
     //Checking if we can construct a ransom note out of it 
     for(char c : ransomNote.toCharArray()){
        if(charCount[c-'a']==0){
            return false;//Character isnt available 
        } 
        charCount[c-'a']--;
     }
       return true;
    }
   
}