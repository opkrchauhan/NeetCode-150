class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {

        Map<String, String> map = new HashMap<>();

        // Store knowledge
        for (List<String> li : knowledge) {
            map.put(li.get(0), li.get(1));
        }

        String st3 = "";

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {

                int j = i + 1;

                while (s.charAt(j) != ')') {
                    j++;
                }

                String key = s.substring(i + 1, j);

                if (map.containsKey(key)) {
                    st3 = st3 + map.get(key);
                } else {
                    st3 = st3 + "?";
                }

                i = j;
            } 
            else {
                st3 = st3 + s.charAt(i);
            }
        }

        return st3;
    }
}