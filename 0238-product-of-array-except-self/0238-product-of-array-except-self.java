
class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] answer = new int[n];

        int product = 1;

        // Left side product
        for (int i = 0; i < n; i++) {

            answer[i] = product;

            product = product * nums[i];
        }

        // Right side product
        product = 1;

        for (int i = n - 1; i >= 0; i--) {

            answer[i] = answer[i] * product;

            product = product * nums[i];
        }

        return answer;
    }
}
