public class MeetWork20 {
    /* 20.1 Declare your Spain as static variable.
 20.2 Declare your United Kingdom as instance variable.
 20.3 Declare instance method name homeCountry()and call static variable.
 20.4 Declare static method name holidays() and call instance variable
 20.5 Call both methods in main method.
*/

    static String coun = "Spain";
    String country = "United Kingdon";
    public void homecountry(){

        System.out.println("The static country in instance method is :"+coun);

    }
    public static void holiday(){
        MeetWork20 m = new MeetWork20();
        System.out.println("The instance country in static method is :"+m.country);

    }

    public static void main(String[] args) {
        MeetWork20 m2 = new MeetWork20();
        m2.homecountry();
        holiday();
    }
}
