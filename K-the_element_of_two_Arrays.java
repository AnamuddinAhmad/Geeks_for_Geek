class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        for(int value:a){
            al.add(value);
        }
        
        for(int value:b){
            al.add(value);
        }
        Collections.sort(al);
        return al.get(k-1);
    }
}
