public class MeetWork7 {
    /*Write a program to insert any temperature value in degree
    Fahrenheit and convert to degree Celsius ((F − 32) × 5/9 = 0°C). */
    double ss;
    int f = 15;

    public static void main(String[] args) {
        MeetWork7 mp3 = new MeetWork7();
        mp3.deg();

    }
    public void deg(){
        ss=((f-32) * 5/9);
        System.out.println("The degree Celsius is :"+ss +"C");
    }

}
