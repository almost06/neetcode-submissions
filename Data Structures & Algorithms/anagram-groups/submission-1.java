class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        ArrayList<List<String>> result = new ArrayList<>();
        for(var s: strs){
            String x = sortString(s);
            if(!map.containsKey(x)){
                ArrayList<String> arr = new ArrayList<>();
                arr.add(s);
                map.put(x, arr);
                result.add(arr);
            }else{
                map.get(x).add(s);
            }
        }
        return result; 
    }

    public String sortString(String str){
        var arr = str.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }

    
}
