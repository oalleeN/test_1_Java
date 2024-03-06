package ex03.app3.entt3;

public class Student {
    public String name;
    public double n1;
    public double n2;
    public double n3;

    public double sumNote() {
        return n1 + n2 + n3;
    }
    public String toString(){

        String line = "-a";
        if (sumNote() < 60) {
            line = "FINAL GRADE: "
                    + String.format("%.2f%n", sumNote())
                    + String.format("%s%n",situationStudent())
                    + "MISSING "
                    + String.format("%.2f", quantityRemaining())
                    + " POINTS";
            return line;

        }else {
            line = "FINAL GRADE: "
                    + String.format("%.2f%n", sumNote())
                    + situationStudent() ;
            return line;
        }
    }
    public String situationStudent() {
        if (sumNote() >= 60.00) {
            return "Pass";
        } else {
            return "Failed";
        }
    }
    public double quantityRemaining() {
        if (sumNote() < 60) {
            return 60.0 - sumNote();
        } else {
            return 0.0;
        }
    }
}
