class Solution {
    public int lengthOfLastWord(String s) {
        
        int length = 0 ; 

        //Starting from the end point

        int i = s.length()-1;

        //Skip the trainling spaces 
        while(i>=0 && s.charAt(i) == ' '){
            i--;
        } 
        while(i>=0 && s.charAt(i) != ' '){
            length++;
            i--;

        } 
        return length ;
    }
}