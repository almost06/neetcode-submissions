class MinStack {

    private ArrayDeque<Integer> ar;
    private LinkedList<Integer> l;
    private int min = Integer.MAX_VALUE;

    public MinStack() {
        ar = new ArrayDeque<>();
        l = new LinkedList<>();
    }
    
    public void push(int val) {
        if(val <= min){
            min = val;
            l.addFirst(val);
        }
        ar.push(val);
    }
    
    public void pop() {
        var p = ar.pop();
        if(p == min){
            l.removeFirst();
            if(!l.isEmpty()){ min = l.getFirst();}else{
                min = Integer.MAX_VALUE;
            }
        }
    }
    
    public int top() {
        return ar.peekFirst();
    }
    
    public int getMin() {
        return l.getFirst();
    }
}
