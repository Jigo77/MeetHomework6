public class MeetWork19 {
    /* 19.1 Declare one of your group member names as instance variable.
 19.2 Declare one of your group member names as static variable.
 19.3 Declare one instance method name with group name (e.g. selenium())and call both global  variables.
 19.4 Declare static method name agile() and call both variable
 19.5 Call both user defined methods into main method.
Note: Declare 1 local variables in all user defined method and main method and print in to statement
*/
    String name = "Vidhi";
    static String name1 = "Situ";

    public void selenium(){
        int a = 10;
        System.out.println("The instance name is in instance method  :"+name);
        System.out.println("The Static name is in instance method :"+name1);
        System.out.println("The local variable in instance method :"+a);


    }
    public static void agile(){
        int b = 20;
        MeetWork19 m42 = new MeetWork19();
        System.out.println("The instance name is in static method :"+m42.name);
        System.out.println("The static name is in static method :"+name1);
        System.out.println("The local variable in static method :"+b);
    }

    public static void main(String[] args) {
        MeetWork19 m22 = new MeetWork19();
        int s = 25;
        System.out.println("The local variable in main method is :"+s);
        m22.selenium();
        agile();
    }

}
