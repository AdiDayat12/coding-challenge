import java.math.BigInteger;
class Solution {
    public static int charToDigit (char c){
        char[] numsChar = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < numsChar.length; i++) {
            if (c == numsChar[i]) {
                return i;
            }
        }
        return 0;
    }

    public static BigInteger toInt(String s) {
        BigInteger result = BigInteger.ZERO;
        for (int i = 0; i < s.length(); i++) {
            int digit = charToDigit(s.charAt(i));
            result = result.multiply(BigInteger.TEN).add(BigInteger.valueOf(digit));
        }
        return result;
    }

    public String multiply(String num1, String num2) {
        BigInteger int1 = toInt(num1);
        BigInteger int2 = toInt(num2);
        BigInteger result = int1.multiply(int2);
        return result.toString();
    }
    }
