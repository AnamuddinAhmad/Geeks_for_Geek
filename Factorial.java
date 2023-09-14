class Solution{
    static long factorial(int N){
        // code here
        long n=1;
        if(N==0 || N==1){
                return 1;
            }
        for(int i=1;i<N;i++){
            
            n=n+(n*i);
        }
        return n;
    }
}
