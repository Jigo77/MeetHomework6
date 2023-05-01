public class MeetWork1 {
    /*1. Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement. 1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and run the programme.

    */
    int a = 10;
    String name ="Meet";
    public static void main(String[] args) {
        MeetWork1 mp = new MeetWork1();
        mp.num();

    }

    public void num(){
        System.out.println("The Number is  :"+a);
        System.out.println("The Name is :"+name);
    }
}
