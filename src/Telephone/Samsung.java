package Telephone;

public class Samsung extends Telephone {


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
        informationAndroid();
        telephoneControl();

    }

    public void prepareCertificate() {

        System.out.println("Preparing warranty certificate");
    }

    public void informationAndroid() {

        System.out.println("Entering Android information");
    }

    public void telephoneControl() {
        System.out.println("Phone is charging and working");
    }


}
