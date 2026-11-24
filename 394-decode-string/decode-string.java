class Solution {
    public String decodeString(String s) {
        Stack<Integer> nums = new Stack<>();
        Stack<String> strings = new Stack<>();

        int num=0;
        String current = "";

        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                num = num*10 + (ch -'0');
            }
            else if(ch =='['){
                nums.push(num);
                strings.push(current);

                num =0;
                current = "";
            }
            else if(ch ==']'){
                int count = nums.pop();
                String prev = strings.pop();

                String temp = "";

                for(int i=0; i<count; i++){
                    temp += current;
                }
                current = prev + temp;
            }
            else{
                current+= ch;
            }
        }
        return current;
    }
}