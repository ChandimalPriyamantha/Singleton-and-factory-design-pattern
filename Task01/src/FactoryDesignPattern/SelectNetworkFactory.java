package FactoryDesignPattern;

public class SelectNetworkFactory {

   public CellularPlan getPlan(String planType){

       if(planType == null){
           return  null;
       }
       if(planType.equalsIgnoreCase("AbcNetwork")){
           return  new AbcNetwork();

       } else if (planType.equalsIgnoreCase("PqrNetwork")) {
           return  new PqrNetwork();

       } else if (planType.equalsIgnoreCase("XyzNetwork")) {
           return new XyzNetwork();
       }
       return null;
   }
}
