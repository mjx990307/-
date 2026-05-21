import java.util.ArrayDeque;
import java.util.Deque;

/**
 * LeetCode 20. Valid Parentheses
 * Time: O(n), Space: O(n)
 */
class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(')
                        || (c == ']' && top != '[')
                        || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
