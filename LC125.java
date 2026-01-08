class Solution {
    public boolean isPalindrome(String s) {
        int i;
        String h="";
        for(i=0;i<s.length();i++){
           if( Character.isLetterOrDigit(s.charAt(i))&&s.charAt(i)!=' '){
         
            h+=Character.toLowerCase(s.charAt(i));
           }
        }
        System.out.print(h);
        String y="";
        for(i=h.length()-1;i>=0;i--){
            y+=h.charAt(i);
        }
        if(h.contains(y)){
            return true;
        }
        
        return false;
        
    }
}
