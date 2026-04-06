class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(char ch: t.toCharArray()) {
            if(map.containsKey(ch)) {
                int val = map.get(ch);
                if(val == 0) {
                    return false;
                }
                map.put(ch, val-1);
            }
            else {
                return false;
            }
        }

        return true;
    }
}
