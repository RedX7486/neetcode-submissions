class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int x = 0;
        List<Integer> total = new ArrayList<>();
        total.add(0);
        total.add(0);

        for (int i = 2; i <= cost.length; i++){
            total.add(Math.min(total.get(i-1) + cost[i-1], total.get(i-2) + cost[i-2]));

        }

        return total.get(total.size()-1);
    }
}
