package Laptop;



public abstract class MSI extends Laptop{
    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public double cost() {
        return 0;
    }

    @Override
    public void prepareLaptop() {
        introduce();
        prepareCertificate();
        settingWindows();
        LaptopControl();
    }

    public void introduce(){

        System.out.println("Product features are introduced");
    }

    public void prepareCertificate(){

        System.out.println("Preparing warranty certificate");
    }

    public void settingWindows(){
        System.out.println("Operating system Windows is installed");
    }
    public void LaptopControl(){
        System.out.println("Laptop is charging and working");
    }
}
