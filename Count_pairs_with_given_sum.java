class Solution {

    int countPairs(int arr[], int target) {
        // Your code here
        if(arr.length<1) return 0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if((arr[i]+arr[j]==target) && i!=j){
                    count+=1;
                }
            }
        }
        return count;
    }
}
