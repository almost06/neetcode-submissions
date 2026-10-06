class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<String, Integer>, List<String>> map = new HashMap<>();
        ArrayList<List<String>> result = new ArrayList<>();
        for(var s: strs){
            HashMap<String, Integer> secondMap = new HashMap<>();
            if(s.isEmpty()) secondMap.put("", 1);
            for(var c: s.toCharArray()){
                if(!secondMap.containsKey(String.valueOf(c))) {secondMap.put(String.valueOf(c), 1);}else{
                    secondMap.put(String.valueOf(c), secondMap.get(String.valueOf(c)) + 1);
                }
            }
            if(!map.containsKey(secondMap)){
                ArrayList<String> arr = new ArrayList<>();
                arr.add(s);
                map.put(secondMap, arr);
                result.add(arr);
            }else if(map.containsKey(secondMap)){
                map.get(secondMap).add(s);
            }
        }  
        return result;
    }
}
