class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Character>st=new Stack<>();
        int count=0;
        int depth=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){st.push(ch);
            depth++;
            }
            else{
                st.pop();
                depth--;
                if(s.charAt(i-1)=='('){
                count+=(int)Math.pow(2,depth);
            }
        }
        }
        return count;
    }
}