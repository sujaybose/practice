import java.util.Arrays;
import java.util.Scanner;

public class primeSum {
    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int[] a=primeSum(num);
        System.out.println(a[0]);
        System.out.println(a[1]);
    }

    static boolean checkPrime(int num){
        for (int i = 2; i <= num/2; i++) {
            if(num%i==0){
                return false;
            }
            else return true;
        }
        return false;
    }
    static int[] primeSum(int num){
        int a;
        int[] arra= new int[2];
        for(a=2; a<=num/2; a++){
            int b= num-a;
            if(checkPrime(a) && checkPrime(b)){
                System.out.println("It's a prime");
                arra[0]=a;
                arra[1]= num-a;
                return arra;
                }
            }
        System.out.println("It's not a prime");
        return arra;
    }
}
