public class staticLearn {

    static final int a=1;
    static final String s= "Pune";

    static String method(){
        return "Hi";
    }

    public static void main(String[] args) {
        //a=3; static final variable can not be reassigned.
        //s="Kolkata";

        System.out.println(a);
        System.out.println(method());
    }
}
