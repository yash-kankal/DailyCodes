class Solution {
    public boolean isPalindrome(int x) {

        int finalNumber = x;

        int reverse = 0;

        while(x > 0)
        {

            int digit = x % 10 ;

            reverse = (reverse * 10) + digit;

            x = x / 10 ;

        }

        if(reverse != finalNumber)
        {
            return false;
        }

        return true;
        
    }
}