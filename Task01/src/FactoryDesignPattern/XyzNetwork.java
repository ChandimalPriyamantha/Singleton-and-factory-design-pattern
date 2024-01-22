package FactoryDesignPattern;

public class XyzNetwork extends CellularPlan{

    void getRate(){
        rate = 1.75;
    }

    @Override
    public void processBill(int minutes) {
        super.processBill(minutes);
    }
}
