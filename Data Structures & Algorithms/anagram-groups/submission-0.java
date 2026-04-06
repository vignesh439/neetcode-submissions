class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        Map<String, List> map = new HashMap<>();

        for(String str : strs) {
            List innerList;

            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);

            if(map.containsKey(s)) {
                innerList = map.get(s);
                innerList.add(str);
                map.put(s, innerList);
            }
            else {
                innerList = new ArrayList<>();
                innerList.add(str);
                map.put(s, innerList);
            }
        }

        for(String str : map.keySet()) {
            List innerList = map.get(str);
            list.add(innerList);
        }

        return list;
    }
}
