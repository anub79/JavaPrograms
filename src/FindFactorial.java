public class FindFactorial {
    public static int fact(int num){
  //4!=4*3*2*1
        int fact=1;
        if(num==0){
            return 1;
        }
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
    //Recursive function
    public static int rec_fact(int num){
        int fact;
        if(num==0){
            return 1;
        }else{
            return fact=num*(fact(num-1));

    }
    }
        public static void main(String [] args){
        System.out.println(fact(5));
        System.out.println(rec_fact(3));
    }
}
