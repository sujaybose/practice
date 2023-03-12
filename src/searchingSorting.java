import java.util.Arrays;

public class searchingSorting {
    public static int binarySearch(int[] array, int key){
        Arrays.sort(array);
        int first=0, last=array.length-1, mid;
        mid = (first + last) / 2;

        while(array[first]<=array[last]){
            if(key<array[mid]){
                last=mid-1;
            }
            else if(key==array[mid]){
                System.out.println("Item found");
                return mid;
            }
            else{
                first=mid+1;
            }
            mid=(first+last)/2;
        }
        if(array[first]>array[last]){
            System.out.println("array not sorted");
        }
        System.out.println("Item not found");
        return 0;
    }

    public static void main(String[] args) {
        int [] arra= {2,4,5,6,7,8,9};
        System.out.println(binarySearch(arra, 5));
    }
}
