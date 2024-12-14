class Solution {
    public int firstElementKTime(int[] arr, int k) {
        // write code
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
            if(map.get(arr[i])==k){
                return arr[i];
            }
        }
        return -1;
    }
}
