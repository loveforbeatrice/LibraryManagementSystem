package BusinessLayer;

public class StudentWithoutScholar extends Member {
    private double discount = 0.3;

    public StudentWithoutScholar(String name, double discount){
        super(name);
    }

    public double getDiscount() {
        return 0.2;
    }


}
