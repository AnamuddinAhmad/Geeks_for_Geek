class Solution {
    int isPalindrome(String S) {
        // code here
        int n=S.length();
        for(int i=0;i<S.length()/2;i++){
            if(n==0){
                return n;
            }
            if(S.charAt(i)!=S.charAt(n-i-1)){
                return 0;
            }
        }
        return 1;
    }
};
