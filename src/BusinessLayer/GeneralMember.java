package BusinessLayer;

public class GeneralMember extends Member {
    private double discount = 0.3;

    public GeneralMember(String name, double discount){
        super(name);
    }

    public double getDiscount() {
        return 1;
    }
}
