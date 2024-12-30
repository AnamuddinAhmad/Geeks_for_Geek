class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
         HashSet<Integer> duplicate = new HashSet<>();
    
    for(int num : a){
        al.add(num);
    }
    
    for(int num :b){
        if(al.contains(num))
        duplicate.add(num);
    }
        return new ArrayList<>(duplicate);
    }
}
