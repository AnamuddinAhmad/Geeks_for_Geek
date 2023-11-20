class Compute 
{
    static Pair getMinMax(long a[ ], long n)  
    {
        //Write your code here
        long min=a[0];  // assign min as first value of array
        long max=a[0];  // assign max as  first value of array 
       for(int i=1; i<a.length ; i++){  // compare 
          if (max<a[i]) {max= a[i];}
          if (min>a[i]){ min= a[i];}
       }
       return new Pair(min,max);
    }
}
