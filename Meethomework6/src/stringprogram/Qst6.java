package stringprogram;

public class Qst6 {
    //Write a java program which replace a “I@love@java” to “we love java”
    //Expected output: We love java
    static String a = "I@love@Java";

    public static void str(){
        a=a.replace("I@love@Java","WE Love Java");
        System.out.println(a);

    }

    public static void main(String[] args) {
        str();
    }
}
