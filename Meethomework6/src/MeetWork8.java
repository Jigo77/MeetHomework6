public class MeetWork8 {
    /*Write a program to insert any temperature value in degree
        Fahrenheit and convert to degree Celsius ((F − 32) × 5/9 = 0°C). */
    double ss;

    public static void main(String[] args) {
        MeetWork8 mp3 = new MeetWork8();
        mp3.deg(44);

    }
    public void deg(int f){
        ss=((f-32) * 5/9);
        System.out.println("The degree Celsius is :"+ss +"C");
    }


}
