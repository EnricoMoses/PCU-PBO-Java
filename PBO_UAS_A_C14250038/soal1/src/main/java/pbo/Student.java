package pbo;

public class Student {
    private String nrp;
    private double uts;
    private double test;
    private double uas;
    private double praktikum;

    public Student(String nrp, double uts, double test, double uas, double praktikum) {
        this.nrp = nrp;
        this.uts = uts;
        this.test = test;
        this.uas = uas;
        this.praktikum = praktikum;
    }

    public String getNrp() {
        return nrp;
    }

    public double getUts() {
        return uts;
    }

    public double getTest() {
        return test;
    }

    public double getUas() {
        return uas;
    }

    public double getPraktikum() {
        return praktikum;
    }

}
