package JavaConcepts;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentWaysToIterateOverArrayList {
    public static void main(String[]args){
        List<String> courses= Arrays.asList("c","c++","Java","Hibernate");

        //basic for loop
        for(int i=0;i<courses.size();i++){

            System.out.println("courses at: "+i+" index is "+courses.get(i));
        }
        System.out.println("=============================================");
//Enhanced for-each loop
        for(String CoursesName:courses){
            System.out.println(CoursesName);

        }
        //Iterator
        System.out.println("=============================================");
        Iterator itr=courses.iterator();
        while(itr.hasNext()){
            String courseType= (String) itr.next();
            System.out.println(itr.next());
            System.out.println("=============================================");
            System.out.println(courseType);
        }

//basic for loop with iterator
        System.out.println("=============================================");
        for(Iterator iterator=courses.iterator();iterator.hasNext();){
            String coursesList= (String) iterator.next();
            System.out.println(coursesList);
        }
        System.out.println("=============================================");
        //Java8 Stream + lambda
        courses.stream().forEach(course->System.out.println(course));
        System.out.println("=============================================");
        //Java8 forEach + lambda
        courses.forEach(course->System.out.println(course));









    }
}
