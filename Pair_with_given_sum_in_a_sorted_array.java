class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        int count =0;
        if(arr.length<1) return count;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target && i != j){
                count ++;
                }
            }
        }
        return count;
    }
}
