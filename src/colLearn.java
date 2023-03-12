import java.util.*;

public class colLearn {

    public static void main(String[] args) {
        colLearn cl = new colLearn();
//       System.out.println(cl.mapMethod(10).toString());
//       cl.linList();
//       cl.setTree();
        cl.mapMethod();
    }

    //HashMap entry
    void mapMethod() {
        Map hm = new TreeMap();
        hm.put(10, "Sujay");
        hm.put(11, "Bose");
        hm.put(13, "abc");
        hm.put(9, "Rajesh");
        System.out.println(hm.get(13));
//       return (hm.get(num));
//       for(Map.Entry<> it: hm.entrySet()){}

        Iterator<Map.Entry> it= hm.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer, String> et= it.next();
            System.out.println("Key:"+ et.getKey()+",Value:"+ et.getValue());
        }
    }

    //LinkedList entry
    void linList(){
        LinkedList ls= new LinkedList<String>();
        ls.add("sujay");
        ls.add("Kumar");
        ls.add("Bose");
        ls.remove("Bose");
//        ls.add(1234);
        ls.addAll(2,ls); //it adds the collection
        for(Iterator it= ls.iterator(); it.hasNext();){
            System.out.print(it.next());
        }

    }
    //TreeSet entry
    void setTree() {
        Set st = new TreeSet();
        st.add("first");
        st.add("second");
        st.add("Third");
        st.add("Fourth");
        st.add("Third");
        System.out.println(st.add("Third")); //to check the boolean value return

        Iterator it= st.iterator(); //We are creating object referencing Iterator interface and pointing to the Set class implementation
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}

