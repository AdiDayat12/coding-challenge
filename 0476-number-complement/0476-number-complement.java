class Solution {
    public int findComplement(int num) {
        String bin = Integer.toBinaryString(num);
        String result = bin.replaceAll("0", "5")
                .replaceAll("1", "0")
                .replaceAll("5", "1");
        return Integer.parseInt(result, 2);
    }
}