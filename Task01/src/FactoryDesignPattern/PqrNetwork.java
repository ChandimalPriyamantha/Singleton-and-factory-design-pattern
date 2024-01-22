package FactoryDesignPattern;

public class PqrNetwork extends CellularPlan {

    void getRate(){
        rate = 1.50;
    }

    @Override
    public void processBill(int minutes) {
        super.processBill(minutes);
    }
}
