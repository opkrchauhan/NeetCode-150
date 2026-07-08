class Solution {

    public String encode(String[] arr) {
        if (arr.length == 0)
            return "";

        StringBuilder sb = new StringBuilder();

        for (String s : arr) {
            sb.append(s.length()).append("/:");
            sb.append(s);
        }

        return sb.toString();
    }

    public ArrayList<String> decode(String s) {
        ArrayList<String> ans = new ArrayList<>();

        int i = 0;

        while (i < s.length()) {

            int j = i;

            while (!(s.charAt(j) == '/' && s.charAt(j + 1) == ':')) {
                j++;
            }

            int len = Integer.parseInt(s.substring(i, j));

            j += 2;

            ans.add(s.substring(j, j + len));

            i = j + len;
        }

        return ans;
    }
}