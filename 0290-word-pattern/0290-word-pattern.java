class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] pieces = s.split("\\s+");
        if(pattern.length() != pieces.length) {
            return false;
        }
        Map<String, String> mapping = new HashMap<>();
        Map<String, String> revMapping = new HashMap<>();
        for(int i = 0; i < pattern.length(); i++) {
            if(!cacheAndCheckMapping("" + pattern.charAt(i), pieces[i], mapping) 
                || !cacheAndCheckMapping(pieces[i], "" + pattern.charAt(i), revMapping)) {
                return false;
            }
        }
        return true;
    }

    private boolean cacheAndCheckMapping(String key, String value, Map<String, String> mapping) {
        if(mapping.containsKey(key)) {
            if(!mapping.get(key).equals(value)) {
                return false;
            }
        } else {
            mapping.put(key, value);
        }
        return true;
    }
}