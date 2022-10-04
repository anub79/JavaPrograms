import java.util.Scanner;

public class EvenOddDigitsinNumber {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num=sc.nextInt();
        int count=0,temp,rem;
        int oddNum = 0,evenNum = 0;
        temp=num;
        while(num!=0){
            rem=num%10;

            if(rem%2==0){
                evenNum++;
            }else{
                oddNum++;
            }
            num=num/10;
        }
            System.out.println("The number of even digits in a number are:- "+evenNum);
            System.out.println("The number of odd digits in a number are:- "+oddNum);

        }
    }

