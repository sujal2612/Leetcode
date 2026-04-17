class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            answer[i]=0;
        }

        stack.push(n - 1);

        for (int i = n - 2; i >= 0; i--) {
            while (!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                answer[i]=stack.peek()-i;
            }

            stack.push(i);
        }

        return answer;
    }
}