public class MeetWork11 {
/*Write a Java program to compute the specified expressions and print the output. Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output: 2.138888888888889 */

    public static void main(String[] args) {
        fin();

    }

    public static void fin(){
        double a = 25.5,b=3.5,c=40.5,d=4.5,e;
        e=(((a*b)- b * b) / (c-d));
        System.out.println("Expected Output : "+e);
    }

}
