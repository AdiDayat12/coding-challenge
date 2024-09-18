class Solution {
    public boolean halvesAreAlike(String s) {
       int half = s.length() / 2;
        String s1 = s.substring(0, half).replaceAll("[^aiueoAIUEO]", "");
        String s2 = s.substring(half).replaceAll("[^aiueoAIUEO]", "");
        return s1.length() == s2.length(); 
    }
}