package Laptop;

public  class Lenova extends Laptop{
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
        settingLinux();
        LaptopControl();


    }

    public void introduce(){

        System.out.println("Product features are introduced");
    }

    public void prepareCertificate(){

        System.out.println("Preparing warranty certificate");
    }

    public void settingLinux(){
        System.out.println("Operating system Linux is installed");
    }
    public void LaptopControl(){
        System.out.println("Laptop is charging and working");
    }
}
