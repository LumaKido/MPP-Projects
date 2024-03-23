public class Application {
    private HatchCar hatchCar;
    private SedanCar sedanCar;

    public Application(CarFactory factory){
        hatchCar = factory.buildHatchCar();
        sedanCar = factory.buildSedanCar();
    }

    public void showInformation(){
        sedanCar.showSedanInformation();
        hatchCar.showHatchInformation();
    }
}
