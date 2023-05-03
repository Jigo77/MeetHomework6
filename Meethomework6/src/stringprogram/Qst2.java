package stringprogram;

public class Qst2 {
    //Write a java program which remove extra space from both side “ I love
    //java ”
    //Expected output: “I love java”
    static String a = "   I LOVE JAVA   ",b;

    public static void main(String[] args) {
        jar();
    }
    public static void jar(){
        b=a.trim();
        System.out.println(b);
    }

}
