class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.isEmpty()){
            return true;
        } 
        int start = 0;
        int last  = s.length() - 1;

        // The while loop needs to wrap around ALL the pointer updates and comparisons
        while(start < last){
            char currFirst = s.charAt(start);
            char currlast  = s.charAt(last);
        
            if(!Character.isLetterOrDigit(currFirst)) {
                start++;
            } 
            else if(!Character.isLetterOrDigit(currlast)){
                last--; 
            } 
            else {
                // Fix: If they DON'T match, return false immediately.
                if(Character.toLowerCase(currFirst) != Character.toLowerCase(currlast)){
                    return false; 
                }
                // If they DO match, move both pointers inward.
                start++;
                last--;
            } 
        } // The while loop ends HERE, after all processing is done
        
        return true;
    }
}