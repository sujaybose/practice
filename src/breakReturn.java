//The break statement, terminates the closest enclosing iteration statement or switch statement.
// The continue statement starts a new iteration of the closest enclosing iteration statement.
// The return statement: terminates execution of the function in which it appears and returns control to the caller.
public class breakReturn {

    public static void main(String[] args) {
        for (int i = 0; i < 2 ; i++) {

            for (int j = 0; j < 10; j++) {
                //Return break all the for loops
                if (j == 8) {
                    return;
                }
                //Continue only takes you to the next element
                if (j == 4) {
                    continue;
                }
                //break discontinues the existing loop
                else if (j == 6) {
                    break;
                }
                System.out.println(j);
            }
        }
    }
}
