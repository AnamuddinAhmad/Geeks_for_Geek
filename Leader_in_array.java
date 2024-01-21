class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code 
        ArrayList<Integer> al = new ArrayList<>();
        int max=arr[n-1];
        for(int i=n-1;i>=0;i--){
            if(max<=arr[i]){
                max=arr[i];
                al.add(max);
            }
        }
        Collections.reverse(al);
        return al;
    }
}
