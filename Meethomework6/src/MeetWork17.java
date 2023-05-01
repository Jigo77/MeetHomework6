public class MeetWork17 {
    /* 17.1 Declare your city as instance variables.
 17.2 Declare your country as static variables.
 17.3 Declare one instance method and call static variable in print statement
 17.4 Declare static method and call instance variable in print Statement.
 17.5 Call both user defined methods into main method.
*/
    String city = "London";
    static String country = "UK";
    public void add(){
        System.out.println("The country in instant method is :"+country);
    }
    public static void sub(){
        MeetWork17 mmm3 = new MeetWork17();
        System.out.println("The City in Static Method is :"+mmm3.city);
    }

    public static void main(String[] args) {
        MeetWork17 mp3 = new MeetWork17();
        mp3.add();
        sub();
    }
}
