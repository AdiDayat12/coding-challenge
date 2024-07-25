class Solution {
    public static int[] sortArray(int[] nums) {
        sort(nums, 0, nums.length - 1);
        return nums;
    }

    static void sort(int[] arr, int left, int right) {
        if (left < right){
            int mid = left + (right - left) / 2;

            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    static void merge (int [] arr, int left, int mid, int right){
        int len1 = mid - left + 1;
        int len2 = right - mid;

        int [] arr1 = new int[len1];
        int [] arr2 = new int[len2];

        for (int i = 0; i < len1; i++) {
            arr1[i] = arr[i + left];
        }
        for (int i = 0; i < len2; i++) {
            arr2[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = left;

        while (i < len1 && j < len2){
            if (arr1[i] < arr2[j]){
                arr[k++] = arr1[i++];
            }
            else {
                arr[k++] = arr2[j++];
            }
        }

        while (i < len1){
            arr[k++] = arr1[i++];
        }
        while (j < len2){
            arr[k++] = arr2[j++];
        }
    }
}