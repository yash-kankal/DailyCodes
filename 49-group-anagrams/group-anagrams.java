class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        
        HashMap<String, List<String>> map = new HashMap<>();

        for( int i = 0; i < strs.length; i++ )
        {
            String word = strs[i];

            char[] wordArray = word.toCharArray();

            Arrays.sort(wordArray);

            String key = new String(wordArray);

            if(!map.containsKey(key))
            {
                map.put(key, new ArrayList());
            }

            map.get(key).add(word);
        }
        

        return  new ArrayList<>(map.values());


        
    }
}