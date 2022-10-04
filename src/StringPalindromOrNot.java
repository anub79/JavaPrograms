public class StringPalindromOrNot {
    public static void main(String args[]) {
        checkPlindrome("madam");
          checkPlindrome("Civil");
        checkPalindromeNumber(121);
        checkPalindromeNumber(144);
    }

    public static void checkPlindrome(String str) {
        int length = str.length();
        String rev = "";
        for (int i = length-1; i >= 0; i--) {

            rev = rev + str.charAt(i);

        }
        System.out.println("The reversed string is:" + rev);
        if (rev.equals(str)) {
            System.out.println("The String is a Palindrome String "+" "+ rev + " " + str);
        } else {
            System.out.println("The String is not a Palindrome String"+" "+ rev + " " + str);

        }
    }

    public static void checkPalindromeNumber(int num) {
        int r,sum = 0,temp;
        temp=num;
        while(num>0){
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }

}


