class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }

        for (int i =2 * n - 1; i >= 0; i--) {
            int j=nums[i%n];
            while (!stack.isEmpty() && stack.peek() <= j) {
                stack.pop();
            }
            if (i<n&&!stack.isEmpty()) {
                result[i]=stack.peek();
            }
            stack.push(j);
        }

        return result;
    }
}
   