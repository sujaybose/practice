public class exceptionLearn {
    public static void main(String[] args) {
        System.out.print("Returned Value is: "+method1());

    }

    static String learnException(int num) {
        if (num == 1) {
            try {
                throw new IndexOutOfBoundsException();
                //return ("TrySuccessful");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Unchecked Exception block");
                return ("Unchecked Exception");

            } finally {
                //return ("finallyBlock");
                System.out.println("Finally block executed");
            }
        } else {
            System.out.print("I am loving it");
            return ("elseblock");
        }

    }

//Throw is when we want to intentionally throwing an exception
//thows is to suppress any exception, but it does not handle the exception

    public static int method1() {
        int value = 1;
        String s= null;
        try{
            System.out.println(s.length()); //Null exceptions occured
            throw new ArrayIndexOutOfBoundsException(); //this will not get executed
        }
        catch(ArrayIndexOutOfBoundsException e){
            value = 2;
            System.out.println("Exception caught value is "+ value);
            return value; // value is being returned inside catch
        }
        catch(NullPointerException e){
            value=3;
            System.out.println("Null Pointer Exception caught value is "+ value);
            return value;
        }
        finally{
            value = 4;
            System.out.println("Finally value is now "+ value);
            return value; // value is being returned inside finally
        }

    }
}
