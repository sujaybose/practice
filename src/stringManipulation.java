import java.util.Scanner;

public class stringManipulation {

    public static int countChar(String s){
        char[] array= s.toCharArray();
        int num= array.length;
        return num;
    }
    public static void main(String[] args) {
        System.out.println("Enter the string to count the characters:\n");

        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        System.out.println("Total number of chars:"+ countChar(s));
    }
}
