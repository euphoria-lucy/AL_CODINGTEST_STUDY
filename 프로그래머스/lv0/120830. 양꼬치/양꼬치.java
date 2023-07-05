class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int stick = 0;
        int drink = 0;
        int remain = 0;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                stick = n * 12000;
                drink = (k - n / 10) * 2000;
            }
        }
        answer = stick + drink;
        
        return answer;
    }
}