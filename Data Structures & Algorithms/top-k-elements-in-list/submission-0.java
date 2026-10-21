class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> recurance = new HashMap<>();
        for (int num : nums){
            recurance.put(num, recurance.getOrDefault(num, 0) + 1);
        }

        List<int[]> elements = new ArrayList<>();
        
        for (Map.Entry<Integer, Integer> entry : recurance.entrySet()) {
            int number = entry.getKey();
            int count = entry.getValue();
            
            elements.add(new int[]{number, count});
        }

        elements.sort((a, b) -> Integer.compare(b[1],a[1]));

        int[] x = new int[k];
        for (int i = 0; i < k; i++) {
            x[i] = elements.get(i)[0];
        }

        return x;
    }
}
