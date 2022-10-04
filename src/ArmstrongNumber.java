import java.util.Scanner;

public class ArmstrongNumber {
public static void main(String[]args) {
    //Check Armstrong number or not
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a number: ");
    int num=sc.nextInt();
if(num==1 || num==0){
    System.out.println("Provided number Should be greater than 0 and 1");
}
    int temp=0,rem=0,arm=0;
    temp=num;
    while(num!=0 || num>1){
        rem=num%10;
        arm=(rem*rem*rem)+arm;
        num=num/10;
    }
System.out.println(arm);

 if(temp==arm){
 System.out.println(arm+" is armstrong number");
 }else{
System.out.println(arm+" is not an armstrong number");

}
}
}
