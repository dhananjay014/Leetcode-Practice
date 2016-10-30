public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> S1 = new ArrayList<String>();
        for(int i = 1; i <= n; i++ ) {
            if (i%5==0 && i%3 == 0) {
                S1.add("FizzBuzz");
            } 
            else if (i%5==0) {
                S1.add("Buzz");
            }
            else if (i%3==0) {
                S1.add("Fizz");
            }
            else {
                S1.add(Integer.toString(i));
            }
        }
        return S1;
    }
}
