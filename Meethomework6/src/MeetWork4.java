public class MeetWork4 {

    /* 4.1 Declare two instance and two static variables.
 4.2 Declare one instance method.
 4.3 Declare one static method.
 4.4 Call all four instance and static variables into both instance and static methods inside the  print statement.
 4.5 Declare the Main method.
 4.6 Call both instance and static methods into the Main method and run the programme.
*/
    int a=8,b=4;
    static String n = "Meet",m="Patel";

    public void num(){
        System.out.println("The First Number is :"+a);
        System.out.println("The Second number is :"+b);
        System.out.println("The First Name is :"+n);
        System.out.println("The Last Name is :"+m);

    }
    public static void add(){
        MeetWork4 mm2 = new MeetWork4();
        System.out.println("The First Static number is :"+mm2.a);
        System.out.println("The Second Static number is :"+mm2.b);
        System.out.println("The First Static Name is :"+n);
        System.out.println("The Second Static Name is :"+m);

    }

    public static void main(String[] args) {
        MeetWork4 mm3 = new MeetWork4();
        mm3.num();
        add();
    }

}
