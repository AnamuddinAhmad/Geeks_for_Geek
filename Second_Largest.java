class Solution {
    int print2largest(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int i=n-1;
        while(i>=0){
            if(arr[i]<arr[n-1]){
                return arr[i];
            }
            i--;
        }
        return -1;
    }
}
