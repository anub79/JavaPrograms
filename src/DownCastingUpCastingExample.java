public class DownCastingUpCastingExample {
    public static void main(String []args){
        Parent1 p= new ChildClass();
        p.name="Shubham";

        //implicit casting is not possible
       // ChildClass c= new Parent1();
        ChildClass c=(ChildClass) p;
        
        p.showMessage();

        System.out.println(p.name);

        System.out.println(c.name="Priya");
        Parent1 q= new Parent1();
        q.name="Rani";

        //ChildClass c1=(ChildClass) q;
        q=(Parent1)new ChildClass();
        System.out.println(q.name);
        q.showMessage();

    }
}
