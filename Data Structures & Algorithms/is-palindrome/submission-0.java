class Solution {
    public boolean isPalindrome(String s) {
        String new_s=s.replaceAll("[^a-zA-Z0-9\\s]", "");
        String new_s1=new_s.replace(" ","");
        String s1=new_s1.toLowerCase();

        int pointer=s1.length()-1;

        for(char i:s1.toCharArray())
        {
            if(i==s1.charAt(pointer))
            {
                pointer--;
            }
            else{return false;}            
        }
        return true;
    }
}
