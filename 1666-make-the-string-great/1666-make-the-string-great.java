class Solution {
    public String makeGood(String s) {
        Stack<Character> good = new Stack<>();
        for (char c : s.toCharArray()){
            if (!good.isEmpty() && Math.abs(good.peek() - c) == 32){
                    good.pop();
            }else {
                good.push(c);
            }
        }
        StringBuilder result = new StringBuilder();
        for (char c : good) {
            result.append(c);
        }
        return result.toString();
    }
}