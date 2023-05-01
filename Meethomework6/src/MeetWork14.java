public class MeetWork14 {
    /*Write a Java program to print the sum (addition), multiply, subtract, divide and  remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output:
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */
    static int a = 125,b=24,c,d,e;
    static double f,g;

    public static void main(String[] args) {
        add();
        sub();
        mul();
        div();
        mod();
    }
    public static void add(){
        c=a+b;
        System.out.println(" "+a +" + " +b+" = " +c);

    }
    public static void sub(){
        d=a-b;
        System.out.println(" "+a +" - " +b+" = " +d);

    }
    public static void mul(){
        e=a*b;
        System.out.println(" "+a +" * " +b+" = "+e);

    }
    public static void div(){
        f=a%b;
        System.out.println(" "+a +" / " +b+" = " +f);

    }

    public static void mod(){
        g=a/b;
        System.out.println(" "+a +" % " +b+" = " +g);

    }




}
