public class VolksFactory implements CarFactory{
    @Override
    public SedanCar buildSedanCar(){
        return new Voyage();
    }
    
    @Override
    public HatchCar buildHatchCar(){
        return new Gol();
    }
}
