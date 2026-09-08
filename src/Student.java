public class Student {

    // All the attributes should be private
    public String FN;
    public String LN;
    public int Sid;
    //   public double gpa;

    // Concept - Encapsulation = Controlling the access of attributes and methods
    private double gpa;


    // How many parameters = 0
    Student(){
        this.FN = "No first name";
        this.LN = "No last name";
        this.Sid = 0;
        this.gpa = 0.0;
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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
//        this.gpa = gpa;
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Invalid GPA value");
        }
    }
}
