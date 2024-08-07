class Solution {
    public int findComplement(int num) {
        String bin = Integer.toBinaryString(num);
        String result1 = bin.replaceAll("0", "5");
        String result2 = result1.replaceAll("1", "0");
        String finalResult = result2.replaceAll("5", "1");
        return Integer.parseInt(finalResult, 2);
    }
}