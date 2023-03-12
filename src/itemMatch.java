import java.util.List;

public class itemMatch {
    public static void main(String[] args) {
        itemMatch it= new itemMatch();
        System.out.println(it.item());
    }
    int item(){
        int item1, item2, item3=0;
        int [] array1={2,3,4,5,6,7};
        int [] array2={11,22,33,4,55,66};
        int [] array3={123,321,345,324,4};
        int matchedItem=0;
        for (int i = 0; i < array1.length; i++) {
            item1= array1[i];
            for (int j = 0; j < array2.length; j++) {
                item2= array2[j];
                if(item1==item2) {
                    for (int k = 0; k < array3.length; k++) {
                        item3= array3[k];
                        if(item2==item3){
                            matchedItem= item3;
                            System.out.println("The matched item: "+matchedItem);
                            return matchedItem;
                        }

                    }

                }

            }

        }
        System.out.println("No item matched");
        return matchedItem;
    }
}
