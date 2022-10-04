package JavaConcepts;

public class WrapperClasses {
    public static void main (String[] args){
   // int a=10;

    // ob1=new Integer(a);boxing
        // ob1= Integer.valueOf(10);
   // int b=ob1.intValue();//Unboxing
   // System.out.println(b);
        //JDK 1.5

        int a=10;
        Integer ob1=a;//AutoBoxing
        System.out.println(ob1);
        int b=ob1;//AutoUnboxing
        System.out.println(b);



}
}
