class Solution {

    public String encode(List<String> strs) {
        // String originalStr = "Mayank Bansal"
        StringBuilder sb = new StringBuilder();
        for(String s : strs)
        {
          sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
       int i = 0;
       List<String> list = new ArrayList<>();
       while(i < str.length())
       {
          int len = 0;
          while(str.charAt(i) != '#')
          {
            len = len * 10 + (str.charAt(i) - '0');
            i++;
          }

          // SKIP THE "#"
          i++;

          list.add(str.substring(i, i + len));
          i += len;
        }
        return list;
    }
}
