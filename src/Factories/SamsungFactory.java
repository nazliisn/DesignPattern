package Factories;

import Telephone.Telephone;
import Telephone.*;

public class SamsungFactory implements TelephoneFactory {
    @Override
    public Telephone makeTelephone(String telephoneModel) {
        switch (telephoneModel) {
            case "Galaxy A02":
                return new Galaxy_A02();

            case "Galaxy A72":
                return new Galaxy_A72();

            case "Galaxy S20 FE":
                return new Galaxy_S20FE();

            case "Galaxy Z Flip3":
                return new Galax_Z_Flıp3();


            default:
                return null;

        }
    }
}
