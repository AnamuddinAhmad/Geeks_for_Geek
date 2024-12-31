  public int longestConsecutive(int[] arr) {
        // code here
        if(arr.length==0) return 0;
         int count=1;
         int finalCoun=1;
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
          if(arr[i-1]+1==arr[i]){
               count++;
           }else if(arr[i]!= arr[i-1]){
               count=1;
           }
            finalCoun = Math.max(finalCoun,count);
        }
        return finalCoun;
    }
