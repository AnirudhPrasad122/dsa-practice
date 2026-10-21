class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > num * 9) {
            return "";
        }
        int k = sum / 9;
        sum %= 9;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < k; i++) {
            ans.append('9');
        }
        if (sum > 0) {
            ans.append(sum);
        }
        for (int i = ans.length(); i < num; i++) {
            ans.append('0');
        }
        return ans.toString();
    }
}