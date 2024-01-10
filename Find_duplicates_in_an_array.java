class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        Set<Integer> list= new HashSet<>();
        Set<Integer> result= new HashSet<>();
        ArrayList<Integer> resultduplicate= new ArrayList<>();
       for(int i=0;i<n;i++){
           if(list.contains(arr[i])){
               result.add(arr[i]);
           }else{
               list.add(arr[i]);
           }
       }
       
       if(result.isEmpty()){
           resultduplicate.add(-1);
           return resultduplicate;
       }
       resultduplicate.addAll(result);
       Collections.sort(resultduplicate);
       return resultduplicate;
    }
}
