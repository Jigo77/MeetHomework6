public class MeetWork3 {
    /*

    * 3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the  print statement.
3.5 Declare the Main method.
 3.6 Call both instance and static methods into the Main method and run the programme.
*/
    int a = 10;
    static String name = "Meet";

    public static void main(String[] args) {
        MeetWork3 mp1 = new MeetWork3();
        mp1.num();
        nam();

    }
    public void num(){
        System.out.println("The Number is :"+a);
        System.out.println("The name is :"+name);
    }
    public static void nam(){
        MeetWork3 mm = new MeetWork3();
        System.out.println("The Static number is :"+mm.a);
        System.out.println("The Static name is :"+name);
    }

}
