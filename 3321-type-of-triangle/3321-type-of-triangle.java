class Solution {
    public String triangleType(int[] nums) {
        int side1 = nums[0];
        int side2 = nums[1];
        int side3 = nums[2];
        int side12 = side1 + side2;
        int side13 = side1 + side3;
        int side23 = side2 + side3;
        Boolean isTrue = (side12 > side3) && (side13 > side2) && (side23 > side1);
        if (side1 == side2 && side2 == side3 && isTrue){
            return "equilateral";
        } else if ((side1 == side2|| side2 == side3 ||
        side1 == side3) && isTrue){
            return "isosceles";
        } else if ((side1 != side2) && (side2 != side3) && (side1 != side3) && isTrue){
                return "scalene";
        } else{
            return "none";
        }
    }
}