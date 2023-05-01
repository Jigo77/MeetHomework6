public class MeetWork6 {
    /*Write a program to enter any radius value of the circle and
    find out the area. (Formula  of Area A=PI*r*r).  */
    int r=5;
    double pi=3.14d;
    double a;

    public static void main(String[] args) {
        MeetWork6 m45 = new MeetWork6();
        m45.form();

    }
    public void form(){
        a = (pi*r*r);
        System.out.println("The Final Value is :"+a);

    }

}
