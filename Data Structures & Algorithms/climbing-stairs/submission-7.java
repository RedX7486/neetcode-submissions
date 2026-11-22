class Solution {
    
    Map<Integer,Integer> memo = new HashMap<>();
    public int fib(int a){
        if (a <= 1){
            return 1;

        } else if (memo.containsKey(a)){
            return memo.get(a);
        }

        int b = fib(a-2) + fib(a-1);

        memo.put(a,b);

        return b;
    }
    
    public int climbStairs(int n) {

        return fib(n);
    }
}
