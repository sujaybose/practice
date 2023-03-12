import java.util.Scanner;

public class test {
        public boolean isPalindrome(int x) {
            int a=0, b=x;
            while (b>0){
                a = a*10 + b%10;
                b=b/10;
            }
            System.out.println(a);
            if(a==x){
                return true;
            }
            else return false;
        }

    public static void main(String[] args) {
        test ab= new test();
        Scanner sc = new Scanner(System.in);
        int i= Integer.parseInt(sc.next());
        System.out.println("Is it a palindrome number: "+ab.isPalindrome(i));
    }

}
