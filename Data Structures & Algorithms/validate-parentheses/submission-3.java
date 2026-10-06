class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[',']');
        map.put('{','}');

        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i< s.length(); i++){
            if(map.containsKey(s.charAt(i))) stack.push(s.charAt(i));
            else{
                if(stack.isEmpty()) return false;
                if(map.get(stack.pop()) != s.charAt(i)) return false;
            }
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
}
