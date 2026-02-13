class Solution {
    
    public int longestBalanced(String s) {
        int n =s.length();
        int max =0;
       for(int i=0; i<n;i++){
        int freq[] = new int[26];
            for(int j =i; j<s.length(); j++){
                char ch = s.charAt(j);
                freq[ch-'a']++;

                if(issameFreq(freq)){
                    max = Math.max(max, j-i+1);
                }
              
            }
       } 
         return max;
    }

    public static  boolean issameFreq(int arr[]){
        int val=0;
        for(int a: arr){
            if(a==0) continue;
            if(val==0){
                val=a;
            }
            else if( val!=a) return false;
        }

        return true;
    }
}