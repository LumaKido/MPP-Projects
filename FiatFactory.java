public class FiatFactory implements CarFactory{
    @Override
    public SedanCar buildSedanCar(){
        return new Siena();
    }
    
    @Override
    public HatchCar buildHatchCar(){
        return new Palio();
    }
}
