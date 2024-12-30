class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        int result=0;
        for(int value:a){
            if(!al.contains(value))
            {
            al.add(value);
                result+=1;
            }
        }
        
        for(int value : b){
            if(!al.contains(value)){
            al.add(value);
            result+=1;    
            }
        }
        
        return result;
        
    }
}
