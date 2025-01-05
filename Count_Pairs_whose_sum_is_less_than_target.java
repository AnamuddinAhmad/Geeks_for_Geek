class Solution {
    int countPairs(int arr[], int target) {
        // Your code here
        Arrays.sort(arr);
        int count =0;
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            if(arr[i]>=target){
                n=i;
                break;
            }
        }
        
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j] < target){
                    
                    count++;
                }
            }
        }
        return count;
    }
}
