class Solution {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1){
            return stones[0];

        } else if (stones.length == 0){
            return 0;
        }
        
        for (int stone : stones){
            maxHeap.offer(stone);
        }

        int x, y;
        while (maxHeap.size() > 1){
            x = maxHeap.poll();
            y = maxHeap.poll();

            if (x > y){
                maxHeap.offer(x-y);
            } else if (x < y){
                maxHeap.offer(y-x);
            }
        }

        if (maxHeap.size() == 1){
            return maxHeap.poll();
        }
        return 0;
    }
}
