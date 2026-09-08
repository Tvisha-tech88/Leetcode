class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        helper(n,0,0, new StringBuilder(), result);
        return result;
    }

    void helper(int n, int open, int close, StringBuilder sb, List<String> result){
        if(open == n && close == n){
            result.add(sb.toString());
            return;
        }
        if(open < n ){
            sb.append("(");
            helper(n, open +1, close, sb, result);
            sb.setLength(sb.length() -1);
        }
        if(close < open){
            sb.append(")");
            helper(n, open, close+1, sb, result);
            sb.setLength(sb.length() -1); 
        }


    }
}