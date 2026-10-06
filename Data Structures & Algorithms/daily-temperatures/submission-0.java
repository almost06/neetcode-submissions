class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        ArrayDeque<Integer> ind = new ArrayDeque<>();
        for(int i = 0; i <temperatures.length; i++){
            var current = temperatures[i];
            while(!deque.isEmpty() && deque.peekFirst() < current){
                    deque.poll();
                    var str = ind.poll();
                    temperatures[str] = i - str; 
            }
            deque.push(temperatures[i]);
            ind.push(i);
        }
        while(!ind.isEmpty()){
            temperatures[ind.poll()] = 0;
        }
        return temperatures;
    }
}
