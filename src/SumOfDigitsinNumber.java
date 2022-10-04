import java.util.Scanner;

public class SumOfDigitsinNumber {
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Please enter a number:");
int num=sc.nextInt();
int sum=0;
int temp=0;
temp=num;

while(num!=0){

    sum=sum+num%10;
    num=num/10;

}
System.out.println("Sum of the digits in a number is: "+sum);




    }



}
