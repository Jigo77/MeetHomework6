public class MeetWork18 {
    /* 18.1 Declare your council name as static variables.
 18.2 Declare your house number as instance variables.
 18.3 Declare one instance method name borough() and call Static variable
  18.4 Declare static method name address() and call instance variable
  18.5 Call both user defined methods into main method.
*/
    static String council = "Harrow";
    int house = 5;

    public void borough(){
        System.out.println("The council in instance method :"+council);

    }
    public static void address(){
        MeetWork18 mm4 = new MeetWork18();
        System.out.println("The House number in Static method is :"+mm4.house);
    }

    public static void main(String[] args) {
        MeetWork18 m4 = new MeetWork18();
        m4.borough();
        address();
    }
}
