import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;

//Find number of words using HashMap in a string
public class intQuest {

    String s; //to use this keyword we had to create this String beforehand

    int noWords (String s){
        this.s = s;
        String words=" ";
        int wordsCount=0;
        int index=0;
        s= s+" ";
        Map hm= new HashMap();
        for (int i=0; i<s.length();i++){
            if(s.charAt(i)!= ' '){
                words=words+s.charAt(i);
            }
            else{
                hm.put(index,words);
                words="";
                index++;
            }

        }
        wordsCount=hm.size();
        System.out.println(hm);

        return wordsCount;
    }

    //Using array
    int words(String s){
        String[] st= s.split(" ");
        Map mp= new HashMap();
        for (int i = 0; i <st.length ; i++) {
            mp.put(i,st[i]);

        }
        return mp.size();
    }

    //palindrome check
    void palinDrome(String s){
        StringBuilder rev= new StringBuilder();
        rev.append(s);
        rev= rev.reverse();
        System.out.println(rev);
        if(s.contentEquals(rev)){
            System.out.println("It's a Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }

    //Fibbonacci series

    int[] fib(int x) {
        int a=0, b=0, c=1;
        int arr[]=new int[x];
        System.out.println("Fibbonacci series of numbers:");
        for(int i=0; i<x; i++){
            a=b;
            b=c;
            c=a+b;
            System.out.println(a+" ");
            arr[i]=a;

        }
        return arr;
    }



    public static void main(String[] args) {
        intQuest iq= new intQuest();
        Scanner sc= new Scanner(System.in);
        System.out.println(Arrays.toString(iq.fib(6)));
        //iq.palinDrome(sc.nextLine());
        //System.out.println(iq.words(sc.nextLine()));
    }
}
