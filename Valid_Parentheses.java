
class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> ch = new Stack<>();
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='{' || x.charAt(i)=='('|| x.charAt(i)=='['){
                ch.push(x.charAt(i));
            }else{
               if(ch.isEmpty()){
                   return false;
               }else if(ch.peek()=='{' && x.charAt(i)=='}'||
                        ch.peek()=='(' && x.charAt(i)==')'||
                        ch.peek()=='[' && x.charAt(i)==']'){
                        ch.pop();
                }else{
                    return false;
                }
            }
        }
        if(ch.isEmpty()){
            return true;
        }
       return false;
    }
}
