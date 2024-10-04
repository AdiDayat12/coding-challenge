class Solution {
    public long dividePlayers(int[] skill) {
       Arrays.sort(skill);
        long chemistry = 0;
        int value = skill[0] + skill[skill.length - 1];

        int left = 0;
        int right = skill.length - 1;
        for (int i = 0; i < skill.length / 2; i++) {
            int total = skill[left] + skill[right];
            if (total != value) {
                return -1;
            }
            chemistry = chemistry + skill[left] * skill[right];
            left++;
            right--;
        }
        return chemistry; 
    }
}