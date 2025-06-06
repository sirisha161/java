import java.util.Scanner;
public class palindromesubstring{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String input=sc.nextLine();
        int count=0;
        int len=input.length();
        System.out.println("palindrome sub sequences/strings");
        for(int i=0;i<len;i++){
            for(int j=i+1;i<=len;j++){
                String sub=input.substring(i,j);
                if(ispalindrome(sub))
                {
                    System.out.println(sub);
                    count++;
                }
            }
        }
            System.out.println("Total palindrome substrings:" +count);
            sc.close();
    }
        public static boolean ispalindrome(String str){
            int left=0;
            int right=str.length()-1;
            while(left<right){
              if(str.charAt(left)!=str.charAt(right))
              {
                return false;
              }  
              left++;
              right--;
            }
            return true;
        }
}