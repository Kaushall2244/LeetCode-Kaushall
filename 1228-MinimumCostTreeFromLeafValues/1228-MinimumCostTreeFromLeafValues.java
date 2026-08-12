// Last updated: 8/12/2026, 12:07:41 PM
class Solution {
    public int mctFromLeafValues(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(Integer.MAX_VALUE);

        int cost = 0;

        for (int num : arr) {
            while (stack.peek() <= num) {
                int mid = stack.pop();
                cost += mid * Math.min(stack.peek(), num);
            }
            stack.push(num);
        }

        while (stack.size() > 2) {
            cost += stack.pop() * stack.peek();
        }

        return cost;
    }
}