public class MeetWork16 {

    /*16. Write a Java Program to print as below. (All details to be stored in variable)
"+------------------------+"
"| |"
"| CORNER STORE |"
"| |"
"| 2015-03-29 04:38PM |"
"| |"
"| Gallons: 10.870 |"
"| Price/gallon: $ 2.89 |"
"| |"
"| Fuel total: $ 22.71 |"
"| |"
"+------------------------+"
*/
    static String a="CORNER STORE",b="2015-03-29",c="04 :38PM",d="Gallons: ";
    static String e="Price/gallon: $ ",f="Fuel total: $ ";
    static double i = 10.870,j=2.89,o=22.71;

    public static void main(String[] args) {
    str();
    }

    public static void str(){
        System.out.println("``+--------------------------+``");
        System.out.println("``|                          |``");
        System.out.println("``|   "+a +"           |``");
        System.out.println("``|                          |``");
        System.out.println("``|  "+b +"  " +c+"    |``");
        System.out.println("``|                          |``");
        System.out.println("``|  "+d +"  " +i+"        |``");
        System.out.println("``|  "+e +" " +j +"   |``");
        System.out.println("``|                          |``");
        System.out.println("``|  "+f +" "+o +"    |``");
        System.out.println("``|                          |``");
        System.out.println("``+--------------------------+``");

    }


}
