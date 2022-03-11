package Telephone;

public abstract class Iphone extends Telephone {


    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public double cost() {
        return 0;
    }

    @Override
    public void prepareTelephone() {
        prepareCertificate();
        informationIOS();
        telephoneControl();
    }

    public void prepareCertificate() {

        System.out.println("Preparing warranty certificate");
    }

    public void informationIOS() {

        System.out.println("Entering iOS information");
    }


    public void telephoneControl() {
        System.out.println("Phone is charging and working");
    }


}
