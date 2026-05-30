class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] arr = new int[26];

        for(int i = 0;i<s.length();i++)
        {
            char cS = s.charAt(i);
            arr[cS - 'a']++;

            char cT = t.charAt(i);
            arr[cT - 'a']--;
        }

        for(int count : arr)
        {
            if(count != 0) return false;
        }
        return true;
    }
}
