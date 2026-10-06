class Solution {
    public int minAddToMakeValid(String s) {
        int max=0,min=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(')min++;
            else 
            {
                if(min>0)min--;
                else max++;
            }
        }
        return Math.abs(max+min);
    }
}