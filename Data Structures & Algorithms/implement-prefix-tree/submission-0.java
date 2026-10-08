class PrefixTree {
    class Node{
        Node[] nodes; 
        boolean stop;
        public Node(){
            nodes = new Node[26];
            stop = false;
        }
    }
    Node[] list;

    public PrefixTree() {
        list = new Node[26];
    }

    public void insert(String word) {
        Node[] arr = list;
        for(int i = 0; i < word.length(); i++){
           var n = arr[word.charAt(i)-'a'];
           if(n==null){
            arr[word.charAt(i)-'a'] = new Node();
           }
           if(i == word.length() -1) arr[word.charAt(i)-'a'].stop = true;
           arr = arr[word.charAt(i)-'a'].nodes;
        }
    }

    public boolean search(String word) {
        Node[] arr = list;
        for(int i = 0; i < word.length(); i++){
           var n = arr[word.charAt(i)-'a'];
           if(n==null){
            return false;
           }
            if(i == word.length() -1 && arr[word.charAt(i)-'a'].stop == true) return true;
           arr = arr[word.charAt(i)-'a'].nodes;
        }
        return false;
    }

    public boolean startsWith(String word) {
        Node[] arr = list;
        for(int i = 0; i < word.length(); i++){
           var n = arr[word.charAt(i)-'a'];
           if(n==null){
            return false;
           }
           arr = arr[word.charAt(i)-'a'].nodes;
        }
        return true;
    }
}
