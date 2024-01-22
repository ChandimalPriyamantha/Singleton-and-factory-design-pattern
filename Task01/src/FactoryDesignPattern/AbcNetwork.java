package FactoryDesignPattern;

public class AbcNetwork extends CellularPlan{

    void getRate(){
        rate = 1.25;
    }

    @Override
    public void processBill(int minutes) {
        super.processBill(minutes);
    }


}

