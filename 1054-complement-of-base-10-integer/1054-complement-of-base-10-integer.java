class Solution {
    public int bitwiseComplement(int n) {
        String complement = Integer.toBinaryString(n).replaceAll("1", "5")
                .replaceAll("0", "1").replaceAll("5", "0");
        return Integer.parseInt(complement, 2);
    }
}