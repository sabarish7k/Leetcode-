class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character>st=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push('(');
                count++;
            }
            else if(s.charAt(i)==')'){
                if(!st.isEmpty()){
                    if(st.pop()=='('){
                        count--;
                    }
                    else{
                        st.push(')');
                        count++;
                    }
                }
                else{
                    st.push(')');
                    count++;
                }
           
        }
        
    }
    return count;
}
}
