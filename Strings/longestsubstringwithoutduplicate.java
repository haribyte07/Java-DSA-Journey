class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq=new int[26];
        int left=0;
        int maxlen=0;
        for(int right=0;right<s.length();right++)
        {
            int index=s.charAt(right)-'a';     //This is used to count how many times each character occurs.
            freq[index]++;

            while(freq[index]>1)
            {
                freq[s.charAt(left)-'a']--;
                left++;            
            }
        
        maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
   
        
    }
