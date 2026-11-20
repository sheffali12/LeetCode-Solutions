class Solution {
    public int longestConsecutive(int[] nums) {
        
        int longestLength = 0 ;
        Map<Integer , Boolean> exploredMap = new HashMap<>();
       
        for(int num : nums ){
            exploredMap.put(num , Boolean.FALSE);
        } 

        for(int num : nums){
            int currentLength = 1 ;

            //CHecking in forward direction 
            int nextNum = num+1;

            while(exploredMap.containsKey(nextNum) && exploredMap.get(nextNum)==false){
                
                currentLength++;
                exploredMap.put(nextNum ,Boolean.TRUE);

                //Moving to nextnumber
               nextNum++;
            }

            //check in prev direction

            int prevNum = num-1;
            while(exploredMap.containsKey(prevNum) && exploredMap.get(prevNum)==false){
            
            currentLength++;
            exploredMap.put(prevNum , Boolean.TRUE);
            prevNum--;

        } 

        longestLength = Math.max(longestLength,currentLength);
    }
    return longestLength;
}
}