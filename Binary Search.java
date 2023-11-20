class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int str=0;
        int end=n-1;
        while(str<=end){
        int mid=str+(end-str)/2;
            if(arr[mid]==k){
                return mid;
            }else if(k<arr[mid]){
                end=mid-1;
            }else if(k>arr[mid]){
                str=mid+1;
            }
        }
        return -1;
    }
}
