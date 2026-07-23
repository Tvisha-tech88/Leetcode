class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] freq = new int[10];

        for(int digit : digits){
            freq[digit]++;
        }

        ArrayList<Integer> res = new ArrayList<>();

        for(int num =100; num <=999; num+=2){
            int hun = num/100;
            int ten = (num % 100)/ 10;
            int one = num %10;

            int[] need = new int[10];

            need[hun]++;
            need[ten]++;
            need[one]++;

            boolean possible =true;

            for(int i=0; i<10; i++){
                if(need[i] > freq[i]){
                    possible = false;
                    break;
                }
            }
            if(possible){
                res.add(num);
            }
            

        }

       int[] ans = new int[res.size()];

       for(int i=0; i<res.size(); i++){
        ans[i] = res.get(i);
       }

       return ans;

        
    }
}