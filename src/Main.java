
// Java uses four access modifiers - public, private, protected, _ (default)
/* Access modifiers are applicable to attributes, constructors, setters and getters, methods*/
// public = accessible from Everywhere
// private = accessible from inside the class
//https://github.com/07DavidAdeola/COSC113_Modifiers.git

public class Main {
    public String Test;
    protected int Test_int;
    private double Test_double;
    boolean Test_boolean;

    Main(){}

    public Main(String Teet){
        this.Test = Test;
    }

    private Main(String Test,double Test_double){
        this.Test = Test;
        this.Test_double = Test_double;
    }

    public void main() {
        System.out.println("Hello Main!");
    }

        public void main(String args){
            System.out.println("Hello Main!");
    }

    // You can create overloaded constructors by varying 1) the parameter number,2) order
    public static void main( String[] args){
        Student s8, s9,s10;
        s8 = new Student();
    //     s8.gpa = 4.0;
    //     s8.gpa -3.1;
//        s8.setFN = ("Praise");
//        s8.setLN = "Ben";
//        s8.setGpa(3.8);

        System.out.println("Praise Ben is:" + s8.getGpa());




        // Code from Sept 3rd
        Student s6 = new Student();
        // Setting names
//        s6.FN = "Melanie";
//        s6.SetLN("Thomas");
//        s6.LN = "Simpson";

        Student s4 = new Student("Helena", "Payton");
//        System.out.println(s4.FN);
//        System.out.println(s4.LN);
//        System.out.println(s4.Sid);
        System.out.println("---------------------");
        // Variable s1 is of Student type
        Student s1;
        s1 = new Student();
        System.out.println(s1);
//        System.out.println(s1.FN);

        Student s2;
        s2 = new Student("Tobiloba", "Ayodeji", 14141);
//        System.out.println(s2.FN);
//        System.out.println(s2.LN);

        Student s3;
        String FN = "Miguel";
        String LN = "Gascortega";
        int Sid = 31415;
        s3 = new Student(FN, LN, Sid);
//        System.out.println(s3.FN);
//        System.out.println(s3.LN);

        Student s5;
        s5 = new Student(FN, LN, Sid);
    }
}
