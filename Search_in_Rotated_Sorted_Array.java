class Solution {
    int search(int[] arr, int key) {
        // Complete this function
         if(arr.length<1 && arr[0] != key){  // check the size of the array and if the 
            return -1;                 // intial index it is not present then return -1.
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}
