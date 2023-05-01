public class MeetWork5 {
    /*Write a program for a calculator with addition, subtraction, multiplication, and division
    methods all with parameters and use string concatenation methods.
     (Note: Two static  and Two instance methods.)  */
    public static void main(String[] args) {
        MeetWork5 mm3 = new MeetWork5();
        mm3.addition(5,6);
        mm3.sub(10,5);
        mul(3,5);
        div(15,3);

    }
    public void addition(int a,int b){
        System.out.println("The addition of "+a +" and " +b +" is :"+(a+b));

    }
    public void sub(int c,int d){
        System.out.println("The Subtriction of "+c +" and " +d +" is :"+(c-d));
    }



    public static void mul(int e,int f){
        System.out.println("The Multification of "+e +" and " +f +" is :"+(e*f));
    }

    public static void div(int g,int h){
        System.out.println("The Divison of "+g +" and " +h +" is :"+(g/h));
    }



}
