class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int len = arr.length;
        int [] prefix = new int [len];

        prefix[0] = arr[0];
        for (int i = 1; i < len; i++) {
            prefix[i] = prefix[i - 1] ^ arr[i];
        }

        int [] result = new int[queries.length];

        if (len == 1) {
            for(int i  = 0; i < result.length; i++) {
                result[i] = arr[0];
            }
            return result;
        }
        int index = 0;
        for (int [] q : queries) {
            if (q[0] == 0) {
                result[index] = prefix[q[1]];
            } else {
                result[index] = prefix[q[1]] ^ prefix[q[0] - 1];
            }
            index++;
        }
        
        return result;
    }
}