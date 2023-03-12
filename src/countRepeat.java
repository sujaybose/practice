//https://www.javatpoint.com/java-program-to-find-the-frequency-of-each-element-in-the-array
public class countRepeat {

    public static void main(String[] args) {
        int[] array1= {1,2,3,5,2,3,3,6,3,4,7,8,4,6};
        int[] array2= repeatCount(array1);
        for (int i = 0; i < array2.length; i++) {
            if(array2[i]!=-1){
                System.out.println("number:"+ array1[i]+" repeat:"+array2[i]);
            }
        }


    }

    public static int[] repeatCount(int [] array){
        int ln= array.length, visited=-1;
        int [] array2= new int[ln];
        for (int i = 0; i < ln; i++) {
            int count=1;
            for (int j = i+1; j < ln; j++) {
                if(array[i]==array[j]){
                    count++;
                    array2[j]=visited;
                }
            }
            if(array2[i]!=visited) {
                array2[i]=count;
            }

        }
        return array2;
    }
}
