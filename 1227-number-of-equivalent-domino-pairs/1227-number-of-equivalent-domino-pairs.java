class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        for (int i = 0; i < dominoes.length; i++) {
            int a = dominoes[i][0];
            int b = dominoes[i][1];
            if (a > b){
                a = a ^ b;
                b = a ^ b;
                a = a ^ b;
            }
            dominoes[i][0] = a;
            dominoes[i][1] = b;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int [] domino : dominoes){
            int key = domino[0] * 10 + domino[1];
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int total = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            int value = entry.getValue();
            int equivalent = value * (value - 1) / 2;
            total += equivalent;
        }
        return total;
    }
}