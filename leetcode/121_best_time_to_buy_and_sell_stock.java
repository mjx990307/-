/**
 * LeetCode 121. Best Time to Buy and Sell Stock
 * Time: O(n), Space: O(1)
 */
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int best = 0;
        for (int p : prices) {
            if (p < minPrice) {
                minPrice = p;
            } else {
                best = Math.max(best, p - minPrice);
            }
        }
        return best;
    }
}
