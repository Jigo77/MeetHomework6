public class MeetWork13 {
    /*Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
Expected Output:
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20 */

    static float wid = 5.6f,hei=8.5f;
    public static void main(String[] args) {
        MeetWork13 mp4 = new MeetWork13();
        mp4.are();
        per();

    }
    public void are(){
        System.out.println("Area is "+wid +" * "+hei +" = " + (wid*hei));
    }
    public static void per(){

        System.out.println("Perimeter is 2 * ("+wid +" + "+hei +") = "+(2*(wid+hei)) );

    }

}
