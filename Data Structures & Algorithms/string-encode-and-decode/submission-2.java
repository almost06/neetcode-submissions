class Solution {

    public String encode(List<String> strs) {
        String[] ar = new String[strs.size()];
        int count = 0;
        StringBuilder x = new StringBuilder();
        for(var s: strs){
            for(int i = 0; i< s.length(); i++){
                var c = s.charAt(i);
                x.append(((char) (c+1)));
            }
            x.append("\n");
            ar[count] = x.toString();
            count++;
        }
        return x.toString();
         
    }

    public List<String> decode(String str) {
        ArrayList<String> l = new ArrayList<>();
        Scanner x = new Scanner(str);
        while(x.hasNextLine()){
            StringBuilder x1 = new StringBuilder();
            String s = x.nextLine();
            
            for(int i = 0; i< s.length(); i++){
                var c = s.charAt(i);
                x1.append((char)(c-1));
            }

            if(s.isEmpty()) l.add("");
            else l.add(x1.toString());
        }
        return l;
    }   
}
