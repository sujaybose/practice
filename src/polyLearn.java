public class polyLearn {
    final int num=0; //final variables are work as a constant you can not modify them
    int num2;
    polyLearn(){
        System.out.println("I am polylearn constructor");
        num2= 5;
    }
    //this doesn't get used as only changing the return type won't consider the overloaded method
    polyLearn(int a){
        System.out.println("I am overloaded constructor"+ a);
    }
    int polyLearn(int a){
        System.out.println("I am overloaded constructor"+ a+2);
        return a+2;
    }

    void xyz (String b){
        System.out.println("I am in parent Polylearn class under xyz method");
    }
    static void abc(int a, String b){
        System.out.println("I am in parent Polylearn class under static abc method");
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        polyLearn pl= new polyLearn();
        pl.polyLearn(2);
        //System.out.println(pl.polyLearn(2));
        //Creating object of abstact class and implementing the abstract method here itself
        janina jn= new janina() {
            @Override
            void methodNew() {
                System.out.println("The method had to implement while creating object");
            }
        };
        jn.methodNew();

        janina ip= new impleAbstract();
        ip.methodNew();
        inf obj1= new intImplement();
        obj1.who();
    }

}

class impleAbstract extends janina{
    @Override
    void methodNew() {
        System.out.println("Abstract method implemented");

    }
}
abstract class janina {
    int i = 0;
    abstract void methodNew();

    void fullMethod() {
        System.out.println("Full method in abstract class");

    }
}

class overrideKnow extends polyLearn{
    static void abc(int t, String s){
        System.out.println("Iam in child class of polylearn: overrideKnow under static abc method");
    }
    void xyz(String z){
        //num=8; // this is not possible as num is a final variable
        System.out.println("I am child abc class: overrideKnow under xyz method: " + num);
    }
    public static class inner_demo{
        static int getInt(int i){
            System.out.println("Print from static inner class: "+ i);
            return i;
        }
    }

    public static void main(String[] args) {
        // creating parent class obeject reference and mapping to new child class object
        polyLearn pl= new overrideKnow();
        pl.abc(40, "sujay"); //this shows how dynamic polymorphism doesn't work in case of static method, here it becomes method hiding
        pl.xyz("bose");
        // creating child class obeject reference and mapping to new child class object
        overrideKnow lp= new overrideKnow();
        pl.abc(12, "Sreyanshi"); //this shows how dynamic polymorphism doesn't work in case of static method, child class becomes hidden
        pl.xyz("bose");

        intImplement im= new intImplement();
        im.who();

        //Inner static class call
        System.out.println(overrideKnow.inner_demo.getInt(5));
    }
}

interface inf{
    int age=12;
    String name="Sreyank";
    void who();
}

class intImplement implements inf{

    int age= 13; //it's possible here and the parent varible gets hidden
    @Override
    public void who() {
        System.out.println("My name is "+name+" and my age is "+age);
    }
}