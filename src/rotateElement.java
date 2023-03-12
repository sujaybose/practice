//https://www.javatpoint.com/java-program-to-left-rotate-the-elements-of-an-array
public class rotateElement {

    public static void main(String[] args) {
        int [] arr = {2,4,3,4,5,6,7,8,9};
        int [] arr2= rotate(arr, 2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("array elelemt"+i+ ": " + arr2[i]);
        }

    }

    public static int[] rotate(int[] array, int count){
        int ln= array.length, first;
        for (int i = 0; i < count ; i++) {
            first = array[0];
            for(int j=1; j < ln; j++){
                if(j<ln-1) {
                    array[j-1] = array[j];
                }
                if(j==ln-1){
                    array[j]=first;
                }
            }

        }

        return array;
    }
}
