class Solution {
    public boolean isPalindrome(String s) {

        char[]a=s.toUpperCase().toCharArray();

        int i=0;
        int j=a.length-1;

        while(i<j){

            while(i<j && !Character.isLetterOrDigit(a[i])){
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(a[j])){
                j--;
            }

            if(a[i]!=a[j]){
                return false;
            }
            i++;
            j--;

        }
        return  true;
        
    }
}