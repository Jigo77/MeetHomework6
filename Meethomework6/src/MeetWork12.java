public class MeetWork12 {
    /* Write a Java program that takes three numbers as input to calculate and print the  average of the numbers. */
    static double d;
    public static void main(String[] args) {
        ave(4,8,12);
    }
    public static void ave(int a,int b,int c){
        
        d = (a+b+c) / 3;
        System.out.println("The average of 3 number is :"+d);
        
    }
}
