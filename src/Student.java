public class Student {

    String FN;
    String LN;
    int Sid;

    // How many parameters = 0
    Student(){
        this.FN = "No first name";
        this.LN = "No last name";
        this.Sid = 0;
    }

    // Methods = Getters and Setters
    public String getFN() {
        return FN;
    }

    public void setFN(String FN) {
        this.FN = FN;
    }

    public String getLN() {
        return LN;
    }

    public void setLN(String LN) {
        this.LN = LN;
    }

    public int getSid() {
        return Sid;
    }

    public void setSid(int sid) {
        Sid = sid;
    }


//    Student(String FN, String LN){
//        this.FN = FN;
//        this.LN = LN;
//}


    Student(String FN, String LN){
        this.FN = FN;
        this.LN = LN;
    }


    // How many parameters = 3
    Student(String FN, String LN, int Sid){
//        this.FN = FN;
//        this.LN = LN;
        this(FN,LN);
        this.Sid = Sid;
    }


    // You can create overloaded constructors by varying 1) the parameter number,2) order
    public static void main(String[] args) {

        Student s6 = new Student();
        // Setting names
        s6.FN = "Melanie";
        s6.SetLN("Thomas");
        s6.LN = "Simpson";

        Student s4 = new Student("Helena", "Payton");
        System.out.println(s4.FN);
        System.out.println(s4.LN);
        System.out.println(s4.Sid);
        System.out.println("---------------------");
        // Variable s1 is of Student type
        Student s1;
        s1 = new Student();
        System.out.println(s1);
        System.out.println(s1.FN);

        Student s2;
        s2 = new Student("Tobiloba", "Ayodeji", 14141);
        System.out.println(s2.FN);
        System.out.println(s2.LN);

        Student s3;
        String FN = "Miguel";
        String LN = "Gascortega";
        int Sid = 31415;
        s3 = new Student(FN, LN, Sid);
        System.out.println(s3.FN);
        System.out.println(s3.LN);

        Student s5;
        s5 = new Student(FN, LN, Sid);
    }
}
