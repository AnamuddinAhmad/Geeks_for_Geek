class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
        int sum=0;
        for(int i =1; i<=n;i++){
            sum+=i;
        }
        for(int i=0;i<n-1;i++){
            sum-=array[i];
        }
        return sum;
    }
}
