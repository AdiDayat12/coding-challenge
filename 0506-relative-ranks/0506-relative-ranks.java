class Solution {
    public String[] findRelativeRanks(int[] score) {
        int [] ori = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            ori[i] = score[i];
        }

        Arrays.sort(score);
        List<String> strings = new ArrayList<>();
        for (int j : score) {
            strings.add(String.valueOf(j));
        }

        String [] result = new String[score.length];
        int len = strings.size() - 1;

        for (int i = 0; i < ori.length; i++) {
            if (ori[i] == Integer.parseInt(strings.get(len))){
                result[i] = "Gold Medal";
            } else if (ori[i] == Integer.parseInt(strings.get(len - 1))) {
                result[i] = "Silver Medal";
            } else if (ori[i] == Integer.parseInt(strings.get(len - 2))) {
                result[i] = "Bronze Medal";
            } else {
                result[i] = String.valueOf(len - strings.indexOf(String.valueOf(ori[i])) + 1);
            }
        }
        return result;
    }
}