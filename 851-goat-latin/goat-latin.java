class Solution {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String curr = words[i];
            char first = curr.charAt(0);

            
            if (first == 'a' || first == 'A' ||
                first == 'e' || first == 'E' ||
                first == 'i' || first == 'I' ||
                first == 'o' || first == 'O' ||
                first == 'u' || first == 'U') {

                curr = curr + "ma";
            } else {
                curr = curr.substring(1) + first + "ma";
            }

            
            curr += "a".repeat(i + 1);

            ans.append(curr);

           
            if (i != words.length - 1) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}