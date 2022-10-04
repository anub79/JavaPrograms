import java.util.Scanner;

public class CountNumberofDigits {
    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num=sc.nextInt();
        int count=0,temp;
        temp=num;
        while(num!=0){

            num=num/10;
            count++;
        }
        System.out.println("Number of digits in "+temp+"is:"+count);

    }
}
