class Solution {
    class Tupple{
        int x1;
        int count;
        public Tupple(int x1, int count){
            this.x1 = x1;
            this.count = count;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Tupple> pq = new PriorityQueue<>((a,b) -> Integer.compare(b.count, a.count));
        for(var x: nums){
            map.putIfAbsent(x, 0);
            map.put(x, map.get(x) + 1);
        }
        for(var entry: map.entrySet()){
            pq.offer(new Tupple(entry.getKey(), entry.getValue()));
        }

        int[] result = new int[k];
        for(int i = 0; i<k;i++){
            result[i] = pq.poll().x1;
        }
        return result;
    }
}
